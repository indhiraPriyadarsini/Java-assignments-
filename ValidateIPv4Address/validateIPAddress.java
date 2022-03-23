package junittesting;

import java.util.Scanner;

public class ValidateIPv4Address {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String str1 = input.nextLine();
	System.out.println(validate( str1));
	}

public static Boolean validate(String str) {
	String[] arrOfStr = str.split("\\.");
	if(arrOfStr.length != 4)
		return false;	
	int n=(int) Integer.parseInt(arrOfStr[arrOfStr.length-1]);
	if(n==0 || n==255)
		return false;
	for(int i = 0; i< arrOfStr.length;i++ ) {
			int c = Integer.parseInt(arrOfStr[i]);
			if(c<0 || c>255) 
				return false;
		
			else return true;
		}
	return true;
	}
}
