package sql;

import java.util.Date;
import java.lang.String;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class PersonSerializer {
    static int ID = 1;

    public static void init(Connection con) throws SQLException {
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery("SELECT MAX(ID) from Person;");
        rs.next();
        ID = rs.getInt(1) + 1;
    }

    public static void savePerson(Connection con, Person o)
            throws SQLException {
        PreparedStatement prep = con.prepareStatement(
                "INSERT into Person SET ID=?, " +
                        "name=?, SSN=?, birthDay=?, age=?;");
        int Person_ID = ID++;
        prep.setInt(1, Person_ID);
        prep.setString(1 + 1,
                o.name);
        prep.setString(2 + 1,
                o.SSN);
        prep.setDate(3 + 1,
                new java.sql.Date(o.birthDay.getTime()));
        prep.setInt(4 + 1,
                o.age);
        save_Person_roles(con, o.roles, Person_ID);
        save_Person_vacation(con, o.vacation, Person_ID);
        if (prep.executeUpdate() != 1) {
            System.err.println("couldn't save " + o);
        }
    }

    static void save_Person_roles(Connection con,
            String[] roles,
            int Person_ID)
            throws SQLException {
        if (roles == null)
            return;
        PreparedStatement prep = con.prepareStatement(
                "INSERT into Person_roles (roles," +
                        "Person_ID) values (?, ?);");
        for (String o : roles) {
            prep.setString(1,
                    o);
            prep.setInt(2, Person_ID);
            if (prep.executeUpdate() != 1) {
                System.err.println("couldn't save field roles");
            }
        }
        prep.close();
    }

    static void save_Person_vacation(Connection con,
            Date[] vacation,
            int Person_ID)
            throws SQLException {
        if (vacation == null)
            return;
        PreparedStatement prep = con.prepareStatement(
                "INSERT into Person_vacation (vacation," +
                        "Person_ID) values (?, ?);");
        for (Date o : vacation) {
            prep.setDate(1,
                    new java.sql.Date(o.getTime()));
            prep.setInt(2, Person_ID);
            if (prep.executeUpdate() != 1) {
                System.err.println("couldn't save field vacation");
            }
        }
        prep.close();
    }

    public static Person nextPerson(Connection con,
            ResultSet rs)
            throws SQLException {
        int Person_ID = rs.getInt("ID");
        Person o = new Person();
        o.name = rs.getString("name");
        o.SSN = rs.getString("SSN");
        o.birthDay = rs.getDate("birthDay");
        o.age = rs.getInt("age");
        o.roles = get_Person_roles(con, Person_ID);
        o.vacation = get_Person_vacation(con, Person_ID);
        return o;
    }

    static String[] get_Person_roles(Connection con, int ID)
            throws SQLException {
        String q = "SELECT roles FROM Person_roles WHERE Person_ID=" + ID;
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(q);
        List<String> elements = new ArrayList<String>();
        while (rs.next()) {
            elements.add(rs.getString("roles"));
        }
        rs.close();
        stat.close();
        return (String[]) elements.toArray(new String[0]);
    }

    static Date[] get_Person_vacation(Connection con, int ID)
            throws SQLException {
        String q = "SELECT vacation FROM Person_vacation WHERE Person_ID=" + ID;
        Statement stat = con.createStatement();
        ResultSet rs = stat.executeQuery(q);
        List<Date> elements = new ArrayList<Date>();
        while (rs.next()) {
            elements.add(rs.getDate("vacation"));
        }
        rs.close();
        stat.close();
        return (Date[]) elements.toArray(new Date[0]);
    }
}
