package MergeShort;

public class MergeShort {

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Calculate the mid index
        int mid = si + (ei - si) / 2;

        // Recursively sort both halves
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // Iterator for the left part
        int j = mid + 1; // Iterator for the right part
        int k = 0;       // Iterator for the temp array

        // Merge the two sorted halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy any remaining elements of the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted subarray back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        PrintArr(arr); // Call to print the sorted array
    }
}
