/*  id, name, price, Use Product, Shop and ShopProdApp as a class name.	*/

class Product{
	private int id, price;
	private String name;
	
	void setId(int id){
		this.id = id;
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
	int getPrice(){
		return price;
	}
	String getName(){
		return name;
	}
}

class Shop{
	private Product prod;
	
	void setProduct(Product prod){
		this.prod = prod;
	}
	
	void showProduct(){
		System.out.println("ID:     "+prod.getId());
		System.out.println("Name:   "+prod.getName());
		System.out.println("Price:  "+prod.getPrice());
	}
}

public class ShopProdApp{
	public static void main(String args[]){
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("ACER");
		p1.setPrice(99990);
		
		Shop s1 = new Shop();
		s1.setProduct(p1);
		s1.showProduct();
		
	}
}