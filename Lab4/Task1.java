import java.util.*;
class Person{

	private String name;
	private int age;
	private char gender;
	private boolean isMarried;

	public Person( String name, int age, char gender, boolean isMarried ){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isMarried = isMarried;
	}

	public String getName(){
	 	return name; 
	}
	public char getGender(){
		 return gender; 
		}
	public int getAge(){ 
		return age;
		 }
	public boolean getIsMarried(){ 
		return isMarried;
		 }
}

class Student extends Person{
	private String std_id;
	private int subjectsEnrolled;
	private int attendance;

	public Student(String name, int age, char gender, boolean isMarried, String std_id, int subjectsEnrolled, int attendance ){
		super(name, age, gender, isMarried);
		this.std_id = std_id;
		this.subjectsEnrolled = subjectsEnrolled;
		this.attendance = attendance;
	}

	public String getStudentId(){
	 return std_id; 
	}
	public int getSubjectsEnrolled(){
	 return subjectsEnrolled; 
	}
	public int getAttendance(){ 
		return attendance;
		 }


}

public class Task1{
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		Student st1 = new Student("Ahmed Ali", 19, 'm', false, "18SW56", 5, 83);
		Student st2 = new Student("Usama", 18, 'm', false, "18SW52", 5, 90);
		Student st3 = new Student("Waqar Ali", 19, 'm', false, "18SW82", 5, 98);
		Student st4 = new Student("Yasir", 20, 'm', false, "18SW51", 5, 92);
		Student st5 = new Student("Uzair", 19, 'm', false, "18SW70", 5, 96);
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);

		System.out.println(list.getFirst().getName());
		System.out.println(list.contains(st1));
		System.out.println(list.indexOf(st5));
		System.out.println(list.getFirst().getName());
		System.out.println(list.getLast().getName());
		System.out.println(list.peek().getName());
		System.out.println(list.pop().getName());
		System.out.println(list.remove().getName());
		System.out.println(list.size());
		list.clear();
		System.out.println(list);

	}
}