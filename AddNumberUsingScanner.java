import java.util.Scanner;

class AddNumberUsingScanner {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();

        System.out.println("enter second number");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
