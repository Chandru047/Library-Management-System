import java.util.ArrayList;

public class LibraryPojo
{
    static private final ArrayList<Book> books = new ArrayList<>();

    static public ArrayList<Book> getBooks()
    {
        return books;
    }
}
