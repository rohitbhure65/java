public class quiz_05 {
    public static void main(String[] args){
        int a = 10,b = 5;

        // priority * / % > + - 
        int ans1 = a * b / a - b;
        int ans2 = (a * b) / (a - b);

        System.out.println(ans1);
        // 10 * 5 / 10 - 5
        // 50 / 10 - 5
        // 5 - 5
        // 0

        System.out.println(ans2);
        // (10 * 5) / (10 - 5)
        // 50 / 5
        // 10

    }
}