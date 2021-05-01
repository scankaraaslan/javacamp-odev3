package odev3;

public class InstructorManager {
public void startToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu başlamıştır.");
				
	}
	
	public void giveHomework(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursunun ödevi eklenmiştir.");
	}
	
	public void finishToCourse(Instructor instructor) {
		
		System.out.println(instructor.givenOfCourses + " kursu bitmiştir.");
				
	}
}
