package in.co.IOStream;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable  {

	public String id= "Vk";
	public String firstname= "Vishal";
	public String lastname = "Prajapat";
	public double salary = 1000000000;
	

	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(firstname);
		out.writeObject(lastname);
		out.writeDouble(salary);		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=(String)in.readObject();
		firstname=(String)in.readObject();
		lastname=(String)in.readObject();
		salary=in.readDouble();	
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.id);
		System.out.println(e.firstname);
		System.out.println(e.lastname);
		System.out.println(e.salary);
	}
}
