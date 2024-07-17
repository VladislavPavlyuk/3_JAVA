/*Завдання 5:
Реалізуйте клас “Книга”. Необхідно зберігати в полях класу:
назву книги,
ПІБ автора,
рік випуску,
назва видавництва,
жанр книги,
кількість сторінок.
Реалізуйте конструктори і методи класу для введення даних, реалізуйте доступ до окремих полів через методи класу.
Використайте механізм перевантаження методів.*/

import java.time.LocalDate;

enum Genre {
    History,
    Action,
    Comedy,
    Crime,
    Speculative,
    Fantasy,
    Horror,
    ScienceFiction,
    Romance,
    Nonfiction,
    Novel }

public class Book {
    private String title; //назва книги,
    private String author; //ПІБ автора,
    private LocalDate yearPublished; //рік випуску,
    private String publisher; //назва видавництва,
    private Genre genre; //жанр книги,
    private int pages;  //кількість сторінок.

    public Book() {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.genre = genre;
        this.pages = 0;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        if (Genre.valueOf(genre)!=null)
            this.genre = Genre.valueOf(genre);
        else throw new IllegalArgumentException();
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getYearPublished() {
        return yearPublished;
    }
    public void setYearPublished(String date) {
        LocalDate yearPublished = LocalDate.parse(date);
        this.yearPublished = yearPublished;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        if (title != null) {
            return "Book \n[title : " + title + ",\n author : " + author + ",\n yearPublished : " + yearPublished
                    + ",\n publisher : " + publisher + ",\n genre : " + genre + "]\n";
        } else {
            return "Please clarify the name of the book\n";
        }
    }

}

