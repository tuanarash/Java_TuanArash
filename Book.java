    public class Book {       // Overload constructor 
    
    public String title;
    public String author;
    public double price;
    public int publicationYear;

    public Book() {
        this.title = "Java Basic";
        this.author = "Arash";
        this.price = 100.0;
        this.publicationYear = 2001;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 200.0;
        this.publicationYear = 2005;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = 2009;
    }

    public Book(String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public void printBookDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
        System.out.println("Publication Year: " + this.publicationYear);
    }

    public static void main(String[] args) {
        
        Book book1 = new Book();
        System.out.println("Book 1 Details:");
        book1.printBookDetails();

        Book book2 = new Book("Java Advance", "Tuan");
        System.out.println("\nBook 2 Details:");
        book2.printBookDetails();

        Book book3 = new Book("Java Profesional", "Zurkanain", 300.0);
        System.out.println("\nBook 3 Details:");
        book3.printBookDetails();

        Book book4 = new Book("Java God", "Bin", 400.0, 1999);
        System.out.println("\nBook 4 Details:");
        book4.printBookDetails();
    }
}

