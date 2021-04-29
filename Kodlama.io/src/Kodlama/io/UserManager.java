package Kodlama.io;
import Kodlama.io.User;

public class UserManager {
	public void getUserInformation(User user) {
		System.out.println("KULLANICI ADI " +user.getUserName());
		System.out.println("ÞÝFRE" +user.getPassword());
	}
	
	public void getUserList(User[] users) {
		for(User user : users) 
			getUserInformation(user);
	}
	
	public void getInformation(User user) {
		System.out.println(user.getUserName() + "Kullabýcý");
	}
	
	
	

}
