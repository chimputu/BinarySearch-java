
//Binary search algorith in java 
//An algorithm that finds the position of an element in an array sorted list 


import java.util.*;

public class App{
    public static void main(String[]args){


        int[] arr = new int[100];
        int target = 42;


        for (int i=0; i<arr.length; i++){
            arr[i] = i;
        }

        int index = Arrays.binarySearch(arr, target);
        if (index >= 0) {
            System.out.println("Found target " + target + " at index " + index);
        } else {
            System.out.println("Target " + target + " not found");
        }
    }
    public static int binarySearch(int []arr,int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int middle = low + (high-low)/2;
            int value = arr[middle];

            System.out.println("Middle value" + middle);

            if(value<target)low = middle + 1;
            else if (value > target) high = middle -1;
            
            else return middle;//Target found

            
        }

        return -1;// Target not found
    }
}