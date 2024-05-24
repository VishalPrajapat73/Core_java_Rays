package in.co.Polymorphism;

public class test1 {
	public static void main (String []args) {
		Bird b = new Bird();
		b.sound();
		Cat c = new Cat();
		c.sound();
		Animal a = new Animal();
		a.sound();
	}
}
