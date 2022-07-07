/*
A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
*/
import java.util.*;
public class Soln_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int E[]=new int [n];
        int L[]=new int [n];
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            E[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            L[i]=sc.nextInt();
        }
        a.add(E[0]-L[0]);
        for(int i=1;i<n;i++)
        {
            int existing=a.get(i-1);
            existing=existing+E[i];
            existing=existing-L[i];
            a.add(existing);
        }
        System.out.println(Collections.max(a));
    }
}