/*
Q2. WAP Voting application using method with variable argos concept
Voter: id name and age mark as POJO class 
VotingMachine: void acceptWord(Voter …v): accept the infinite voter if voter age is greater than 18 then display its data otherwise not
VotingMachineApp: this method cantais voter details and pass to VotingMachine class 
*/

class Voter{
	private int id, age;
	private String name;
	
	// setter Methods
	void setId(int id){
		this.id = id;
	}
	
	void setAge(int age){
		this.age = age;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	// getter Methods
	int getId(){
		return id;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

class VotingMachine{
	void acceptWord(Voter ...v){
		System.out.println("ID		Name		Age");
		for(int i=0; i<v.length; i++){
			if(v[i].getAge() >= 18){
				System.out.println(v[i].getId()+"		"+v[i].getName()+"		"+v[i].getAge());
			}
		}
	}
}

class VotingMachineApp{
	public static void main(String args[]){
		Voter v1 = new Voter();
		v1.setId(1354);
		v1.setAge(12);
		v1.setName("A");
		
		Voter v2 = new Voter();
		v2.setId(2564);
		v2.setAge(19);
		v2.setName("B");
		
		Voter v3 = new Voter();
		v3.setId(5894);
		v3.setAge(21);
		v3.setName("C");
		
		VotingMachine vm = new VotingMachine();
		vm.acceptWord(v1,v2,v3);
	}
}