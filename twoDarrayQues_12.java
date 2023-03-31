import java.util.Scanner;

public class twoDarrayQues_12 {
    public static void main(String[] args) {
        // find a given number is 2D array
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        // input

        for (int i = 0; i < rows; i++) { // rows
            for (int j = 0; j < cols; j++) { // cols
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter any number that you input for searching");
        int x = sc.nextInt(); // input x value

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("number x was found at location at (" + i + ", " + j + ")");
                    return;
                }
            }
            System.out.println("number was not found");
        }
    }
}