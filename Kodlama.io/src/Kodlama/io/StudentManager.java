package Kodlama.io;
import Kodlama.io.User;
import Kodlama.io.Student;

public class StudentManager extends UserManager {
	public void getStudentInformation(Student student) {
		System.out.println("ÖÐRENCÝ NUMARASI "  +student.getStudentNumber());
		System.out.println("KULLANICI ADI " +student.getUserName());
		System.out.println("ÞÝFRE " + student.getPassword());
	}
	
	public void getStudentList(Student[] students) {
		for(Student student : students) 
			getStudentInformation(student);
	}
	
	@Override
	public void getInformation(User user) {
		System.out.println(user.getUserName() + " öðrenci  \n");
	}
	

}
