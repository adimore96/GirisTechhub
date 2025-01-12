class Course{
	private int cId, duration, fees;
	private String name;
	
	public void setCId(int cId){
		this.cId = cId;
	}
	public int getCId(){
		return cId;
	}
	public void setDuration(int duration){
		this.duration = duration;
	}
	public int getDuration(){
		return duration;
	}
	public void setFees(int fees){
		this.fees = fees;
	}
	public int getFees(){
		return fees;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public int checkCourseID(int cId, Course c1[]){
		for(int i=0;i<c1.length; i++){
			if(c1[i].getCId() == cId){
				return i;
			}
		}
		return -1;
	}
}