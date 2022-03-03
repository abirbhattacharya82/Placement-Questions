/*
A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).
Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.
*/
import java.util.*;
public class Soln_two 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        int max=0;
        int cur=0;
        int ind=0;
        for(int i=0;i<r;i++)
        {
            cur=0;
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==1)
                    cur++;
            }
            if(cur>max)
            {
                max=cur;
                ind=i+1;
            }
            
            if(max==c)
                break;
        }
        System.out.println(ind);
    }
}
