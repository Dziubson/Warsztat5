package pl.coderslab;

public class Book {
    private long Id;
    private String Iban;
    private String text;
    private String Autor;
    private String Wydawca;
    private String about;


    public Book(long id, String iban, String text, String autor, String wydawca, String about) {
        Id = id;
        Iban = iban;
        this.text = text;
        Autor = autor;
        Wydawca = wydawca;
        this.about = about;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", Iban='" + Iban + '\'' +
                ", text='" + text + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Wydawca='" + Wydawca + '\'' +
                ", about='" + about + '\'' +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getWydawca() {
        return Wydawca;
    }

    public void setWydawca(String wydawca) {
        Wydawca = wydawca;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
