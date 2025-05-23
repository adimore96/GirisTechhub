/*
Write a Java program to create a class called Animal with a method called makeSound(). 
Create a subclass called Cat that overrides the makeSound() method to bark.
*/

class Animal{
	void makeSound(){
		System.out.println("Animal makes sound");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat makes Meow...");
	}
}

class AnimlaAPP{
	public static void main(String args[]){
		Cat c = new Cat();
		c.makeSound();
	}
}