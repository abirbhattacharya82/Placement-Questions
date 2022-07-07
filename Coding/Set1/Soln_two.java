/*
Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
(*>#): positive integer
(#>*): negative integer
(#=*): 0
*/
import java.util.*;
public class Soln_two 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int hash=0;
        int star=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                star++;
            }
            else
            {
                hash++;
            }
        }
        int min=Math.abs((hash-star));
        System.out.println(min);
    }
}
