package harjoitus8;

import java.io.*;
import java.util.Scanner;

public class harj8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// File path is passed as parameter
       
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("minkä merkkijonon rivin halua tulostaa?");
        String etsi = sc.nextLine();
        
        System.out.println("mitä tiedostoa haluat käyttää?");
        String tiedosto = sc.nextLine();
        //D:\\Kouluhommat\\eclipse\\harj8txt.txt
        File file = new File(tiedosto);
     
            
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				String st;
      // Condition holds true till
      // there is character in a string
      while ((st = br.readLine()) != null) {
				if (st.contains(etsi)) {
					System.out.println(st);
				}
      }
			}
 
	}

}


