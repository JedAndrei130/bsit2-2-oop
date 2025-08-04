public class Main {
    public static void main(String[] args) {
        book book1 = new book("Tristan", "George Orwell", 328);
        book book2 = new book("To Kill a Mockingbird", "Harper Lee", 281);
        book book3 = new book("The Great Gatsby", "F. Scott Fitzgerald", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}