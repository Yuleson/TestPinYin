package testFor;

import java.io.IOException;
import java.io.InputStream;

public class TestForBat {

	public static void main(String[] args) {
		String path = "D:\\tracert.bat";
		Runtime rt= Runtime.getRuntime();
		try {
			Process p = rt.exec("cmd.exe /k start " + path);
		    InputStream in = p.getInputStream();
            while (in.read() != -1) {
                System.out.println(in.read());
            }
            in.close();
            p.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
