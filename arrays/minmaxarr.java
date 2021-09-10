package arrays;

import java.util.Scanner;

public class minmaxarr {

	static class pair {
        int min;
        int max;
    }
    
    public static void main(String[] args) {
        int i, n;
        System.out.print("Enter the n and array elements\n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[200];
        for(i = 0; i < n ; i++){
            arr[i]= sc.nextInt();
        }
        pair minmax = getMinMax(arr, n);
        //pair minm = getMinMax(int arr[], int low, int high);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
        sc.close();
    }

    static pair getMinMax(int[] arr, int n){
        // complexity : o(n) 
        //In this method, the total number of comparisons is 1 + 2(n-2) in the worst case and 1 + n – 2 in the best case. 
        //In this implementation, the worst case occurs when elements are sorted in descending order and the best case occurs when elements are sorted in ascending order.
        pair minmax = new  pair();

        int i;
 
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
}

    /*static pair getMinMax(int arr[], int low, int high) {
        pair minmax = new pair();
        pair mml = new pair();
        pair mmr = new pair();
        int mid;
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }
        return minmax;
    }*/