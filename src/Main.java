public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Franz Kafka");
        Author author2 = new Author("Antoine de Saint-Exupéry");

        Book book1 = new Book("La Metamorfosis",author1,3.44);

        book1.getInfo();

        author1.addBook(book1);
        author1.addBook("Carta al padre",4.55);

        for(int i=0; i<author1.getBooks().size(); i++){
            System.out.println(author1.getBooks().get(i).getTitle());
        }
    }
}