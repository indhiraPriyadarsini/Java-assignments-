import java.util.Scanner;
public class Main {
    static final int CHAR = 26;
    static int factorial(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact = fact * i;
        return fact;
    }
    static int permutations(String str)
    {
        int length = str.length();
        int[] freq = new int[CHAR];
        for (int i = 0; i < length; i++)
            if (str.charAt(i) >= 'a')
                freq[str.charAt(i) - 'a']++;
        int fact = 1;
        for (int i = 0; i < CHAR; i++)
            fact = fact * factorial(freq[i]);
        return factorial(length) / fact;
    }
    public static void main(String args[])
    {
       Scanner input = new Scanner(System.in);
       String str = input.nextLine();
        System.out.println(permutations(str));
    }
}
