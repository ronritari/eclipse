package futstats;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



public class main {

	static ArrayList<player> players = new ArrayList<player>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		loadPlayers();
	}

	//laittaa pelaajat arraylistaan at
	private static void loadPlayers() throws Exception {
		ArrayList<String> at = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String tiedosto = "brazilPlayers.txt";
		File file = new File(tiedosto);
    
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		
		while ((st = br.readLine()) != null) {
			
			at.add(st);
			
		}
		System.out.println(at);
		
		//järjestää pelaajat players listaan ja omiin olioihin
		addToArray(at);
		
	}

	private static void addToArray(ArrayList<String> at) {
		
		for(int i = 0; i < at.size(); i++) {
			//System.out.println(at.get(i));
			if(at.get(i+1).contains("GK")) {
				String name = at.get(i);
				String pos = at.get(i+1);
				int number = Integer.parseInt(at.get(i+2));
				//System.out.println(name+hours+salary);
				//list.add(new HourlyEmployee(name, hours, salary));
				players.add(new goalkeeper(name,pos,number));
				i += 2;
			}
			if(at.get(i).contains("DEF")) {
				String name = at.get(i);
				String pos = at.get(i+1);
				int number = Integer.parseInt(at.get(i+2));
				//System.out.println(name+hours+salary);
				//list.add(new HourlyEmployee(name, hours, salary));
				players.add(new defender(name,pos,number));
				i += 2;
			}
			if(at.get(i).contains("CM")) {
				String name = at.get(i);
				String pos = at.get(i+1);
				int number = Integer.parseInt(at.get(i+2));
				//System.out.println(name+hours+salary);
				//list.add(new HourlyEmployee(name, hours, salary));
				players.add(new midfielder(name,pos,number));
				i += 2;
			}if(at.get(i).contains("FWD")) {
				String name = at.get(i);
				String pos = at.get(i+1);
				int number = Integer.parseInt(at.get(i+2));
				//System.out.println(name+hours+salary);
				//list.add(new HourlyEmployee(name, hours, salary));
				players.add(new midfielder(name,pos,number));
				i += 2;
			}
			
		}
		System.out.println(players);
		
	}

}
