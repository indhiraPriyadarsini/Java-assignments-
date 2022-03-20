import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
		int[] arr = new int[n];
	    int i=0;
	    for(i=0; i<n; i++){
	       arr[i] = input.nextInt();
	    }
	    int value = input.nextInt();
	    Arrays.sort(arr);

	    i=0;
	    int j = n-1, count=0;      
		    
		    Arrays.sort(arr);
		    while(i<n && j>=0){

		        if( arr[i] * arr[j] == value){
		          count++;
		          i++;
		          j--;
		        }
		        else if( arr[i] * arr[j] < value) i++;
		        else j--;
		    }
		    System.out.println(count/2);
	}
	
}

