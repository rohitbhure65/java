import java.util.Scanner;

public class function_09 {
    // public static int printSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    public static void printfactorial(int n){
        int factorial = 1;
        if (n<0) {
            System.out.println("invalid number");
            return;
        }
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        int n = sc.nextInt();


        // System.out.println("sum of two numbers in "+ printSum(a, b));

        // factorial
        printfactorial(n);
        
    }
}