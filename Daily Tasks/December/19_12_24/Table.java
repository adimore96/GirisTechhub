/*
Q1. WAP to create class name as Table with two functions 
void setTable(int no): this function is used for accept the number as parameter 
void showTable(): this function can print the table of number
*/

public class Table{
	static int num;
	static void setTable(int num){
		Table.num = num;
	}
	
	static void showTable(){
		System.out.println("Table of "+num);
		for(int i=1; i<=10; i++){
			System.out.println(num+" * "+i+" : "+num*i);
		}
	}
	public static void main(String args[]){
		setTable(5);
		showTable();
	}
}