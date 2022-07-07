// There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
// Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.
// Output should give number of Candies sold and updated number of Candies in JAR.
// If Input is more than candies in JAR, return: INVALID INPUT

import java.util.*;
public class Soln_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int in=sc.nextInt();

        if(in==0 || in>k)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            n=n-in;
            if(n<k)
            {
                n=n+k;
            }
            System.out.println("NUMBER OF CANDIES SOLD : "+in);
            System.out.println("NUMBER OF CANDIES AVAILABLE : "+n);
        }        
    }
}