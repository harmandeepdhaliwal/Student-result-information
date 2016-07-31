import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {

		//create an object of Student
		Student s1 =new Student("Harman",101,"System engineering",70);
		Student s2 =new Student("Rajan",102,"System engineering",80);
				
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Student Information System");
		System.out.println("Enter Student ID");
		num = input.nextInt();
		
		if(num == s1.getStudentID() ){
			System.out.println("Student Name: "+ s1.getStudentName());
			System.out.println("Course Name: "+ s1.getCourseName());
			System.out.println("Student Marks : "+ s1.getStudentMarks());
		}
		
		
		
		
	}

}
