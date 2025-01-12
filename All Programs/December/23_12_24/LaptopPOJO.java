/*
Q3. WAP to create POJO class name as Laptop with field id, name ,price and ramspace,harddiskspace etc and input the details of laptop and display it
*/


class Laptop{
	private int id,price,ramspace,harddiskspace;
	private String name;
	
	void setId(int id){
		this.id = id;
	}
	void setRam(int ramspace){
		this.ramspace = ramspace;
	}
	void setHDD(int harddiskspace){
		this.harddiskspace = harddiskspace;
	}
	
	void setPrice(int price){
		this.price = price;
	}
	
	void setName(String name){
		this.name = name;
	}
	
		
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	
	int getPrice(){
		return price;
	}
	int getRam(){
		return ramspace;
	}int getHDD(){
		return harddiskspace;
	}
}


public class LaptopPOJO{
	public static void main(String args[]){
		Laptop p = new Laptop();
		p.setId(1);
		p.setName("ACER");
		p.setPrice(459896);
		p.setRam(16);
		p.setHDD(1);
		
		System.out.println("Calling getter method");
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Ram: "+p.getRam());
		System.out.println("HDD: "+p.getHDD());
		System.out.println("Price: "+p.getPrice());
	}
}