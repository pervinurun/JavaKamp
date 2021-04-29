package Kodlama.io;
import Kodlama.io.Instructor;
import Kodlama.io.User;

public class InstructorManager extends UserManager {
	public void getInstructorInformation(Instructor instructor) {
		System.out.println("EÐÝTMEN ID" +instructor.getInstructorId());
		System.out.println("EÐÝTMEN ADI" +instructor.getUserName());
		System.out.println("ÞÝFRE" +instructor.getPassword());
	
	}
	public void getInstructorList(Instructor[] instructors) {
		for(Instructor instructor : instructors) 
			getInstructorInformation(instructor);
	}
	
	@Override
	public void getInformation(User user) {
		System.out.println(user.getUserName() + " eðitmen  ");
	}
	

}
