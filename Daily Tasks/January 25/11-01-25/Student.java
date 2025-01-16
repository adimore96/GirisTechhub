class Student{
	private int id, contact, attendancePer, academicPer;
	private String name, email;
	
	//setter methods
	public void setId(int id){
		this.id = id;
	}
	public void setContact(int contact){
		this.contact = contact;
	}
	public void setAttendancePer(int attendancePer){
		this.attendancePer = attendancePer;
	}
	public void setAcademicPer(int academicPer){
		this.academicPer = academicPer;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	//getter methods
	public int getId(){
		return id;
	}
	public int getContact(){
		return contact;
	}
	public int getAttendancePer(){
		return attendancePer;
	}
	public int getAcademicPer(){
		return academicPer;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
}