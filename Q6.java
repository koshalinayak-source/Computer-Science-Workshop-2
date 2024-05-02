package GenericsAndCollectionPart2;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        /*
        6. Write a program to create a TreeSet of Integer type and perform the below
           operation on it.
        (a.) Display the TreeSet
        (b.) Ask the user to enter a number and search that number is it present in the
             list or not.
        (c.) Remove an element from tree.
         */
        Set<Integer> s = new TreeSet<>();
        s.add(19);
        s.add(41);
        s.add(10);

        //(a.) Display the TreeSet
        System.out.println(s);
        Scanner sc = new Scanner(System.in);

        //(b.) Ask the user to enter a number and search that number is it present in the  list or not.
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(s.contains(num)){
            System.out.println("Number Exists in the Set");
        }
        else{
            System.out.println("Number does not Exist");
        }

        //(c.) Remove an element from tree.
        System.out.println("Enter a element You want to remove");
        int r=sc.nextInt();
        s.remove(r);
        System.out.println(s);
    }
}
