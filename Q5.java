package GenericsAndCollectionPart2;
import java.util.*;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public boolean equals(Book b){
        return this.id==b.id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

public class Q5 {
    public static void main(String[] args) {
        /*
        Create a Class Book that has id, name, author and quantity
        for each book issued. The Book class should define a parameterised constructor.
        Design a class Library that create a HashMap of books which contains
        an entry of key as Integer and value as Book object.
        Instantiate atleast two Book objects and display the collection of
        books in the HashMap.
        Use proper method of HashMap class to return the following things
       (a.) Check if a particular book name is present in the map
       (b.) remove the value associated with a particular key value
            which will remove the book entry.
         */
        HashMap<Integer,Book> book = new HashMap<>();
        book.put(1,new Book(1234,"Book1","koshali",50));
        book.put(2,new Book(5678,"Book2","komal",60));
        book.put(3,new Book(9101,"Book3","amita",30));

        System.out.println();
        // (a.) Check if a particular book name is present in the map
        System.out.println("Enter book name if it exists return true else false");
        Scanner sc = new Scanner(System.in);
        String nam=sc.next();
        boolean check=false;
        for (Book b : book.values()) {
            if (b.getName().equals(nam)) {
                check = true;

                System.out.println(b);
                break;
            }
        }
        if(check==true){
            System.out.println("Book exist");
        }
        else {
            System.out.println("Not Found");
        }
        // (b.) remove the value associated with a particular key value which will remove the book entry.

        System.out.println();
        System.out.println("Enter the key of book you want to remove");
        int key = sc.nextInt();
        if (book.containsKey(key)){
            book.remove(key);
        }
        //Iterating the map
        Set set = book.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry map = (Map.Entry)it.next();
            System.out.println("Key :"+map.getKey());
            System.out.println(map.getValue());
        }


    }
}
