import java.util.HashMap;
import java.util.Scanner;
import com.sun.jdi.Value;
public class anagramHashing {

	public static void main(String[] args) {
		int i,j;
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		 HashMap < Character, Integer > hashmap1 = new HashMap < Character, Integer > ();
		 HashMap < Character, Integer > hashmap2 = new HashMap < Character, Integer > ();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		for(i=0; i< arr1.length; i++) {
			if(hashmap1.get(arr1[i])== null) {
				hashmap1.put(arr1[i],1);
			}
			else {
				Integer c = (int) hashmap1.get(arr1[i]);
				hashmap1.put(arr1[i], c++);
			}
		}
		
		for(j=0; j< arr2.length; j++) {
			if(hashmap2.get(arr2[j])== null) {
				hashmap2.put(arr2[j],1);
			}
			else {
				Integer d = (int) hashmap2.get(arr2[j]);
				hashmap2.put(arr2[j], d++);
			}
		}
		if(hashmap1.equals(hashmap2))
			System.out.println("anagram");
		else
			System.out.println("not anagram");

	}

}
