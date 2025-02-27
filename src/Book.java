public class Book {

    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void getInfo(){
        System.out.println(this.title + " By:" + this.author.getName() + " " + this.price);
    }
}
