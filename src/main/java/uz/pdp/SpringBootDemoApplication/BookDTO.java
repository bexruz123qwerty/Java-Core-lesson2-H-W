package uz.pdp.SpringBootDemoApplication;

public class BookDTO {
    private String name;
    private String author;

    public BookDTO(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public BookDTO(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
