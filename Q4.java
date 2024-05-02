package GenericsAndCollectionPart2;
import java.util.Scanner;
import java.util.LinkedList;

class Student {
    private String name;
    private int age;
    private int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }


    public boolean equals(Student s){
        //Override equals method checking if the two Student objects share all the same values.
        return this.name.equals(s.name)&& this.age==s.age&&this.marks==s.marks;
    }

}

public class Q4 {
    public static void main(String[] args) {
        /*
        Create a class Student having member variable name,
        age, and mark and required get and set methods.
        Create a LinkedList of Student type and perform the
        below operation on it.
       (a.) Display the list
       (b.) Ask the user to enter a Student object and
            print the existence of the object. Specify is the object is
            search according to reference or contain.
       (c.) Remove a specified Student object.
       (d.) Count the number of object present in the list.
       (e.)Override equals method checking if the two Student
           objects share all the same values.
         */
        LinkedList<Student> a = new LinkedList<>();
        a.add(new Student("Koshali",19,100));
        a.add(new Student("Komal",19,80));
        a.add(new Student("amita",30,60));
        System.out.println("Print"); // Display the list
        for (Student s : a){
            System.out.println(s.toString());
        }

        //Checked the existance in the List
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student name,age,marks to check Its existance");
        String nam = sc.next();
        int age=sc.nextInt();
        int mark=sc.nextInt();
        Student userInput = new Student(nam,age,mark);
        boolean exists = false;
        for (Student s : a) {
            if (s.equals(userInput)) {
                exists = true;
                break;
            }
        }
        if (exists==true) {
            System.out.println("Student exists in the list.");
            System.out.println("Search type: Contains");
        } else {
            System.out.println("Student does not exist in the list.");
            System.out.println("Search type: Reference");
        }

        System.out.println();


        a.remove(2); // Removed a specified Student object
        for (Student s : a){
            System.out.println(s.toString());
        }
        System.out.println();
        //Count the number of object present in the list.
        System.out.println("The number of object present in the list : "+a.size());

    }

}
