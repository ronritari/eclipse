package song;

import java.util.ArrayList;
import java.util.Collections;



public class main {
	
	 	
	public static void main(String[] args) {
		ArrayList<song> list = new ArrayList<song>();
		
		list.add(new song("slide", "barnacle boi", 2.48, 5.0));
		list.add(new song("desire", "barnacle boi", 3.23, 3.5));
		list.add(new song("mirrors", "memba", 2.28, 4.5));
		System.out.println(list);
		
		//sort by name
		System.out.println("\nsort by name:");
		Collections.sort(list, new Sortbyname());
		list.stream().map(song -> song.getName()).forEach(System.out::println);
		
		//sort by rating
		System.out.println("\nsort by rating:");
		Collections.sort(list);
		list.stream().map(song -> song.getRating()).forEach(System.out::println);
		
		//sort by artist
		System.out.println("\nsort by artist:");
		list.sort((song s1, song s2)->s1.getArtist().compareTo(s2.getArtist()));
		list.stream().map(song -> song.getArtist()).forEach(System.out::println);
		
		//sort by time
		System.out.println("\nsort by time:");
		Collections.sort(list, new Sortbytime());
		list.stream().map(song -> song.getTime()).forEach(System.out::println);
	}

}
