package lab1.task2;

public class Movie {
	enum Genre{
		Action,
		Comedy,
		Drama,
		Horror,
		Romance
	}
	
	private static int movieCount = 0;
	
	private final String title;
	
	public Movie(String title){
		this.title = title;
	}
	
	public Movie(){
		this("No title");
	}
	
	public void  setDetails(int year){}
	
	public void  setDetails(int year, String director){}
	
	{
		movieCount++;
	}
	
	public static int getMovieCount() {
		return movieCount;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	};
	private Genre genre;
	
	public String toString() {
		return "Movie "+ title+ ", "+ "Genre " + genre + "\n";
	}
	
}
