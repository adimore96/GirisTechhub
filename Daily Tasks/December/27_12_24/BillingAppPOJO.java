/*
Q1. WAP to create billing application 
Classes 
Customer : id,name and mobile mark as POJO class
Product class: id,name,price,qty,rate 
Bill class contain method 
void calBill(Customer c,Product …p): this function can accept single customer detail and multiple product details and your output should like as
*/

class Customer{
	private int id,mobile;
	private String name;
	
	void setCId(int id){
		this.id = id;
	}
	
	void setCMobile(int mobile){
		this.mobile = mobile;
	}
	
	void setCName(String name){
		this.name = name;
	}
	
	int getCId(){
		return id;
	}
	int getCMobile(){
		return mobile;
	}
	String getCName(){
		return name;
	}
}


class Product{
	private int id, price, qty, rate;
	private String name;
	
	//Setter Methods
	void setPId(int id){
		this.id = id;
	}
	void setPPrice(int price){
		this.price = price;
	}
	void setPQty(int qty){
		this.qty = qty;
	}
	void setPRate(int rate){
		this.rate = rate;
	}
	
	void setPName(String name){
		this.name = name;
	}
	
	// Getter methods
	int getPId(){
		return id;
	}
	int getPPrice(){
	return price;
	}
	int getPQty(){
	return qty;
	}
	int getPRate(){
	return rate;
	}
	
	String getPName(){
	return name;
	}
}

class Bill{
	void calBill(Customer c, Product ...p){
		System.out.println("Customer Name: "+c.getCName());
		System.out.println("Mobile		 : "+c.getCMobile());
		System.out.println("\nID		Name		Quantity	Rate	Total");
		int totalAmt = 0;
		for(int i=0; i<p.length; i++){
			System.out.println(p[i].getPId()+"		"+p[i].getPName()+"	          "+p[i].getPQty()+"		  "+p[i].getPRate()+"	"+p[i].getPQty()*p[i].getPPrice());
			totalAmt += p[i].getPQty()*p[i].getPPrice();
		}
		System.out.println("_____________________________________________________________");
		System.out.println("					 Complete: 	"+ totalAmt);
	}
}

public class BillingAppPOJO{
	public static void main(String args[]){
		Customer c = new Customer();
		c.setCId(1);
		c.setCName("Aditya More");
		c.setCMobile(70283097);
		
		Product p1 = new Product();
		p1.setPId(1001);
		p1.setPPrice(999);
		p1.setPQty(2);
		p1.setPRate(3);
		p1.setPName("A");
		
		Product p2 = new Product();
		p2.setPId(1002);
		p2.setPPrice(599);
		p2.setPQty(1);
		p2.setPRate(2);
		p2.setPName("Laptop");
		
		Bill b = new Bill();
		b.calBill(c, p1,p2);
	}
}