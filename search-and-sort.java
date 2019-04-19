public class SearchAndSort {
  public static void main(String[]args) {
    // Three sorts for the exam are selection sort, insertion sort, and merge sort
    // One sort for the exam is binary sort
    
    // Methods shown will assume arrays of ints (Strings sort by ASCII, with lowercase being higher in value than uppercase)
  }
  
  /* BINARY SEARCH
   * Precondition: collection is passed in already sorted.
   * Summary: searches middle term and compares the key and searches either left or right of the middle term until it finds the key
   * Postcondition: returns -1 if key not found or index of key if found
   */
  public static int binarySearch(int[] arr, int key, int lowest, int highest) {
    // assigns high and low indexes, initiates middle index
    int low = 0;
    int high = arr.length - 1;
    int mid = 0;

    // iterates over arr to search for the key
    while(low <= high) {
      mid = (low + high) / 2;
      
      // checking middle index and identifying whether to go left or right of middle
      if (arr[mid] == numKey) {
        return mid;
      } else if (arr[mid] < number) {
        low = mid + 1;
      } else {
         high = mid - 1;
      }
    }
    return -1;
  }
  
  /* SELECTION SORT
   */
  public static void selectionSort(int[] arr) {
    
  }
  
  /* INSERTION SORT
   */
  public static void insertionSort(int[] arr) {
    
  }
}
