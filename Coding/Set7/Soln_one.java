/*
Bhojon is a restaurant company and has started a new wing in a city. They have every type of cook except the meatball artist. They had fired their last cook because the sale of meatballs in their restaurant is really great, and they can’t afford to make meatballs again and again every time their stock gets empty. They have arranged a hiring program, where you can apply with their meatball.
They will add the meatball in their seekh (a queue) and everytime they cut the meatball they take it and cut it on the day’s quantity and then re-add the meatball in the seekh. You are the hiring manager there and you are going to say who is gonna be hired.
Day’s quantity means, on that very day the company sells only that kg of meatballs to every packet.
If someone has less than a day’s quantity, it will be counted as a sell.

Input Format:
First line contains N.
Second line contains D.
After that N lines contain The ith person’s meatball weight.

Output Format:
The 1 based index of the man whose meatball is served at the last.

Sample Input 1:
4
2
[7 8 9 3]

Sample Output 1:
3

Explanation:
The seekh or meatball queue has [7 8 9 3] this distribution. At the first serving they will cut 2 kgs of meatball from the first meatball and add it to the last of the seekh, so after 1st time it is:
[8 9 3 5]
Then, it is: [9 3 5 6],  [3 5 6 7], [5 6 7 1], [6 7 1 3], [7 1 3 4], [1 3 4 5], [3 4 5], [4 5 1], [5 1 2], [1 2 3], [2 3], [3], [1], [0]
So the last served meatball belongs to the 3rd person.
*/
import java.util.*;
public class Soln_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<Integer>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
            b.add(i+1);
        }

        while(a.size()>1)
        {
            int x=a.remove(0);
            int diff=0;
            if(x>d)
            {
                diff=x-d;
                a.add(diff);
                int z=b.remove(0);
                b.add(z);
            }
        }
        System.out.println(b.get(0));
    }
}