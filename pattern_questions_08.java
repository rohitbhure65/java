import java.util.*;

public class pattern_questions_08{
    public static void main(String[] args) {
        //we use nested loop for making patterns
        Scanner bn = new Scanner(System.in);
        int n = bn.nextInt(); // no of star in y axis
        int m = bn.nextInt(); // no of star in x axis

        
        
        /* Q.1 FOR SOLID RECTANGLE
        
        // outer loop
        for(int i = 1; i <= n; i++){ // for y axis

            // inner loop
            for(int j = 1; j <= m; j++){ // for x axis
                System.out.print("*");
            }

            System.out.println();
        }
        */

        /* Q.2 FOR HOLLOW RECTANGLE
        // outer loop
        for(int i = 1; i <= n; i++){
            // innter loop
            for(int j = 1; j <= m; j++){
            // cell -> (i,j)
            if(i==1 || j==1 || i==n || i==m){
                System.out.print("*");
            } 
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
       }
       */   
    }
}