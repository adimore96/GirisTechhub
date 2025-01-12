
class Product{
	private int id,qty,rate;
	private String name;
	
	void setId(int id){
		this.id = id;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setQty(int qty){
		this.qty = qty;
	}
	
	void setRate(int rate){
		this.rate = rate;
	}
	
	int getId(){
		return id;
	}
	
	String getName(){
		return name;
	}
	
	int getQty(){
		return qty;
	}
	int getRate(){
		return rate;
	}
	
}

public class ProductPOJOApp{
	public static void main(String args[]){
		Product p = new Product();
		p.setId(1);
		p.setName("Aditya");
		p.setQty(12);
		p.setRate(199);
		
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Qty: "+p.getQty());
		System.out.println("Rate: "+p.getRate());
	}
}