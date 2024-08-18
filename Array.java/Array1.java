import java.util.*;

public class Array1 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    // Method to find the largest number in an array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparison
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length - 1;

        while(first < last){
            // swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; // 2,4,6,8,10
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("{" + curr + "," + numbers[j] + "}");
            }
            System.out.println();
        }
    }

    public static void printSubarrays(int numbers[] ){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxSubarraySum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        
        }
        System.out.println("max sum = " + maxSum);
    }

    // PREFIX sum 
    public static void prefixSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];
 
        prefix[0] = numbers[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs  = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : "+ ms);
    }

    public static void main(String[] args) {
        // int marks[] = {97, 98, 99};
        // update(marks);
        
        // // Print the updated array
        // System.out.println("Updated marks:");
        // for(int mark : marks) {
        //     System.out.print(mark + " ");
        // }

        // linearSearch 
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;

        // int index = linearSearch(numbers, key);
        // if(index == -1){
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key is at index: " + index);
        // }
        
        // Find the largest number in an array
        // int numbers[] = {1, 2, 6, 3, 5};
        // System.out.println("Largest number is: " + getLargest(numbers));

        // BinarySearch 
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        // int key = 10;

        // System.out.println("Index for key is: " + binarySearch(numbers, key));

        // Reverse 
        // int numbers[] = {2, 4, 6, 8, 10};
        // reverse(numbers);
        // // Print
        // for(int i=0; i<numbers.length; i++){
        //     System.out.print(numbers[i] + " ");
        // }
        // System.out.println();

        // Pairs of numbers
        // int numbers[] = {2, 4, 6, 8, 10};
        // printPairs(numbers);

        // Print subarrays
        // int numbers[] = {2, 4, 6, 8, 10};
        // printSubarrays(numbers);

        // int numbers[] = {1, -2,6,-1,3};
        // prefixSum(numbers);

        // kadanes algorithm 
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}
