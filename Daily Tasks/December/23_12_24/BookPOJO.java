/*
Q2. WAP to create POJO class name as Book  with field id,name and price and author and input the book details and display it.
*/

import java.util.*;

class Book{
	private int id,price;
	private String name, author;
	
	void setId(int id){
		this.id = id;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setAuthor(String author){
		this.author = author;
	}
		
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	String getAuthor(){
		return author;
	}
	
	int getPrice(){
		return price;
	}
}


public class BookPOJO{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Book p = new Book();
		p.setId(1);
		p.setName("You");
		p.setAuthor("Aditya More");	
		p.setPrice(459896);
		
		System.out.println("Calling setter method");
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Author: "+p.getAuthor());
		System.out.println("Price: "+p.getPrice());
	}
}