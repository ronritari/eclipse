package kotitehtava4;


//Tehtaassa koneiden valmistuksessa käytetään erilaisia osia
//Tätä osaa ei koskaa käytetä vaan sillä luodaan aina aliluokkien olioita, joita käytetään
//siis lisää abstraktia kantaluokkaa
public abstract class Osa {
	//attribuutteina aina osan nimeä ja määrää varastossa
	
	//konstruktori siis luokan niminen metodi, joka ei palauta mitään
	
	
	//getterit nimelle ja määrälle varastossa
	
	
	//koska seuraava metodi on abstract, sinun pitää määritellä koko luokka abstraktiksi
	//älä siis toteuta mitään tässä
	//vaan toteuta luokasta perityissä luokissa samanniminen metodi
	public abstract double getVarastonArvo();
	
	//tämä pakottaa toteuttamaan toString -metodin tästä perityissä aliluokissa
	public abstract String toString();
}
