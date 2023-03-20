import java.util.*;

public class conditionstatment_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // if else conditional statements
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        // if else if conditional statements
        if (x >= 4) {
            System.out.println("value of x is grater the 4");
        } else if (x <= 4) {
            System.out.println("value of x is smaller then 4");
        } else {
            System.out.println("nothing");
        }

        int button = sc.nextInt();

        // switch conditional statement
        switch (button) {
            case 1:
                System.out.print("you enter 1");
                break;
            case 2: {
                System.out.println("you enter 2");
                System.out.println("how much you learned java :) hehe..");
            }
                break;
            default:
                System.out.println("invalid");
        }
    }
}