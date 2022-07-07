/*
Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.
Note : 1st element of the array should be considered in the count of the result. 
*/
import java.util.*;
public class Soln_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        int c=1;
        for(int i=1;i<n;i++)
        {
            boolean flag=true;
            for(int j=0;j<i;j++)
            {
                if(a.get(j)>a.get(i))
                {
                    flag=false;
                }
            }
            if(flag)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}