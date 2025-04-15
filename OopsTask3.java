class Book{
    String title;
    String author;
    int pages;

    Book(String title, String author, int pages) {
        this.title=title;
        this.author=author;
        this.pages=pages;
    }

    void getSummary(){
        System.out.println("Title of book is "+title);
        System.out.println("Author of book is "+author);
        System.out.println("Book is having "+pages +" pages\n");

    }
    
}
public class OopsTask3 {
    public static void main(String[] args) {
        Book b1 = new Book("Warmth", "Rithwik Singh", 87);
        Book b2 = new Book("The Unlovable", "Ankit Dixit", 92);

        b1.getSummary();
        b2.getSummary();
        
    }
}
