package GenericsAndCollectionPart2;
import java.util.*;
class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ArrayListUser{
    private ArrayList<User> arrayListUser;

    ArrayListUser(){
        this.arrayListUser=new ArrayList<>();
    }
    public void addUser(User user){
        arrayListUser.add(user);
    }
    public void PrintUser(){
        System.out.println("User");
        // iterate over each User object in the arrayListUser ArrayList
        for (User u: arrayListUser){
            System.out.println("Name :"+u.getName());
            System.out.println("Age :"+u.getAge());
        }

    }
    public void sortByAge(){
        arrayListUser.sort(Comparator.comparing(User::getAge));
    }
}

public class Q2 {
    public static void main(String[] args) {
        /*
        Write a Java code snippet that comprises of a User class
        and an ArrayListUser class. The User class should define
        private fields for name and age, along with a parameterized
        constructor and getter/setter methods for these attributes.
        Create an ArrayListUser class of User objects.
        After addition of objects, the ArrayListUser class should
        retrieve and print the name and age of users.
        Then, it should sort the user according to age using
        getter methods and print the updated array list of users.
         */
        User u = new User("Koshali", 19);
        User u1 = new User("Koshali", 18);
        User u2 = new User("Koshali", 40);


        ArrayListUser ar = new ArrayListUser();
        ar.addUser(u);
        ar.addUser(u1);
        ar.addUser(u2);
        ar.PrintUser();
        System.out.println("After sorting");
        ar.sortByAge();
        ar.PrintUser();
    }
}
