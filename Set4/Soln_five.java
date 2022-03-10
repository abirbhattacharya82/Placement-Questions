/*
We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.
Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior Wall in units of square feet
4. Surface Area of each Exterior Wall in units of square feet
If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.
Calculate and display the total cost of painting the property
*/
import java.util.*;
public class Soln_five 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no_int=sc.nextInt();
        int no_ext=sc.nextInt();
        double int_wall_sum=0.0;
        double ext_wall_sum=0.0;
        for(int i=0;i<no_int;i++)
            int_wall_sum=int_wall_sum+sc.nextDouble();
        for(int i=0;i<no_ext;i++)
            ext_wall_sum=ext_wall_sum+sc.nextDouble();
        int_wall_sum=int_wall_sum*18;
        ext_wall_sum=ext_wall_sum*12;
        double total=int_wall_sum+ext_wall_sum;
        System.out.println(total);
    }    
}
