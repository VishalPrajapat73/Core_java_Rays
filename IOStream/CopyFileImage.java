package in.co.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class CopyFileImage {
	
	public static void main(String[] args)throws Exception {
		
		String source = "C:\\Users\\visha\\Desktop\\food\\images\\2.jpg";
		String target = "C:\\Users\\visha\\Desktop\\food\\images\\22.jpg";
		
		FileInputStream n = new FileInputStream(source);
		FileOutputStream t = new FileOutputStream(target);
		
		
		int ch = n.read();
		while(ch!=-1) {
			t.write(ch);
			ch = n.read();
		}
		n.close();
		t.close();
	
	}
	
}
