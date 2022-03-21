/*
Check if a year is Leap or not
*/
import java.util.*;
public class Soln_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        if(y%4==0 && y%100!=0)
        {
            System.out.println("Leap Year");
        }
        else if(y%400==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}