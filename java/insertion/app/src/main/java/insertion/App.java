/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion;

import java.util.Arrays;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }


  /////////////////////////////////////// code challenge 26 //////////////////////////////////////////////////////////
  public static int[] insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int j = i - 1;
      int temp = arr[i];

      while (j >= 0 && temp < arr[j]) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
    return arr;
  }

  //////////////////////////////////////// code challenge 27 //////////////////////////////////////////////////////////

  public static void merge(int[] left, int[] right, int[] arr) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k++] = left[i];
        i++;
      } else {
        arr[k++] = right[j];
        j++;
      }
    }
    while (i < left.length) {
      arr[k++] = left[i++];
    }
    while (j < right.length) {
      arr[k++] = right[j++];
    }
  }

  public static int[] mergeSort(int[] arr) {
    int n = arr.length;
    if (n > 1) {
      int mid = n / 2;
      int[] l = new int[mid];
      int[] r = new int[n - mid];

      for (int i = 0; i < mid; i++) {
        l[i] = arr[i];
      }
      for (int i = mid; i < n; i++) {
        r[i - mid] = arr[i];
      }
      mergeSort(l);
      mergeSort(r);
      merge(l, r, arr);
    }
    return arr;
  }
///////////////////////////////////////////////////////////////code challenge 28 /////////////////////////////////////
  private static int partition(int[] arr, int low, int high) {
  int pivot = arr[high];
  int i = (low - 1);

  for (int j = low; j <= high-1; j++) {
    if (arr[j] <= pivot) {
      i++;

      swap(arr , i , j);
    }
  }
  swap(arr,i+1,high);
  return (i+1);
}

  public static int[] quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int p = partition(arr, low, high);

      quickSort(arr, low, p - 1);
      quickSort(arr, p + 1, high);
    }
    return arr;
  }

  public static void swap(int[] arr , int i , int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;

  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

//    int[] arr = {8, 4, 23, 42, 16, 15};
//    System.out.println(Arrays.toString(insertionSort(arr)));
//
//    //Reverse-sorted
//    int[] arr1 = {20, 18, 12, 8, 5, -2};
//    System.out.println(Arrays.toString(insertionSort(arr1)));
//
//    //few uniques
//    int[] arr2 = {5, 12, 7, 5, 5, 7};
//    System.out.println(Arrays.toString(insertionSort(arr2)));
//
//    //Nearly-sorted
//    int[] arr3 = {2, 3, 5, 7, 13, 11};
//    System.out.println(Arrays.toString(insertionSort(arr3)));
/////////////////////////////////////////////////////////// code challenge 27 /////////////////////////////////////////
//    int[] array = {8, 4, 23, 42, 16, 15};
//    System.out.println(Arrays.toString(mergeSort(array)));
///////////////////////////////////////////////////////////code challenge 28 //////////////////////////////////////////
    int[] Array = {8,4,23,42,16,15};
    System.out.println(Arrays.toString(quickSort(Array,0,5)));


  }

}
