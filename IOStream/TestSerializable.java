package in.co.IOStream;

import java.io.Serializable;

public class TestSerializable implements Serializable {
	public String name= null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	
	
	@Override
	public String toString() {
		
		return name+" "+ maths+ " " + physics + " "+ chemistry;
	}
	
	
}
