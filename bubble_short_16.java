public class bubble_short_16 {

  // function for print shorted array
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  // main function
  public static void main(String[] args) {
    // unsorted array
    int arr[] = { 4, 2, 89, 45, 3, 76, 53, 86 };

    // Bubble Sort
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // Swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    // Call printArray function
    printArray(arr);
  }
}