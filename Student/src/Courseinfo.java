
public class Courseinfo {
	String CourseName;
	int StudentMarks;
	

	public Courseinfo(String CourseName, int StudentMarks) {
		super();
		this.CourseName = CourseName;
		this.StudentMarks= StudentMarks;
		
	}
       public void displayCourseinfo(){
    	   System.out.println("Course Name:" + CourseName);
    	   System.out.println("Student Marks:" + StudentMarks);
    	   

	
}
}
