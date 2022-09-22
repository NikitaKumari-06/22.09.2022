package com.test.bll;

public class Book extends Author{
	private String isbn;
	private String name;
	private Author author;   //datatype of author class
	private double price;
	private int qty;
	
	public Book() {  //first default constructor
		qty = 0;
	}
	
	public Book(String isbn, String name, Author author, double price) {  //second constructor
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String isbn, String name, Author author, double price, int qty) { //third constructor
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getISBN() {  //get method of isbn
		return isbn;
	}
	
	public String getName() {  //get method of name
		return name;
	}
	
	public Author getAuthor() {  //get method of author
		return author;
	}
	
	public double getPrice() {  //get method of price
		return price;
	}
	
	public void setPrice(double price) {   //set method of price
		this.price= price;
	}
	
	public int getQty() {  //get method of qty
		return qty;
	}
	
	public void setQTY(int qty) {  //set method of qty
		this.qty = qty;
	}
	
	public String getAuthorName() {   //set method of author name
		return name;
	}
	
	@Override
	public String toString() {  //toString metohd to print value
		return "Book[ isbn : " +isbn+ ", name : " +name+ "," +author.toString()+ ", price : "+price+ ", qty : "+qty+ " ]";
	}
	
	

}
