package javaapplication1;
import java.util.ArrayList;
import java.util.HashMap;
import javaapplication1.Book;


public class BookLibrary {
 
    private HashMap<String, Book> lib;
    
    public BookLibrary()
    {
        this.lib = new HashMap<String, Book>();
    }
    
    public void addBook(Book b1)
    {
        String name  = b1.getName();
        name = stringCleaner(name);
        if(this.lib.containsKey(name))
        {
            System.out.println("Already Present"); 
        }
        else
        {
            this.lib.put(name, b1);
        }
    }
    
    public void removeBook(String bookName) {

        bookName = stringCleaner(bookName);
        if(this.lib.containsKey(bookName)) 
        {
            lib.remove(bookName);
        } 
        
        else 
        {
            System.out.println("The book was not found, you can't remove it!");
        }
    }
    
    public Book getBook(String beg)
    {
        for(String key : lib.keySet())
        {
            if(key.startsWith(beg))
            {
                return lib.get(key);
            }
        }
        return null;
    }
    
    public ArrayList<String> getBookList()
    {
        return new ArrayList<String>(lib.keySet());
    }
    
    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
    
}
