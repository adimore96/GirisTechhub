class Team{
	private int teamId;
	private String teamName;
	private Player players[];
	
	//setter methods
	public void setTeamId(int teamId){
		this.teamId = teamId;
	}
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	public void setPlayers(Player players[]){
		this.players = players;
	}
	
	
	//getter methods
	public int getTeamId(){
		return teamId;
	}
	public String getTeamName(){
		return teamName;
	}
	public Player[] getPlayers(){
		return players;
	}
}