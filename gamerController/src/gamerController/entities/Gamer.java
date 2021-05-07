package gamerController.entities;

import java.time.LocalDate;

import gamerController.abstracts.Entity;

public class Gamer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	
	public Gamer() {
		super();

	}


	public Gamer(int id, String firstName, String lastName, String password, LocalDate dateOfBirth,
			String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	

}
