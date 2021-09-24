package arrays;

//shifting negative elements - order doesn't matter

public class shiftnegelements {

	public static void main(String[] args) {
		int[] ip = {-1,-2,3,8,-7,-5,4,-14,2,44,1,-20,6};
		int n = ip.length;
		//shiftMethod(ip,n);
		shiftLeft(ip);
		display(ip);
		
	}
	
	public static void display(int[] ip) {
		for(int i = 0; i< ip.length; i++) {
			System.out.print(ip[i]+" ");
		}
	}
	 public static void shiftMethod(int arr[], int n){
		 int j = 0, temp;
	     for (int i = 0; i < n; i++) {
	         if (arr[i] < 0) {
	             if (i != j) {
	                 temp = arr[i];
	                 arr[i] = arr[j];
	                 arr[j] = temp;
	             }j++;
	         }
	     }
	 }
	 
	 public static void shiftLeft(int[] arr) {
		int left = 0, right = arr.length-1;
		while (left <= right){
			if (arr[left] < 0 && arr[right] < 0)
			    left++;
			else if (arr[left] > 0 && arr[right] < 0){
			    int temp = arr[left];
			    arr[left] = arr[right];
			    arr[right] = temp;
			    left++;
			    right--;
			} else if (arr[left] > 0 && arr[right] > 0)
			    right--;
			else{
			    left++; right--;
			}
		}
	}
}
