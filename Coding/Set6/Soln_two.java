/*
Question 4: Number Series with a Twist
Consider the series : 0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
This series is a mixture of 2 series, all the odd terms in this series form even numbers in ascending order and every even terms is derived from the previous term using the formula (x/2)
*/
import java.util.*;
public class Soln_two 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int i=1;
        int x=0;
        int y=0;
        int k=0;
        while(i<=Integer.parseInt(n))
        {
            if(i%2==0)
            {
                k=y;
                y++;
            }
            else
            {
                k=x;
                x=x+2;
            }
            i++;
        }
        System.out.println(k);
    }
}
