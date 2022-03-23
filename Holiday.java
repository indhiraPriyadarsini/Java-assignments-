import java.util.Scanner;
class holiday
{
    private String name;
    private int day;
    private String month;
    public holiday(String name_,int day_,String month_)
    {
        name=name_;
        day=day_;
        month=month_;
    }
     public boolean inSameMethod(String month1)
        {
            return (month1.equals(month));
        }
}
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        holiday obj=new holiday("independence day",4,"july");
        String name;
        int day;
        String month;
        System.out.println("inputs");
         name=sc.next();
         day=sc.nextInt();
         month=sc.next();
         System.out.println(obj.inSameMethod(month));
    }
}
