
public class Student {
	private String StudentName;
	private int StudentID;
	private String CourseName;
	private int StudentMarks;

	public Student(String studentName, int studentID, String courseName, int studentMarks) {

		StudentName = studentName;
		StudentID = studentID;
		CourseName = courseName;
		StudentMarks = studentMarks;
	}

	
	
	public String getStudentName() {
		return StudentName;
	}



	public String getCourseName() {
		return CourseName;
	}



	public int getStudentMarks() {
		return StudentMarks;
	}



	public int getStudentID() {
		return StudentID;
	}



/*	public void display() {
		System.out.println("Student Name: " + StudentName);
		System.out.println("Student ID : " + StudentID);
		System.out.println("Course Name: " + CourseName);
		System.out.println("Student Marks: " + StudentMarks);

	}*/

}