package Kodlama.io ;
import Kodlama.io.Instructor;
import Kodlama.io.User;
import Kodlama.io.Student;
import Kodlama.io.UserManager;
import Kodlama.io.InstructorManager;
import Kodlama.io.StudentManager;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentNumber("19882002");
		student1.setUserName("pervin");
		student1.setPassword("kalemKalme.1415");
		
		Student student2 = new Student();
		student2.setStudentNumber("19882001");
		student2.setUserName("doða");
		student2.setPassword("kalemKalme.1429");
		
		Student student3 = new Student();
		student3.setStudentNumber("19882003");
		student3.setUserName("selcan");
		student3.setPassword("kalemKalme.1424");
		
		Instructor instructor1 = new Instructor();
		instructor1.setInstructorId("2244");
		instructor1.setUserName("engindemirog");
		instructor1.setPassword("456789");
		
		Instructor instructor2 = new Instructor();
		instructor2.setInstructorId("2245");
		instructor2.setUserName("keremvaris");
		instructor2.setPassword("4567897");
		
		Student[] students = {student1, student2, student3};
		Instructor[] instructors = {instructor1, instructor2};
		User[] users = {student1, student2, student3, instructor1, instructor2};
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		
		studentManager.getInformation(student1);
		studentManager.getStudentInformation(student2);
		studentManager.getStudentList(students);
		
		instructorManager.getInformation(instructor1);
		instructorManager.getInstructorInformation(instructor2);
		instructorManager.getInstructorList(instructors);
		
		userManager.getInformation(student1);
		userManager.getInformation(instructor1);
		userManager.getUserInformation(student1);
		userManager.getUserInformation(instructor1);
		userManager.getUserList(users);
		
		
		
		
		
		
		
		
		
		

	}

}
