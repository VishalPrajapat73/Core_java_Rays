package in.co.IOStream;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args)throws Exception {
		
//		FileWriter out  = new FileWriter("C:\\Users\\visha\\Desktop\\ioStream\\file.txt");
//		out.write('A');
//		out.write('\n');
//		out.write("Vishal");
//		out.write("9999");
//		out.write("9");
//		out.close();
//		System.out.println("Check C:\\Users\\visha\\Desktop\\ioStream\\file.txt");
				
		
		// print writer
		
		FileWriter out  = new FileWriter("C:\\Users\\visha\\Desktop\\ioStream\\new.txt");
		
		PrintWriter p = new PrintWriter(out);
		
		for(int i=0;i<=5;i++) {
			p.println(i+" : Vishal");
		}
		p.close();
		out.close();
		
		System.out.println(" 	C:\\Users\\visha\\Desktop\\ioStream");
		
		
	}
}
