package lesson53;

public class Book implements Comparable<Book> {

  private String author;
  private String title;
  private int pages;

  public Book(String author, String title, int pages) {
    this.author = author;
    this.title = title;
    this.pages = pages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public int compareTo(Book o) {
    int authorComparison = this.author.compareTo(o.author);
    if (authorComparison != 0) {
      return authorComparison;
    }
    int titleComparison = this.title.compareTo(o.title);
    if (titleComparison != 0) {
      return titleComparison;
    }
    return Integer.compare(this.pages, o.pages);
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", pages=" + pages +
        '}';
  }
}
