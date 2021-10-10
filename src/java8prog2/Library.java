package java8prog2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Library {

    int bookId;
    String name, author;
    int quantity;

    public Library(int bookId, String name, String author, int quantity) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        Map<Integer, Library> map = new LinkedHashMap<Integer, Library>();

        Library b1 = new Library(101,"Dollar Bahu", "Sudha Murthy", 8);
        Library b2 = new Library(102,"Wise and Otherwie","SudhaMurthy", 4);
        Library b3 = new Library(103, "The Post Office","Rabindranath Tagore",6);
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        for(Map.Entry<Integer, Library> entry : map.entrySet()) {
            int key = entry.getKey();
            Library b = entry.getValue();
            System.out.println(b.bookId+ " "+b.name+" "+b.author+" "+b.quantity);
        }
    }
}