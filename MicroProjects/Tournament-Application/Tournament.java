import java.util.*;
public class Tournament{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Team team[] = new Team[2];
		
		Matches match = new Matches();
		
		//Case1: Add new Teams
		for(int i=0; i<team.length; i++){
			team[i] = new Team();
			System.out.println("==============Enter Team "+(i+1)+" Details===============");
			System.out.print("Enter Team ID: ");
			team[i].setTeamId(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter Team Name: ");
			team[i].setTeamName(sc.nextLine());
		}
		
		//Case2: Add players in team
		for(int i=0; i<team.length; i++){
			Player player[] = new Player[2];
			System.out.println("------Enter Player Details for Team "+(i+1)+".-----------");
			
			for(int j=0; j<player.length; j++){
				player[j] = new Player();
				System.out.print("Enter Player ID: ");
				player[j].setId(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter Name: ");
				player[j].setName(sc.nextLine());
				System.out.print("Enter Age: ");
				player[j].setAge(sc.nextInt());
				System.out.print("Enter Run: ");
				player[j].setRun(sc.nextInt());
			}
			//Setting players in the team
			team[i].setPlayers(player);
			
		}
		
		//Case3: Create match
		System.out.println("=================Create Match===============");
		System.out.print("Enter Match ID: ");
		match.setMId(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Match Name: ");
		match.setMatchName(sc.nextLine());
		System.out.print("Enter Location: ");
		match.setLocation(sc.nextLine());
		System.out.print("Enter No.of Overs: ");
		match.setNumOfOvers(sc.nextInt());
		System.out.println("==========================================");
		
		//Case4: Allocate team to match
		System.out.println("Match set B/W "+team[0].getTeamName()+" V/S "+team[1].getTeamName());
		match.setTeam(team);
		
		//Case5: View all teams
		System.out.println("=================All Teams================");
		for(Team t:team){
			System.out.println(t.getTeamName());
		}
		System.out.println("==========================================");
		
		//Case6: Show team wise players
		System.out.println("===========Team wise Players==============");
		for(int i=0; i<team.length; i++){
			System.out.println(team[i].getTeamName());
			Player p[] = team[i].getPlayers();
			for(int j=0; j<p.length; j++){
				System.out.println((j+1)+" : "+p[j].getName());
			}
		}
		System.out.println("==========================================");
		
		
		//Case7: Show player wise Runs
		System.out.println("===========Player wise Runs==============");
		for(int i=0; i<team.length; i++){
			Player p[] = team[i].getPlayers();
			for(int j=0; j<p.length; j++){
				System.out.println(p[j].getName()+" Runs : "+p[j].getRun());
			}
		}
		System.out.println("==========================================");
		
		
		//Case8: Team wise player run Aggregate
		System.out.println("===========Team wise player Run aggregate==============");
		for(int i=0; i<team.length; i++){
			System.out.println("---------------------------------------------------");
			System.out.println("Team: "+team[i].getTeamName());
			Player p[] = team[i].getPlayers();
			int counter=0;
			for(int j=0; j<p.length; j++){
				System.out.println((j+1)+" : "+p[j].getName()+" Runs : "+p[j].getRun());
				counter += p[j].getRun();
			}
			System.out.println(team[i].getTeamName()+" Aggregate run is: "+ counter);
			
		}
		System.out.println("=======================================================");
		
		
		//Case9: Decide the winner
		System.out.println("==============Winner=============");
		int []counter= new int[2];
		for(int i=0; i<team.length; i++){
			Player p[] = team[i].getPlayers();
			for(int j=0; j<p.length; j++){
				counter[i] += p[j].getRun();
			}
		}
		
		if(counter[0]>counter[1]){
			System.out.println("Winner is "+team[0].getTeamName());
		}else{
			System.out.println("Winner is "+team[1].getTeamName());
		}
		
	}
}