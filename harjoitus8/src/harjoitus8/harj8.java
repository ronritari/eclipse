package harjoitus8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class harj8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// File path is passed as parameter
		etsiMerkkijono();
		teht2();
	}
	
	
//tehtävä 1 
	static void etsiMerkkijono() throws Exception {
		Scanner sc = new Scanner(System.in);
    
		System.out.println("minkä merkkijonon rivin haluat tulostaa?");
		String etsi = sc.nextLine();
    
		System.out.println("mitä tiedostoa haluat käyttää?");
		String tiedosto = sc.nextLine();
		//D:\\Kouluhommat\\eclipse\\harj8txt.txt
		File file = new File(tiedosto);
 
        
        BufferedReader br = new BufferedReader(new FileReader(file));
 
        String st;

        while ((st = br.readLine()) != null) {
        	if (st.contains(etsi)) {
        		System.out.println(st);
        	}
        }
	}
	
	
	//tehtävä2
	static void teht2() throws Exception {
		ArrayList<Employee> list = new ArrayList<Employee>();
		ArrayList<String> at = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("mitä tiedostoa haluat käyttää?");
		String tiedosto = sc.nextLine();
		//D:\\Kouluhommat\\eclipse\\harj8txt.txt
		File file = new File(tiedosto);
    
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		
		while ((st = br.readLine()) != null) {
			//System.out.println(st);
			at.add(st);
			//System.out.println(at);
			/*if(st.contains("HE")) {
				//list.add(new HourlyEmployee(st, 0, 0));
				
			}*/
		}
		//System.out.println(at.size());
		for(int i = 0; i < at.size(); i++) {
			//System.out.println(at.get(i));
			if(at.get(i).contains("HE")) {
				String name = at.get(i+1);
				int hours = Integer.parseInt(at.get(i+2));
				int salary = Integer.parseInt(at.get(i+3));
				//System.out.println(name+hours+salary);
				list.add(new HourlyEmployee(name, hours, salary));
				i += 3;
			}
			if(at.get(i).contains("SE")) {
				String name = at.get(i+1);
				double sales = Double.parseDouble(at.get(i+2));
				double commissionPercent = Double.parseDouble(at.get(i+3));
				//System.out.println(name+hours+salary);
				list.add(new SalesEmployee(name, sales, commissionPercent));
				i += 3;
			}
			if(at.get(i).contains("SM")) {
				String name = at.get(i+1);
				double monthlySalary = Double.parseDouble(at.get(i+2));
				double sales = Double.parseDouble(at.get(i+3));
				double commissionPercent = Double.parseDouble(at.get(i+4));
				//System.out.println(name+hours+salary);
				list.add(new SalesManager(name, monthlySalary, sales, commissionPercent));
				i += 4;
			}
			
		}
		
		for(Employee a: list) {
			System.out.println(a.toString());
			System.out.println("calculate salary: "+a.calculateSalary()+"\n");
		}
		
	}

}


