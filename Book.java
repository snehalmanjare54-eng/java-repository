package Assig1;

class Book {
    int bookId;
    String bookName;
    double price;

    Book(int id, String name, double p) {
        bookId = id;
        bookName = name;
        price = p;
    }

    void display() {
        System.out.println(bookId + " " + bookName + " " + price);
    }

    public static void main(String args[]) {
        Book b[] = new Book[5];

        b[0] = new Book(1, "Java", 300);
        b[1] = new Book(2, "Python", 350);
        b[2] = new Book(3, "C++", 250);
        b[3] = new Book(4, "DBMS", 400);
        b[4] = new Book(5, "HTML", 200);

        for(int i = 0; i < 5; i++)
            b[i].display();
    }
}