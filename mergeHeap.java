/*
 
Experiment -10 
Write a Java program to implement Merge & Heap sort of given elements AIM: 
To implement Merge and Heap sort of given elements by using java program ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class HeapMergeSort and create an obj for it and by considering input from                the user, sort the elements using mergesort and heapsort functions 
Step 4: Define merge function and declare required variables beg,mid and end and array               are [ ] and merge every elements after sorting the elements. 
Step 5: Define mergeSort function and if the begining element is less than the end element,              make mid as the avg of both the elements and recursively call the function to sort the               elements. 
Step 6: Define heapSort function and initially consider the length of the array and build heap              (rearrange array) by extracting one by one in element from heap taken in array and                move current root to end ,call max heapity on the reduced heap. To heapify a subtree                rooted with node i which is an index in arr[ ] n is size of heap. 
Step 7: Define heapify function and initialize largest as roots if left child is larger than root. 
Step 8: If right child larger than largest make r as largest. 
Step 9: If largest is not root, recursively heapify the affected subtree. Step10 :Stop. 
 

SOURCE CODE: */
import java.util.*; class HeapMergeSort { 
    public static void main(String[] args) { 
        HeapMergeSort h = new HeapMergeSort(); 
        Scanner s = new Scanner(System.in);         System.out.println("\t\tMerge Sort\n");         int n; 
        System.out.print("Enter range:"); 
        n = s.nextInt();         int[] arr = new int[n];          for (int i = 0; i < n; i++) {             arr[i] = s.nextInt(); 
        } 
        h.mergesort(arr, 0, n - 1);          System.out.println("Sorted Array:");          for (int j = 0; j < arr.length; j++) { 
            System.out.println(arr[j]); 
        } 
        System.out.println("\t\tHeap Sort");         System.out.print("Enter range:"); 
        n = s.nextInt();         int[] arr1 = new int[n];          for (int i = 0; i < n; i++) {             arr1[i] = s.nextInt(); 
        } 
        h.heapsort(arr1);  
        System.out.println("Sorted Array:");   for (int j = 0; j < arr1.length; j++) { 
            System.out.println(arr1[j]); 
        } 
        s.close(); 
    } 
    void merge(int arr[], int beg, int mid, int end) { 
        int l = mid - beg + 1;         int r = end - mid;         int LeftArray[] = new int[l];         int RightArray[] = new int[r];         for (int i = 0; i < l; ++i)             LeftArray[i] = arr[beg + i];          for (int j = 0; j < r; ++j)             RightArray[j] = arr[mid + 1 + j]; 
        int i = 0, j = 0;         int k = beg;         while (i < l && j < r) {             if (LeftArray[i] <= RightArray[j]) {                 arr[k] = LeftArray[i]; 
                i++;             } else {                 arr[k] = RightArray[j]; 
                j++;             }             k++;         }         while (i < l) {             arr[k] = LeftArray[i]; 
            i++;             k++;         }         while (j < r) {             arr[k] = RightArray[j]; 
            j++;             k++;         } 
    } 
    void mergesort(int arr[], int beg, int end) { 
        if (beg < end) {             int mid = (beg + end) / 2;             mergesort(arr, beg, mid);             mergesort(arr, mid + 1, end); 
            merge(arr, beg, mid, end); 
        } 
    } 
    public void heapsort(int arr[]) {         int n = arr.length;         for (int i = n / 2 - 1; i >= 0; i--)            heapify(arr, n, i);          for (int i = n - 1; i >= 0; i--) {             int temp = arr[0];             arr[0] = arr[i];             arr[i] = temp;             heapify(arr, i, 0); 
        }     } 
    void heapify(int arr[], int n, int i) {         int largest = i; // Initialize largest as root         int l = 2 * i + 1; // left = 2*i + 1         int r = 2 * i + 2; // right = 2*i + 2         if (l < n && arr[l] > arr[largest])             largest = l;         if (r < n && arr[r] > arr[largest]) 
            largest = r;         if (largest != i) {             int swap = arr[i];             arr[i] = arr[largest];             arr[largest] = swap; 
            heapify(arr, n, largest); 
        } 
    } 
} 

