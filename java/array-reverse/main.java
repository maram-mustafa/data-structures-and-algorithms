import java.lang.*;
public class main {

  public static int[] insertShiftArray(int[] arr, int number) {
    int newArray[] = new int[arr.length + 1];
    int middleIndex = (int) Math.ceil((double) arr.length/2);

    for (int i = 0; i < newArray.length; i++) {
      if (middleIndex == i) {
        newArray[i] = number;
      }else if(i > middleIndex){
          newArray[i]=arr[i-1];
        }else{
          newArray[i]=arr[i];
        }
      }
    }
    return newArray;
  }

  public static void main(String[] args) {
    int arr[] = {2,4,6,-8};
    for (int i : insertShiftArray(arr, 16)) {
      System.out.println(i);
    }
  }
}
