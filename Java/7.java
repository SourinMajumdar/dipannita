class Library {
    private int bookNo;

    public Library(int bookNo) {
        this.bookNo = bookNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
}

class Book extends Library {
    private String author;
    private String title;

    public Book(int bookNo, String author, String title) {
        super(bookNo);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

interface Language {
    String lang = "English";

    String getLanguage();
}

class Issue extends Book implements Language {
    public Issue(int bookNo, String author, String title) {
        super(bookNo, author, title);
    }

    @Override
    public String getLanguage() {
        return lang;
    }
}

public class Main {
    public static void main(String[] args) {
        Issue issue = new Issue(1, "John Doe", "The Art of Java");
        System.out.println("Book No: " + issue.getBookNo());
        System.out.println("Author: " + issue.getAuthor());
        System.out.println("Title: " + issue.getTitle());
        System.out.println("Language: " + issue.getLanguage());
    }
}