import java.util.*;

public class string_13 {
    public static void main(String[] args) {
        // string Delaration

        // String name = "rohit";
        // String fullname = "rohit bhure";
        // String sentence = "hello i am rohit bhure from indore";

        Scanner sc = new Scanner(System.in);

        // String user = sc.next(); // for single word
        String user = sc.nextLine(); // for multiple words
        System.out.println("your name is : " + user);

        // String methods

        // concatenation
        String name = "rohit";
        String surname = "bhure";
        String full_name = name + "@" + surname;
        System.out.println(full_name);
        // rohit@bhure

        // length
        System.out.println(full_name.length());
        // 11

        // compare
        String name1 = "Rohit";
        String name2 = "Rohit";

        // 1. s1 > s2 : +ve value
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : -ve value

        // hello cello
        // cello is greatest because c comes first in abcd

        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

    }
}