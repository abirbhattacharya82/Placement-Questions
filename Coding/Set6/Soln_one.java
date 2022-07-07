/*
Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits.
Input 1:
4567
Expected output: 
2
Explanation
Here, the sum of odd position digits 4 and 6 is 10. The Sum of even position digits 5 and 7 is 12. The difference is 12-10=
*/
import java.util.*;
public class Soln_one
{
    public static void main(String ars[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int even=0;
        int odd=0;
        for(int i=0;i<n.length();i++)
        {
            if(i%2==0)
                even=even+Integer.parseInt(""+n.charAt(i));
            else
                odd=odd+Integer.parseInt(""+n.charAt(i));
        }
        int ans=odd-even;
        System.out.println(ans);
    }
}