import java.util.Arrays;

public class Αlgorithms {

    public static void main(String[] args) {
        
        // TODO code application logic here
        int[] A = {8, 3, 9, 1, 0, 4, 2, 7, 6, 5};
        System.out.println("*** Insertion Sort ***");
        InsertionSort(A, A.length);
        System.out.println("");

        int[] B = {8, 3, 9, 1, 0, 4, 2, 7, 6, 5};
        System.out.println("*** Selection Sort ***");
        SelectionSort(B, B.length);
        System.out.println("");

        int[] C = {8, 3, 9, 1, 0, 4, 2, 7, 6, 5};
        System.out.println("*** Bubble Sort ***");
        BubbleSort(C, C.length);
        System.out.println("");

        int[] D = {8, 3, 9, 1, 0, 4, 2, 7, 6, 5};
        System.out.println("*** Quick Sort ***");
        System.out.println(Arrays.toString(D));
        System.out.println("");
        Quicksort(D, 0, D.length - 1);

        int[] E = {8, 3, 9, 1, 0, 4, 2, 7, 6, 5};
        int[] F = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        System.out.println("*** Merge Sort ***");
        System.out.println(Arrays.toString(E));
        System.out.println("");
        MergeSort(0, E.length - 1, E, F);
        System.out.println(Arrays.toString(E));
    }

    // **** Insertion sort ****
    public static void InsertionSort(int[] A, int n) {
        int j;
        for (j = 1; j < n; ++j) {
            int key = A[j];
            int i = j - 1;
            System.out.print("j=" + j + " ");
            System.out.println(Arrays.toString(A));

            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
        System.out.print("j=" + j);
        System.out.println(Arrays.toString(A));
    }

    // **** Selection Sort ****
    public static void SelectionSort(int[] A, int n) {
        int i;
           
        for (i = 0; i < n - 1; i++) {
            int min = i;
            System.out.print("i=" + i + " ");
            System.out.println(Arrays.toString(A));

             
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
             
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
        System.out.print("i=" + i + " ");
        System.out.println(Arrays.toString(A));
    }
 
    // **** Bubble Sort ****
    static void BubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        System.out.println(Arrays.toString(arr));
        for (i = 0; i < n - 1; i++) {

            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // ανταλαγή arr[j] και arr[j+1] 
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    System.out.print("i=" + (i + 1) + " ");
                    System.out.println(Arrays.toString(arr));
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }

    
    // **** Quick sort ****
    public static void Quicksort(int number[], int first, int last) {
        int i, j, pivot, temp;

        if (first < last) {
            pivot = first;
            i = first;
            j = last;

            while (i < j) {
                while (number[i] <= number[pivot] && i < last) {
                    i++;
                }
                while (number[j] > number[pivot]) {
                    j--;
                }
                if (i < j) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                    System.out.println("left=" + (first + 1) + ", right=" + (last + 1) + ", pivot=" + number[pivot]);
                    System.out.println(Arrays.toString(number));
                    System.out.println("");
                }
            }

            temp = number[pivot];
            number[pivot] = number[j];
            number[j] = temp;
            System.out.println("left=" + (first + 1) + ", right=" + (last + 1) + ", pivot=" + number[pivot]);
            System.out.println(Arrays.toString(number));
            System.out.println("");
            //Ο αλγόριθμος QuickSort είναι αναδρομικός
            Quicksort(number, first, j - 1);
            Quicksort(number, j + 1, last);
        }
    }

    // **** Mergesort ****
    public static void Merge(int left, int middle, int right, int A[], int B[]) {
        int first = left;
        int second = middle + 1;
        int temp = left;
        while (first <= middle && second <= right) {
            if (A[first] <= A[second]) {
                B[temp] = A[first];
                first++;
                System.out.println(Arrays.toString(B));
            } else {
                B[temp] = A[second];
                second++;
                System.out.println(Arrays.toString(B));
            }
            temp++;
        }

        System.out.println("");
        
        if (first <= middle) {
            for (int k = first; k <= middle; k++) {
                B[temp] = A[k];
                temp++;
            }
        } else {
            for (int k = second; k <= right; k++) {
                B[temp] = A[k];
                temp++;
            }
        }
        for (int k = left; k <= right; k++) {
            A[k] = B[k];
        }
    }

    // retroactive mergesort second class
    public static void MergeSort(int left, int right, int A[], int B[]) {
        if (left < right) {
            int middle = (left + right) / 2;
            System.out.println("MergeSort(" + (left + 1) + "," + (right + 1) + ")");
            MergeSort(left, middle, A, B);
            MergeSort(middle + 1, right, A, B);
            System.out.println("Merge(" + (left + 1) + "," + (middle + 1) + "," + (right + 1) + ")");
            Merge(left, middle, right, A, B);
        }
        System.out.println("MergeSort(" + (left + 1) + "," + (right + 1) + ")");

    }

}
