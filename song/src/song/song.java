package song;


import java.util.Comparator;


public class song implements Comparable<song> {
	
	String name;
	String artist;
	double time;
	double rating;
	
	public song(String name, String artist, double time, double rating) {
		super();
		this.name = name;
		this.artist = artist;
		this.time = time;
		this.rating = rating;
	}
	
	public song() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	

	@Override
	public String toString() {
		return "song [name=" + name + ", artist=" + artist + ", time=" + time + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(song o) {
		if(getRating() < o.getRating()) {
            return 1;
        }
        else if(getRating() > o.getRating()) {
            return -1; 
        }
		return 0;
	}
	
}

class Sortbyname implements Comparator<song> {
	 
    // Method
    // Sorting in ascending order of name
    public int compare(song a, song b)
    {
 
        return a.name.compareTo(b.name);
    }

	
}

class Sortbytime implements Comparator<song> {

	@Override
	public int compare(song o1, song o2) {
		if(o1.getTime() < o2.getTime()) {
            return 1;
        }
        else if(o1.getTime() > o2.getTime()) {
            return -1; 
        }
		return 0;
	}
	 
    

	
}
