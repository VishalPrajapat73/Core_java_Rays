package in.co.IOStream;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {	
		public static void main(String[] args) throws Exception {
			FileReader read = new FileReader("C:\\Users\\visha\\Desktop\\ioStream\\filereader.txt");
			Scanner sc = new Scanner(read);
			
			while(sc.hasNext()) {
				System.out.print(sc.nextLine());
			}
			read.close();
			
		}
}
