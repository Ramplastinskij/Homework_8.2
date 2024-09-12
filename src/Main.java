public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Leo", "Tolstoy");
        Author author2 = new Author("Fyodor", "Dostoevsky");

        Book book1 = new Book("War and Peace", author1, 1869);
        Book book2 = new Book("Crime and Punishment", author2, 1866);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Correction of the publication date");
        book1.setPublicationYear(1873);
        System.out.println(book1);
    }
}