package lab2.task1.partB;
public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	// Constructor, Getters, and Setters
	// toString() and other methods
	
	public LibraryItem(String title,String author,int publicationYear) {
		this.author = author;
		this.publicationYear = publicationYear;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	
	public void setNewPublicationYear(int newPublicationYear) {
		this.publicationYear = newPublicationYear;
	}
	
	public void setNewAuthor(String newAuthor) {
		this.author = newAuthor;
	}
	
	public void setNewTitle(String newTitle) {
		this.title = newTitle;
	}
	
	public String toString() {
		return "The  title " + title + " author " + author + " publication year " + publicationYear;
	}
	
	
}
