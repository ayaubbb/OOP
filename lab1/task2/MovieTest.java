package lab1.task2;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie actionM = new Movie("Inception");
		actionM.setGenre(Movie.Genre.Action);
		
		Movie m2 = new Movie();
		
		Movie series = new Movie("Game of Thrones");
		
		series.setGenre(Movie.Genre.Drama);
		
		Movie comedyM = new Movie("Step Brothers"); 
		comedyM.setGenre(Movie.Genre.Comedy);

		Movie horrorM = new Movie("Iron Lung"); 
		horrorM.setGenre(Movie.Genre.Horror);

		Movie romanceM = new Movie("Forrest Gump"); 
		romanceM.setGenre(Movie.Genre.Romance);
		
		System.out.println(actionM);
		System.out.println(comedyM);
		System.out.println(series);
		System.out.println(horrorM);
		System.out.println(romanceM);
		System.out.println("Movie count: " + Movie.getMovieCount());
		
		
		
	}

}
