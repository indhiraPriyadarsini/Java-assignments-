import java.util.*;
import java.io.*;

class OperatorException extends Exception {
    public OperatorException()
    {
        super("OperatorException");
    }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int n1 = sc.nextInt();
        String n2 = sc.next();
        int n3 = sc.nextInt();
        if(n2.equals("+"))
        System.out.println(n1 + n3);
        else if(n2.equals("-"))
        System.out.println(n1 - n3);
        else if(n2.equals("*"))
        System.out.println(n1 * n3);
        else if(n2.equals("/"))
        System.out.println(n1 /n3);
        else
        throw new OperatorException();
        }
        catch(OperatorException e)
        {
            System.out.println("Invalid Operator "+e);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Enter the valid divisor...division by zero not possible");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid Operand "+e);
        }
    }
}
