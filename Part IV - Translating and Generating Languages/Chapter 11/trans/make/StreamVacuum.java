package make;

import java.io.*;

public class StreamVacuum implements Runnable {
	StringBuilder buf = new StringBuilder();
	BufferedReader in;
	Thread sucker;
	public StreamVacuum(InputStream in) {
		this.in = new BufferedReader( new InputStreamReader(in) );
	}
	public void start() {
		sucker = new Thread(this);
		sucker.start();
	}
	public void run() {
		try {
			String line = in.readLine();
			while (line!=null) {
				buf.append(line);
				buf.append('\n');
				line = in.readLine();
			}
		}
		catch (IOException ioe) {
			System.err.println("can't read output from process");
		}
	}
	/** wait for the thread to finish */
	public void join() throws InterruptedException {
		sucker.join();
	}
	public String toString() {
		return buf.toString();
	}
}
