import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the size:");
	    int n = input.nextInt();
	    ArrayList<Integer> arrList = new ArrayList<Integer>(n);
	    int i;
	    for(  i = 0; i<n; i++){
	        int num = input.nextInt();
	        arrList.add(num);
	    }
	    for(i = 0; i<n-1; i+=2){
	        Collections.swap(arrList, i, i+1);
	    }
	    System.out.println(arrList);
	}
	}
