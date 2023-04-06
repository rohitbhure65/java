public class selection_sort_17 {

  // function for print shorted array
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  
  // main function
  public static void main(String[] args) {
    // unsorted array
    int arr[] = {4,2,77,3,5,64,32};

    // time complexity = 0(n^2) 
    // selection sort
    for(int i = 0; i<arr.length; i++){
        int smallest = i;
        for(int j = i+1; j<arr.length; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        // swap
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;
    }

    // Call printArray function
    printArray(arr);
  }
}