import java.util.Scanner;

public class Library implements Actions
{
    static Scanner in = new Scanner(System.in);
    public void start()
    {
        System.out.println("------------------------------");
        System.out.println("Welcome to the Library");
        System.out.println("Would u like to Digital Library Mode");
        Library library = new DigitalLibrary();
        loop : while (true)
        {

            System.out.println("Would u like to Digital Library Mode(Y/n)");
            String opt = in.nextLine();
            if(opt.equals("y"))
                library.start();
            System.out.println("Available options are listed below");
            System.out.println("1.Add   2.Remove  3.Search  4.Borrow 5.List Books 6.Exit");
            int choice = Integer.parseInt(in.nextLine());

            switch (choice)
            {
                case 1:
                    add();
                    break;
                case 2 :
                    remove();
                    break;
                case 3 :
                    search();
                    break;
                case 4 :
                    borrow();
                    break;
                case 5 :
                    listBooks();
                    break;
                case 6 :
                    break loop ;
                default:
                    System.out.println("Enter a valid option ");

            }
        }

    }

    public void add()
    {
        System.out.println("Enter the Title of the book : ");
        String title = in.nextLine();

        System.out.println("Enter the Author of the book : ");
        String author = in.nextLine();

        System.out.println("Enter the ISBN of the book : ");
        String isbn = in.nextLine();

        System.out.println("Enter y if digital");
        String digital = in.nextLine();
        boolean isDigital = digital.equals("y");
        System.out.println("Book Added Successfully");
        LibraryPojo.getBooks().add(new Book(title , author , isbn , isDigital));
    }

     public void remove()
    {
        System.out.println("The Book can be removed using");
        System.out.println("1.title  2.ISBN");
        System.out.println("Enter your choice : ");
        int choice = Integer.parseInt(in.nextLine());
        if(choice == 1)
        {
            System.out.println("Enter the Title of the book");
            String title = in.nextLine();
            LibraryPojo.getBooks().removeIf(temp -> temp.getTitle().equals(title));
            System.out.println("Book Removed Successfully");
        }
        else if(choice == 2)
        {
            System.out.println("Enter the ISBN of the book");
            String isbn = in.nextLine();
            LibraryPojo.getBooks().removeIf(temp -> temp.getTitle().equals(isbn));
            System.out.println("Book Removed Successfully");
        }
        else
        {
            System.out.println("Enter a valid option");
        }
    }

    public void search()
    {
        System.out.println("The Book can be Searched using");
        System.out.println("1.title  2.Author");
        System.out.println("Enter your choice : ");
        int choice = Integer.parseInt(in.nextLine());
        if(choice == 1)
        {
            System.out.println("Enter the Title of the book");
            String title = in.nextLine();
            for(Book temp : LibraryPojo.getBooks())
            {
                if(temp.getTitle().equals(title))
                {
                    System.out.println("The mentioned book is available");
                }
                else
                {
                    System.out.println("The mentioned book is not available");
                }
            }
        }
        else if(choice == 2)
        {
            System.out.println("Enter the author of the book");
            String author = in.nextLine();
            search(author);
        }
        else
        {
            System.out.println("Invalid option");
        }
    }

    public void search(String author)
    {
        for(Book temp : LibraryPojo.getBooks())
        {

            if(temp.getAuthor().equals(author))
            {
                System.out.println(temp.getTitle());
            }
            else
            {
                System.out.println("No books available for the mentioned author");
            }
        }
    }

    public void borrow()
    {
        System.out.println("The Book can be selected using");
        System.out.println("1.title  2.ISBN");
        System.out.println("Enter your choice : ");
        int choice = Integer.parseInt(in.nextLine());
        if(choice == 1)
        {
            System.out.println("Enter the title : ");
            String title = in.nextLine();
            for(Book temp : LibraryPojo.getBooks())
            {
                if(temp.getTitle().equals(title))
                {
                    if(temp.isAvailable())
                    {
                        temp.setAvailable(false) ;
                        System.out.println("Book Borrowed Successfully");
                    }
                    else
                    {
                        System.out.println("The mentioned book is currently not available");
                    }
                }
                else
                {
                    System.out.println("Enter an valid available title");
                }
            }
        }
        else if (choice == 2)
        {
            System.out.println("Enter the ISBN : ");
            String isbn = in.nextLine();
            for(Book temp : LibraryPojo.getBooks())
            {
                if(temp.getIsbn().equals(isbn))
                {
                    if(temp.isAvailable())
                    {
                        temp.setAvailable(false) ;
                        System.out.println("Book Borrowed Successfully");
                    }
                    else
                    {
                        System.out.println("The mentioned book is currently not available");
                    }
                }
                else
                {
                    System.out.println("Enter an valid available title");
                }
            }
        }
    }

    public void listBooks()
    {
        if(LibraryPojo.getBooks().isEmpty())
        {
            System.out.println("No Books Currently Available");
        }
        for(Book temp : LibraryPojo.getBooks())
        {
            System.out.println("---------------------------------------");
            System.out.println(temp);
            System.out.println("---------------------------------------");
        }
    }
}
