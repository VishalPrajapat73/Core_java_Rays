package in.co.IOStream;

import java.io.FileReader;

public class ReatTextFile {
public static void main(String[] args)throws Exception {
	try(FileReader in = new FileReader("C:\\Users\\visha\\Desktop\\ioStream\\filereader.txt")){
		int ch = in.read();
		while(ch!=-1) {
			System.out.print((char)ch);
			ch = in.read();
		
	}
	}
	// Catch exception is running when the file name is not given
//	catch (Exception e) {
//		System.out.println("No exception");
//	}
	
}
}
