package com.test.bll;

public class Author {
	private String name;
	private String email;
	
	public Author() {   //default constructor
		
	}
	
	public Author(String name, String email) {  //parametrized constructor
		this.name= name;
		this.email= email;
	}
	
	public String getName() {  //get method of name
		return name;
	}
	
	public String getEmail() {   //get method of email
		return email;
	}
	
	public void setName(String name) {  //set method of name
		this.name= name;
	}
	
	public void setEmail(String email) {  //set method of email
		this.email = email;
	}
	
	@Override
	public String toString() {   //toString method to print all the value
		return "Author[ name : " +name+ ", email : " +email+ " ]";
	}

}
