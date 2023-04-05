public class bitmanipulation_15 {

  // Declare as a Globel variable
  static int n = 5; // 0101

  public static void get_Bit() {
    // Get bit
    // get the 3rd bit (position = 2) of a number n. (n -0101)

    // Bit mask : 1 << i
    // Operation : AND

    int position = 3;
    int bit_mask = 1 << position;

    System.out.println("Get_Bit");

    if ((bit_mask & n) == 0) {
      System.out.println("Bit was zero");
    } else {
      System.out.println("Bit was one");
    }
    // output : bit was zero
  }

  public static void set_Bit() {
    // set bit
    // set the 2nd bit (position = 1) of a number n. (n = 0101)
    // bit mask : 1<<i
    // operation : or

    int Position = 1;
    int bit_Mask = 1 << Position;
    int newNumber = bit_Mask | n;

    System.out.println("Set_Bit");
    System.out.println(newNumber);
    // output : 7

  }

  public static void main(String[] args) {
    get_Bit();
    set_Bit();
  }
}
