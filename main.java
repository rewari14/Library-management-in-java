package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    ArrayList<String> l = new ArrayList<String>();    
        
    Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "shubham loves this book");
    Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "shubham hates this book");
    Book b1 = new Book("Hello Brother", 1814, "shubham hates this book");
    Book b2 = new Book("Kabaali", 2016, "shubham loves this book");

    
    BookLibrary lib = new BookLibrary();
   
    lib.addBook(prideAndPrejudice);
    lib.addBook(senseAndSensibility);
    lib.addBook(b1);
    lib.addBook(b2);
   
    l = lib.getBookList();
    
    for(String b : l)
    {
        System.out.println(b);
    }
       
    Book a =  lib.getBook("hell");
        System.out.println(a);
        
        
    }

   
}
