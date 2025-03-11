public class Book
{
    private final String title ;
    private final String author ;
    private final String isbn ;
    private boolean isAvailable ;
    private final boolean isDigital;

    Book(String title , String author , String isbn , boolean isDigital)
    {
        this.title = title ;
        this.author = author ;
        this.isbn = isbn ;
        this.isAvailable = true ;
        this.isDigital = isDigital;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void setAvailable(boolean temp)
    {
        isAvailable  = temp;
    }

    public boolean isDigital()
    {
        return isDigital;
    }

    public String toString()
    {
        return "title = " +this.getTitle() +"\n"+ "ISBN = "+ this.getIsbn() +"\n"+ "Author = "+this.getAuthor() +"\n"+ "Availability = " +this.isAvailable() +"\n"+ "Digital = " +this.isDigital();
    }
}
