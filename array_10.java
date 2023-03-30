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

    }
}