package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    ArrayList<String> l = new ArrayList<String>();    
        
    Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "Shubham loves this book");
    Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "Shubham hates this book");
    Book helloBrother = new Book("Hello Brother", 1814, "Shubham hates this book");
    Book kabaali = new Book("Kabaali", 2016, "Shubham loves this book");

    
    BookLibrary lib = new BookLibrary();
   
    lib.addBook(prideAndPrejudice);
    lib.addBook(senseAndSensibility);
    lib.addBook(helloBrother);
    lib.addBook(kabaali);
   
    l = lib.getBookList();
    
    for(String b : l)
    {
        System.out.println(b);
    }
       
    Book a =  lib.getBook("hell");
        System.out.println(a);
        
        
    }

   
}
