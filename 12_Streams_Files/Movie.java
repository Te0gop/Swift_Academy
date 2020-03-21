package homework;

import java.io.Serializable;

public class Movie implements Serializable{

	String title;
	String director;
	String actor;
	int releaseDate;
	String[] actors = new String[10];

	
	public Movie(String title, String director, String actor, int releaseDate) {
		super();
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.releaseDate = releaseDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActors() {
		return actor;
	}
	public void setActors(String actor) {
		this.actor = actor;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}


}
