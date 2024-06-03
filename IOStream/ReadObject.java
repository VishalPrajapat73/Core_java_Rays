package in.co.IOStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\visha\\Desktop\\ioStream\\vk.ser");
		ObjectInputStream in = new ObjectInputStream(file);
		
		TestSerializable t = (TestSerializable)in.readObject();
		System.out.println(t.name);
		System.out.println(t.maths);
		System.out.println(t.physics);
		System.out.println(t.chemistry);
		
		 
		in.close();
		file.close();
	}
}
