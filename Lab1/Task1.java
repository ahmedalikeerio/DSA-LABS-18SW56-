class Employe{
	Double salary,hours;
	//creating getinfo method for initialization of salary and hours of work per day
	public void getInfo(double salary,double hours){
		this.salary=salary;
		this.hours=hours;
	}
	//creating method for adding 10$ to salary of employe if it is greater 500$
	public void addSalary(){
		if (salary>500) {
			salary+=10;
		}
	}
	//creating method for adding 5$ to employe salary whose hours of work per days are greater than 5.
	public void addWorkHourBonus(){
		if (hours>5) {
			salary+=5;
		}
	}
		//now creating method for printing final salary.
		public void printFinalSalary(){
			System.out.println("Final salary of employe is: "+salary);
		}
	}
//End of employe class
//creating main class
public class Task1{
	//creating main method
	public static void main(String[] args) {
		Employe e1=new Employe();
		e1.getInfo(510,8);
		e1.addSalary();
		e1.addWorkHourBonus();
		e1.printFinalSalary();
	}//End of main method

}//End of main class
