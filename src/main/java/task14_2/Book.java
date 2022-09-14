package task14_2;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    @Override
    public int compareTo(Book book) {
        return this.isbn - book.getIsbn();
    }

    public int getIsbn() {
        return isbn;
    }
}
