import java.util.*;

public class array_10{
    public static void main(String[] args) {
        // Array
        // type[] array_name = new type[size];
        // or 
        // type array_name[] = new type[size];

        int[] marks = new int[4];
        // integers takes 4 bytes of memory
        marks[0] = 30; // 4 bytes
        marks[1] = 3; // 4 bytes
        marks[2] = 60; // 4 bytes
        marks[3] = 20; // 4 bytes

        // total memory taks
        // 4+4+4+4
        // 16 bytes

        for(int i = 0; i<=3; i++){
            System.out.println(marks[i]);
        }

        // ---------------------------------

        // well define array size & variable
        int roll[] = {30,31,32,33,34,35};

        for (int i = 0; i < roll.length; i++) {
            System.out.println(roll[i]);
        }

        // ------------------------------------

        // set array size with variables
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); // input 10 memory allocate 10 x 4 bytes and store null value 0 if array type was integer if array type was flote then they store 0.0 as null value
        int[] phone = new int[size]; // size = 10

        // intput
        for (int i = 0; i < size; i++) {
            phone[i] = sc.nextInt(); // enter 10 numbers as a input
        }

        // output
        for (int i = 0; i < size; i++) {
            System.out.println(phone[i]); // print 10 numbers as a output
        }

    }
}