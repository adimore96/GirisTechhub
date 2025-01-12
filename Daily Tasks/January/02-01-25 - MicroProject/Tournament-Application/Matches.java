class Matches{
	private int numOfOver, mId;
	private String matchName, location;
	Team team[];
	
	//setter methods
	public void setNumOfOvers(int numOfOver){
		this.numOfOver = numOfOver;
	}
	public void setMId(int mId){
		this.mId = mId;
	}
	public void setMatchName(String matchName){
		this.matchName = matchName;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public void setTeam(Team team[]){
		this.team = team;
	}
	
	//getter methods
	public int getNumOfOvers(){
		return numOfOver;
	}
	public int getMId(){
		return mId;
	}
	public String getMatchName(){
		return matchName;
	}
	public String getLocation(){
		return location;
	}
	public Team[] getTeam(){
		return team;
	}
}