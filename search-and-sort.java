public class SearchAndSort {
  public static void main(String[]args) {
    // Three sorts for the exam are selection sort, insertion sort, and merge sort
    // Two sorts for the exam are binary search and sequential search
    
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
    while (low <= high) {
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
   * Array may be unsorted, but will still run through each term
   */
  public static void selectionSort(int[] arr) {
    // sorts through each term and finds minimum after it in the arr
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[index]) {
          index = j;
        }
      
        // swapping min and term at arr[i]
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }
  }
  
  /* INSERTION SORT
   * Array may be unsorted, but will still run through each term
   */
  public static void insertionSort(int[] arr) {
    int n = array.length;
    
    // compares two successive terms and moves the second term back
    for (int j = 1; j < n; j++) {
      int key = array[j];
      int i = j-1;
      
      // continuously moves term back if it is less than the term before it
      while ( (i > -1) && ( array [i] > key ) ) {
        array [i+1] = array [i];
        i--;
      }
      array[i+1] = key;
    }
  }
}
