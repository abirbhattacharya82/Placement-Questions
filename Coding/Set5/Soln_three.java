/*
Find the nth term of the series?
0,0,7,6,14,12,21,18, 28
*/
import java.util.*;
public class Soln_three 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int l=0;
        int z=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                z=k*7;
                k++;
            }
            else
            {
                z=l*6;
                l++;
            }
        }
        System.out.println(z);
    }
}
