package odev3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setUserName("engin");
		instructor1.setPassword("12345");
		instructor1.setFistName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setNationalIdentity("1111111111");
		instructor1.seteMail("engindemirog@gmail.com");
		instructor1.setProfession("Programlama Dilleri");
		instructor1.setGivenOfCourses("Java");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setUserName("yildiray");
		student1.setPassword("678910");
		student1.setFistName("Yıldıray");
		student1.setLastName("Çırakoğulları");
		student1.setNationalIdentity("22222222222");
		student1.seteMail("crkogullari@gmail.com");
		student1.setAttendedOfCourses("Java");
		
		UserManager userManager1 = new UserManager();
		userManager1.logIn(instructor1);
		
		UserManager userManager2 = new UserManager();
		userManager2.logIn(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.startToCourse(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.registerToCourse(student1);
				
		instructorManager.giveHomework(instructor1);
		
		instructorManager.finishToCourse(instructor1);
		
		userManager2.logOut(student1);
	}

}
