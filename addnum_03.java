import java.util.Scanner;

class addnum_03 {
    public static void main(String[] args){
        // declare value of a and b
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // sum of two numbers
        int sum = a + b;
        System.out.println(sum);

        // diffrence between two numbers
        int diff = a - b;
        System.out.println(diff);

    }
}