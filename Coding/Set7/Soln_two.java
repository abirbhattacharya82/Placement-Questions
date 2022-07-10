/*
Abhijeet is one of those students who tries to get his own money by part time jobs in various places to fill up the expenses for buying books. He is not placed in one place, so what he does, he tries to allocate how much the book he needs will cost, and then work to earn that much money only. He works and then buys the book respectively. Sometimes he gets more money than he needs so the money is saved for the next book. Sometimes he doesn’t. In that time, if he has stored money from previous books, he can afford it, otherwise he needs money from his parents.
Now His parents go to work and he can’t contact them amid a day. You are his friend, and you have to find how much money minimum he can borrow from his parents so that he can buy all the books.
He can Buy the book in any order.

Input Format:
First line contains N.
Second N lines contain The ith earning for the ith book.
After that N lines contain The cost of the ith book.

Output Format:
The minimum money he needs to cover the total expense.

Sample Input 1:
3
[3 4 2]
[5 3 4]

Sample Output 1:
3
*/
import java.util.*;
public class Soln_two 
{
    public static int sum(ArrayList<Integer> a)
    {
        int s=0;
        for(int i=0;i<a.size();i++)
        {
            s=s+a.get(i);
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        for(int i=0;i<n;i++)
        {
            b.add(sc.nextInt());
        }
        int diff=sum(b)-sum(a);
        if(diff>=0)
        {
            System.out.println(diff);
        }
    }    
}