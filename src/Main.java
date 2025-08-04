public class Main {
    public static void main(String[] args) {
        book book1 = new book("Tristan the MightyMan", "Tristan Amparo", 328);
        book book2 = new book("Bob the Anjo Slayer", "Anjo Tommy", 281);
        book book3 = new book("Anjo the Dark Knight", "Jed Surabasquez", 180);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}