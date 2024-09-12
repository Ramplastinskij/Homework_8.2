class Book {
    private final String title;
    private final Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString() {
        return title + " by " + author + " (" + publicationYear + ")";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && publicationYear == book.publicationYear;
    }
    public int hashCode() {
        return title.hashCode() + author.hashCode() + publicationYear;
    }
}