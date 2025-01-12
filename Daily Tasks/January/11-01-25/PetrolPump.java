import java.util.*;
class PetrolPump{
	Machine m[];
	
	PetrolPump(){
		this(3);
	}
	PetrolPump(int capacity){
		Scanner sc = new Scanner(System.in);
		m = new Machine[capacity];
		
		for(int i=0; i<capacity; i++){
			m[i] = new Machine();
			
			System.out.print("Set ID: ");
			m[i].setId(sc.nextInt());
			sc.nextLine();
			System.out.print("Set Name: ");
			m[i].setName(sc.nextLine());
			System.out.print("Set MCapacity: ");
			m[i].setMachineCapacity(sc.nextInt());
			System.out.print("Set MNo: ");
			m[i].setMachineNo(sc.nextInt());
			sc.nextLine();
			System.out.print("Set FuelType: ");
			m[i].setFuelType(sc.nextLine());
			
		}
	}
	
	//get machine count
	public int getMachineCount(){
		return m.length;
	}
	
	//get Capacity
	public void getCapacity(){
		System.out.println("\nCapacity of each Machine");
		for(int i=0; i<m.length; i++){
			System.out.println(m[i].getName()+" Capacity: "+m[i].getMachineCapacity());
		}
	}
	
	
	//get Machine by fuleType
	public Machine[] getMachineByFuleType(String fuleType){
		int counter=0;
		for(int i=0; i<m.length; i++){
			if(m[i].getFuleType().equals(fuleType)){
				counter++;
			}
		}
		
		Machine m1[] = new Machine[counter];
		for(int i=0,j=0; i<m.length; i++){
			if(m[i].getFuleType().equals(fuleType)){
				m1[j] = new Machine();
				m1[j] = m[i];
				j++;
			}
		}
		
		return m1;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		PetrolPump p = new PetrolPump();
		
		//Displaying total machine count
		System.out.println("Total Machine Count: "+p.getMachineCount());
		
		//Displaying capacity of each machine
		p.getCapacity();
		
		//Display Machine by fule type
		System.out.println("\n-----------By Fuel Type--------------");
		for(Machine m:p.getMachineByFuleType("Petrol")){
			System.out.println(m.getName()+" Fuel Type: "+m.getFuleType());
		}
		
	}
}