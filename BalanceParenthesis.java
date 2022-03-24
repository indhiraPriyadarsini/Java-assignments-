import java.util.Stack;
import java.util.Scanner;
public class balanceParenthesis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		Stack<Character> stack = new Stack<Character>();
		
		int i;
		for(i=0; i<str.length(); i++) {
			if(str.charAt(i)== '(' || str.charAt(i)== '{' || str.charAt(i)== '[') {
				stack.push(str.charAt(i));
			}
			else if (!stack.empty() && ((str.charAt(i)==']' && stack.peek()== '[' ) ||
					(str.charAt(i)=='}' && stack.peek()== '{' ) ||
					(str.charAt(i)==')' && stack.peek()== '('))) {
				stack.pop();
			}
			else
				stack.push(str.charAt(i));
					
	}
		if(stack.empty())
			System.out.println("balanced");
		else
			System.out.println("unbalanced");
			
	}
}
