package in.co.IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Date;

public class InputFromKeyboard {
	public static void main(String[] args) throws Exception {
		
		// Read frm keyboard
		
//		InputStreamReader r  = new InputStreamReader(System.in);
//		BufferedReader in = new BufferedReader(r);
//		
//		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\visha\\Desktop\\ioStream\\KEyboardInput.txt"));
//		
//		String line = in.readLine();
//		while(!line.equals("quit")) {
//			out.println(line);
//			line = in.readLine();
//		}
//		out.close();
//		in.close();
		
		
		File f = new File("C:\\\\Users\\\\visha\\\\Desktop\\\\ioStream\\\\new.txt");
		if(f.exists()) {
			System.out.println("Name : "+f.getName());
			System.out.println("absoulute path : "+f.getAbsolutePath());
			System.out.println("is writable : "+f.canWrite());
			System.out.println("is readable : "+f.canRead());
			System.out.println("is file : "+f.isFile());
			System.out.println("is directory : "+f.isDirectory());
			System.out.println("last modified at  : "+new Date(f.lastModified()));
			System.out.println("size : "+f.length());
		}
		
	}
}
