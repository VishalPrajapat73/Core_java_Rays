package in.coNew;

public class Automobile {
	
	private String Color = null;
	private int Speed = 10;
	private String Make = null;
	
	public void NO_OF_GEARS(int a) {
		System.out.println("Gears in a Automobile is : "+a);
	}
	public String getcolor() {
		System.out.print("The Color of A Car is : ");
		return Color;
	}
	public void setcolor(String color) {
		this.Color = color;
	}
	public String getmake() {
		System.out.print("The Vehicle name is : ");
		return Make;
	}
	public void setmake(String make) {
		this.Make = make;
	}
	public void Break(String Break) {
		System.out.println("press the break : "+Break);
	}
	public void changeGear(int a) {
		System.out.println("Gear will be changed : "+a);
	}
	public void accelerator(String Acc) {
		System.out.println("Press the Accelerator : "+Acc);
	}
	public int getspeed() {
		if(Speed>=100) {
			System.out.print("Stop the Car & The speed of car is : ");
		}else {
			System.out.print("Your car Speed in limit & The Speed of Car is : ");
		}
		return Speed;
	}
	
	
	
	
	public static void main(String[] args) {
		Automobile ab= new Automobile();
		ab.NO_OF_GEARS(5);
		ab.setcolor("White");
		ab.setmake("Fortuner");
		ab.Break("Ok Break is Pressed");
		ab.changeGear(2);
		ab.accelerator("Accelerator is press");
		
		
		
		System.out.println(ab.getcolor());
		System.out.println(ab.getmake());
		System.out.println(ab.getspeed());
	
	}
}
