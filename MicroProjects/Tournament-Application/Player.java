class Player{
	private int id,age,run;
	private String name;
	
	//setter methods
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setRun(int run){
		this.run = run;
	}
	
	
	//getter methods
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getRun(){
		return run;
	}
}