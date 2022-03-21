/*
Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?
Whether the number is positive or not, if it is negative then print the message "please enter the positive number"
It is positive then call the function prime and check whether the take positive number is prime or not.
*/
import java.util.*;
public class Soln_two 
{
    public static boolean check(int n)
    {
        if(n<0)
            return false;
        else
            return true;
    }
    public static boolean check_prime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
            return true;
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n))
        {
            if(check_prime(n))
            {
                System.out.println("Prime Number");
            }
            else 
            {
                System.out.println("Not a Prime Number");
            }
        }
        else
        {
            System.out.println("Please enter the positive number");
        }
    }    
}
