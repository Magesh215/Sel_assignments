package week1.day1;

public class Twowheeler {

	
	int NoOfWheels = 4;
	short NoOfMirrors = 3;
	long chassisNumber = 1234566789958l;
	boolean isPunctured = false;
	String bikeName ="Bullet";
	double runningKM= 70.55;

	public static void main(String[] args) {
		
		Twowheeler two = new Twowheeler();
		System.out.println("No of Wheels------"+two.NoOfWheels);
		System.out.println("No of Mirrors---"+two.NoOfMirrors);
		System.out.println("Chassis Number---"+two.chassisNumber);
		System.out.println("Bike is Punctured or not----"+two.isPunctured);
		System.out.println("Bike Name----"+two.bikeName);
		System.out.println("Running kilometer----"+two.runningKM);
	}
}
