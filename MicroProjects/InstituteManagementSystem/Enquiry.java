class Enquiry{
	private int id, contact;
	private String name, email, edu;
	private boolean status;
	private Course course;
	
	//setter methods
	public void setId(int id){
		this.id = id;
	}
	public void setContact(int contact){
		this.contact = contact;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setEdu(String edu){
		this.edu = edu;
	}
	public void setCourse(Course course){
		this.course = course;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	
	//setter methods
	public int getId(){
		return this.id;
	}
	public int getContact(){
		return contact;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getEdu(){
		return edu;
	}
	public Course getCourse(){
		return course;
	}
	public boolean getStatus(){
		return status;
	}

}