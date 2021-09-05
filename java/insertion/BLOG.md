# Inseration Sort 26
# Inseration Sort
-  sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence. The traversal keeps track of the minimum value and places it in the front of the array which should be incrementally sorted.

## Pseudocode

SelectionSort(int[] arr)

    DECLARE n <-- arr.Length;

    FOR i = 0; i to n - 1  
        DECLARE min <-- i;
        FOR j = i + 1 to n
            if (arr[j] < arr[min])
                min <-- j;

        DECLARE temp <-- arr[min];
        arr[min] <-- arr[i];
        arr[i] <-- temp;


## Trace
Sample Array: [8,4,23,42,16,15]

![whiteboard](./images/blog.PNG)


## Efficiency
1. Time -> O(n^2)
2. Space -> O(n)


# Merge Sort 26
- take multiple sorted lists as input and produce a single list as output, containing all the elements of the inputs lists in sorted order.

## Pseudocode

ALGORITHM Mergesort(arr)

    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)


ALGORITHM Merge(left, right, arr)

    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left


## Trace
Sample Array: [8,4,23,42,16,15]

![whiteboard](./images/blog27.PNG)


## Efficiency
1. Time -> O(n log n)
2. Space -> O(n)



# Merge Sort 28
- take an array and two values one for low and one for high to compare the values and return sorted array

## Pseudocode

ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp


## Trace
Sample Array: [8,4,23,42,16,15]

![whiteboard](./images/blog28.PNG)


## Efficiency
1. Time -> O(n)
2. Space -> O{1)

