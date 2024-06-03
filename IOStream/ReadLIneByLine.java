package in.co.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLIneByLine {
public static void main(String[] args)throws Exception {
	
	
	FileReader file = new FileReader("C:\\Users\\visha\\Desktop\\ioStream\\filereader.txt");
	BufferedReader in  = new BufferedReader(file);
	
	String line = in.readLine();
	
	while(line!=null) {
		System.out.println(line);
		line = in.readLine();
	}
	in.close();
}
}
