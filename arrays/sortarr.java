package arrays;
import java.util.Arrays;
public class sortarr {

	public static void main(String[] args) {
		int[] ip = {0,1,2,1,2,2,1,1,0,0,0,1,2,2,1,0};
		//sortArr(ip);
		//sortArray(ip);
		//sortArrayMeth(ip);
		Arrays.sort(ip);
		display(ip);
		
	}
	
	public static void display(int[] ip) {
		for(int i = 0; i< ip.length; i++) {
			System.out.print(ip[i]+"");
		}
	}
	
	public static void sortArr(int[] ip) {
		int n = ip.length;
		int[] count = new int[3];
	       for(int i=0; i<n; i++){
	           count[ip[i]]++;
	       }
	       int set = 0;
	       for(int i=0; i<3; i++){
	           for(int j=0; j<count[i]; j++){
	               ip[set] = i;
	               set++;
	           }
	       }
	}
	
	
	public static void sortArray(int[] ip) {
		int n = ip.length;
		int c0=0,c1=0,c2=0;
	       for(int i=0;i<n;i++){
	           if(ip[i]==0)c0++;
	           else if(ip[i]==1)c1++;
	           else c2++;
	       }
	       int k=0;
	       for(int i=0;i<c0;i++)
	    	   ip[k++]=0;
	       for(int i=0;i<c1;i++)
	    	   ip[k++]=1;
	       for(int i=0;i<c2;i++)
	    	   ip[k++]=2;
	}
	
	public static void sortArrayMeth(int[] ip) {
		int n = ip.length;
		int left=0, mid = 0, right=n-1;
	    while(mid <= right){
	          if(ip[mid] == 0){
	              int temp =  ip[left];
	              ip[left] = ip[mid];
	              ip[mid] = temp;
	              mid++;
	              left++;
	          } else if(ip[mid] == 2){
	              int temp  =  ip[right];
	              ip[right] = ip[mid];
	              ip[mid] = temp;
	             right--;
	          } else //(ip[mid] == 1)
	              mid++;
	      }
	   }
	}
	
