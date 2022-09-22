package com.test.pll;
import com.test.bll.Author;
import com.test.bll.Book;

public class AuthorTest {
	public static void main(String[] args) {
		System.out.println("Author class...");
		Author a = new Author("Bahubali","xyz1@gmail.com");  //object of class Author
		System.out.println(a.toString());       
		a.setName("Nikita");   //set method of name
		System.out.println(a.getName());
		System.out.println("Modified : "+a.toString());
        
		System.out.println("************************");
		
		System.out.println("Book class...");
		Book b = new Book("188-20-64-21","Devsena",a,200,2);  //object of class Book
	    System.out.println(b.toString());
	    b.setQTY(4);        //set method of qty
	    System.out.println(b.toString());
		
		}

}
