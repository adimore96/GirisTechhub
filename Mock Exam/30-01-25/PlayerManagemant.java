/*
Q4. Create a class called "Player" with members jersyno, name, run, and matches. Write
a java program to store the input data for five player, display their all player information,
and delete record in specific index then display record ascending orders by matches.
*/
import java.util.*;
class Player{
	 int jersyno,run,matches;
	 String name;
	
	//Constructor
	public Player(int jersyno, String name, int run, int matches){
		this.jersyno = jersyno;
		this.name = name;
		this.run = run;
		this.matches = matches;
	}
	
	//display method
	public void display(){
		System.out.println("Jersey No: "+jersyno +", Name: "+name+", Runs: "+run+", Matches: "+matches);
	}	
}

public class PlayerManagemant{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[5];

        // Input player details
        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Jersey No: ");
            int jerseyNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            System.out.print("Matches: ");
            int matches = sc.nextInt();
            players[i] = new Player(jerseyNo, name, runs, matches);
        }

        // Display all players
        System.out.println("\nAll Players:");
        for (Player p : players) {
            p.display();
        }

        // Delete player at specific index
        System.out.print("\nEnter index to delete (0-4): ");
        int index = sc.nextInt();
        if (index >= 0 && index < players.length) {
            players[index] = null;
        } else {
            System.out.println("Invalid index!");
        }

        // Sort players by matches in ascending order
        Arrays.sort(players, (p1, p2) -> {
            if (p1 == null) return 1;
            if (p2 == null) return -1;
            return Integer.compare(p1.matches, p2.matches);
        });

        // Display sorted player list
        System.out.println("\nPlayers sorted by matches:");
        for (Player p : players) {
            if (p != null) {
                p.display();
            }
        }
        
        sc.close();
    }
}