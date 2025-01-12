class Batch{
	private int bId;
	private String batchName, startDate, expectedDate;
	private Course course;
	private Enquiry[] enquiry;
	
	public void setBId(int bId){
		this.bId = bId;
	}
	public int getBId(){
		return bId;
	}
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	public String getStartDate(){
		return startDate;
	}
	public void setExpectedDate(String expectedDate){
		 this.expectedDate = expectedDate;
	}
	public String getExpectedDate(){
		return expectedDate;
	}
	public void setBatchName(String batchName){
		this.batchName = batchName;
	}
	public String getBatchName(){
		return batchName;
	}
	
	public void setCourse(Course course){
		this.course = course;
	}
	public Course getCourse(){
		return course;
	}
	
	public void setEnquiry(Enquiry enquiry[], Course c1){
		int counter = 0;
		for(Enquiry e : enquiry){
			if(e.getStatus() == true && e.getCourse().getCId() == c1.getCId()){
				counter++;
			}
		}
		
		Enquiry e2[] = new Enquiry[counter];
		int j=0;
		for(Enquiry e : enquiry){
			if(e.getStatus() == true && e.getCourse().getCId() == c1.getCId()){
				e2[j++] = e;
			}
		}
		
		this.enquiry = e2;
	}
	public Enquiry[] getAdmissions(){
		return enquiry;
	}
}