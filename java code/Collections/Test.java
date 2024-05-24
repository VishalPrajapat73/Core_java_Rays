package in.co.Collections;

public class Test {
public static void main(String[] args) {
	Employee e1 = new Employee(1,"abc",10000.00);
	Employee e2 = new Employee(1,"abc",10000.000);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.hashCode() == e2.hashCode());

}
}
