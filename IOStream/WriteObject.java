package in.co.IOStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args)throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\visha\\Desktop\\ioStream\\vk.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		
		TestSerializable t = new TestSerializable();
		t.name ="Vishal";
		t.maths = 90;
		t.physics = 99;
		t.chemistry = 98;
		
		
		
		
		out.writeObject(t);
		out.close();
		file.close();
		System.out.println("Done");
	
	}
}	
