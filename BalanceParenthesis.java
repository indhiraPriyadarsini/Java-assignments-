import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Balanced_Brackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input_brackets = sc.next();
		if(brackets(input_brackets)==false)
		{
			System.out.println(add_brackets(input_brackets));
		}
		else 
		{
			System.out.println(input_brackets);
		}
	}
	public static boolean brackets(String input_brackets) {
		Deque<Character> deque = new LinkedList<>();
		char[] character_array =input_brackets.toCharArray();
		for (int i = 0; i < character_array.length; i++) 
		{
			if(character_array[i]=='{' || character_array[i]=='[' || character_array[i]=='(')
			{
				deque.addFirst(character_array[i]);
			}
			else 
			{
				if(!deque.isEmpty())
				{
					if( ((deque.peekFirst()=='{' && character_array[i]=='}') || (deque.peekFirst()=='[' && character_array[i]==']') || (deque.peekFirst()=='(' && character_array[i]==')'))) 
					{
						deque.removeFirst();
					}
					else 
					{
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		if(!deque.isEmpty())
		{
			return false;
		}
		return true;
	}
	public static StringBuilder add_brackets(String input_brackets)
	{
		char[] character_array =input_brackets.toCharArray();
		String output_bracket="";
		StringBuilder string_builder = new StringBuilder();
		for (int i = 0; i < character_array.length; i++) 
		{
			if(character_array[i]=='{' || character_array[i]=='[' || character_array[i]=='(')
			{
				output_bracket=output_bracket+character_array[i];
			}
		}
		string_builder.append(output_bracket);
		char[] output_character_array =output_bracket.toCharArray();
		for(int i=output_bracket.length()-1;i>=0;i--)
		{
			if(output_character_array[i]=='(')
			{
				string_builder.append(")");
			}
			if(output_character_array[i]=='{') 
			{
				string_builder.append("}");
			}
			if(output_character_array[i]=='[')
			{
				string_builder.append("]");
			}
		}
		return(string_builder);
	}
}
