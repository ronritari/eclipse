 package kotiteht4;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<osa> list = new ArrayList<osa>();
		
		osa kaapeli = new osa("kaapeli", 10);
		osa kotelo = new tehtaanOsa("kotelo", 5, 1.2, 2);
		osa led = new tilattuOsa("led", 10, "led.oy", 0.5);
		
		list.add(led);
		list.add(kotelo);
		list.add(kaapeli);
		
		for(osa a: list) {
			System.out.println(a.toString());
		}
	}

}
