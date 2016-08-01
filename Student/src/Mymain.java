import java.util.Scanner;

public class Mymain {

	public static void main(String[] args) {

		// create an object of Student
		Student s1 = new Student("Harman", 101, "System engineering", 80);
		Student s2 = new Student("Rajan", 102, "Java programming language", 70);
		Student s3 = new Student("Kanwaldeep", 103, "Information technology", 65);
		Student s4 = new Student("Rahul", 104, "System engineering", 55);
		Student s5 = new Student("Manpreet", 105, "C++", 85);
		Student s6 = new Student("Jasmeen", 106, "Software development", 72);
		Student s7 = new Student("Gajal", 107, "DBMS", 60);

		Student s8 = new Student("Kajal", 108, "Networking", 30);

		
		
		

		Scanner input = new Scanner(System.in);
		int num = 0;

		System.out.println("Student result information");
		System.out.println("Enter Student ID");
		num = input.nextInt();

		if (num == s1.getStudentID()) {
			System.out.println("Student Name: " + s1.getStudentName());
			System.out.println("Course Name: " + s1.getCourseName());
			System.out.println("Student Marks : " + s1.getStudentMarks());
			
		} 
		
		else if (num == s2.getStudentID()) {
			System.out.println("Student Name: " + s2.getStudentName());
			System.out.println("Course Name: " + s2.getCourseName());
			System.out.println("Student Marks : " + s2.getStudentMarks());
		} 
		
		else if (num == s3.getStudentID()) {
			System.out.println("Student Name: " + s3.getStudentName());
			System.out.println("Course Name: " + s3.getCourseName());
			System.out.println("Student Marks : " + s3.getStudentMarks());
		}
		
		else if (num == s4.getStudentID()) {
			System.out.println("Student Name: " + s4.getStudentName());
			System.out.println("Course Name: " + s4.getCourseName());
			System.out.println("Student Marks : " + s4.getStudentMarks());
		}
		
		else if (num == s5.getStudentID()) {
			System.out.println("Student Name: " + s5.getStudentName());
			System.out.println("Course Name: " + s5.getCourseName());
			System.out.println("Student Marks : " + s5.getStudentMarks());
		} 
		

		else if (num == s6.getStudentID()) {
			System.out.println("Student Name: " + s6.getStudentName());
			System.out.println("Course Name: " + s6.getCourseName());
			System.out.println("Student Marks : " + s6.getStudentMarks());
		} 
		
		else if (num == s7.getStudentID()) {
			System.out.println("Student Name: " + s7.getStudentName());
			System.out.println("Course Name: " + s7.getCourseName());
			System.out.println("Student Marks : " + s7.getStudentMarks());
		} 
		
		
		else if (num == s8.getStudentID()) {
			System.out.println("Student Name: " + s8.getStudentName());
			System.out.println("Course Name: " + s8.getCourseName());
			System.out.println("Student Marks : " + s8.getStudentMarks());
		} 
		else 
			System.out.println("Icorrect student ID");

		
	}

}
