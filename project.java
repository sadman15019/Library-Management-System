import java.util.Date;
import java.util.concurrent.TimeUnit;


class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}


class Member extends Person{
    private int maxBooks=5;
     private static final double FINE_PER_DAY = 1.0;  // Fine amount per day
    public Member(String name, String id)
    {
        super(name, id);
    }
    
      public int getMaxBooks() {
        return maxBooks;
    }
    public String getName()
    {
        return "Member: " + super.getName();
    }
    
     public double calculateFine ( Date issueDate, Date returnDate ) 
     {
         long diff= returnDate.getTime()- issueDate.getTime();
         long diffDays= TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
         if(diffDays>30)
         {
             return (diffDays-30)*FINE_PER_DAY;
         }
         return 0.0;
     }
}

class Librarian extends Person{
      public Librarian(String name, String id)
    {
        super(name, id);
    }
}


class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isIssued;
    private Librarian issuedBy;
    private Date issueDate;
    private Member issuedTo;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }
    
    public Librarian getIssuedBy()
    {
        return issuedBy;
    }
    
    public void setIssuedBy(Librarian issuedBy)
    {
        this.issuedBy=issuedBy;
    }
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Member getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Member issuedTo) {
        this.issuedTo = issuedTo;
    }
}
    
    



public class Main {
    public static void main(String[] args) {
        
    }
}
