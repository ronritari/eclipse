package kotiteht3;

import java.util.ArrayList;
import java.util.Scanner;

public class Opetussuunnitelma {
	public Opetussuunnitelma(String koodi, String merkkijono, int laajuus) {
		super();
		this.koodi = koodi;
		this.merkkijono = merkkijono;
		this.laajuus = laajuus;
	}

	private String koodi;
	private String merkkijono;
	private int laajuus;
	
	
	public void haeKoodilla(ArrayList<Opetussuunnitelma> ops1) {
		Scanner haku = new Scanner(System.in);
		System.out.println("hakukoodi:");
		String hakukoodi = haku.nextLine();
		
		//looppaa ja printtaa
		for (int i=0; i<ops1.size(); i++) {
			if(ops1.get(i).getKoodi().toLowerCase().contains(hakukoodi)==true ||ops1.get(i).getKoodi().toUpperCase().contains(hakukoodi)==true) {
				System.out.println(ops1.get(i).getKoodi()+"||"+ops1.get(i).getMerkkijono()+"||"+ops1.get(i).getLaajuus());
			}
		}
	}
	
    public void haemerk(ArrayList<Opetussuunnitelma> ops1) {
    	Scanner haku = new Scanner(System.in);
		System.out.println("haku nimellä:");
		String hakukoodi = haku.nextLine();
		
		//looppaa ja printtaa
		for (int i=0; i<ops1.size(); i++) {
			if(ops1.get(i).getMerkkijono().toLowerCase().contains(hakukoodi)==true||ops1.get(i).getMerkkijono().toUpperCase().contains(hakukoodi)==true) {
				System.out.println(ops1.get(i).getKoodi()+"||"+ops1.get(i).getMerkkijono()+"||"+ops1.get(i).getLaajuus());
			}
		}
	}
    
    public void haelaajuus(ArrayList<Opetussuunnitelma> ops1) {
    	Scanner haku = new Scanner(System.in);
		System.out.println("haku laajuudella:");
		int hakukoodi = haku.nextInt();
		
		//looppaa ja printtaa
		for (int i=0; i<ops1.size(); i++) {
			if(ops1.get(i).getLaajuus()==hakukoodi) {
				System.out.println(ops1.get(i).getKoodi()+"||"+ops1.get(i).getMerkkijono()+"||"+ops1.get(i).getLaajuus());
			}
		}
	}

	public String getKoodi() {
		return koodi;
	}

	public void setKoodi(String koodi) {
		this.koodi = koodi;
	}

	public String getMerkkijono() {
		return merkkijono;
	}

	public void setMerkkijono(String merkkijono) {
		this.merkkijono = merkkijono;
	}

	public int getLaajuus() {
		return laajuus;
	}

	public void setLaajuus(int laajuus) {
		this.laajuus = laajuus;
	}
	
}
