package proj;
import java.util.Arrays;
public class arrays {
	public static void main(String[] args) {
		int test[] = {1,2,3,4,5,6,7,8,9};
		int idx = Arrays.binarySearch(test, 5);
		System.out.println("the search idx is "+idx);
		int arr[] = {1,44,55,33,22,11,545,41,0,2,7,6};
		Arrays.sort(arr);
		Arrays.fill(arr, 12);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	
	
	}
}
