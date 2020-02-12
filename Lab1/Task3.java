import java.util.Scanner;
class Area{
	double area;
	//creating constructure to initialize both variable
	public Area(double length,double breadth){
		area=length*breadth;
	}
	public double returnArea(){
		return area;
	}
}
class Task3{
	public static void main(String[] args) {
		//local variables
		double length,breadth;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Length: ");
		length=scan.nextDouble();
		System.out.print("Enter Breadth: ");
		breadth=scan.nextDouble();

		Area area=new Area(length,breadth);
		System.out.println("Area of rectangle is: "+area.returnArea());
		
	}
}