/*
Q1. WAP to create POJO class name as Player with id, name and run and input the data from keyboard and display it.
*/

import java.util.*;

class Player{
	private int id,run;
	private String name;
	
	void setId(int id){
		this.id = id;
	}
	
	void setRun(int run){
		this.run = run;
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
	
	int getRun(){
		return run;
	}
}


public class PlayerPOJO{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Player p = new Player();
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		p.setId(id);
		System.out.print("Enter Name: ");
		String name = sc.next();
		p.setName(name);
		System.out.print("Enter Runs: ");
		int run = sc.nextInt();
		p.setRun(run);	
		
		System.out.println("ID: "+p.getId());
		System.out.println("Name: "+p.getName());
		System.out.println("Runs: "+p.getRun());
	}
}