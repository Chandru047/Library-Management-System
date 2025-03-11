public class DigitalLibrary extends Library
{
    public void start()
    {
        loop:while (true)
        {
            System.out.println("1.Add   2.Remove  3.Search  4.Borrow 5.List Books 6.Download 7.Exit(D-Library)");
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
                    downloadBooks();
                    break;
                case 7 :
                    break loop ;
                default:
                    System.out.println("Enter a valid option ");
            }
        }

    }
    static public void downloadBooks()
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
                    if(temp.isDigital())
                    {
                        System.out.println("Book Downloaded Successfully");
                    }
                    else
                    {
                        System.out.println("The mentioned book is not available as digital");
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
                    if(temp.isDigital())
                    {
                        System.out.println("Book Downloaded Successfully");
                    }
                    else
                    {
                        System.out.println("The mentioned book is not available as digital");
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
            if(temp.isDigital())
            {
                System.out.println("---------------------------------------");
                System.out.println(temp);
                System.out.println("---------------------------------------");
            }

        }
    }
}
