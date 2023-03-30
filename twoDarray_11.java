import java.util.*;

public class twoDarray_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int marks[][] = new int[rows][col];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // colums
            for (int j = 0; j < col; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // output
        // rows
        for (int i = 0; i < rows; i++) {
            // colums
            for (int j = 0; j < col; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

    }
}