/*
At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.
*/
import java.util.*;
public class Soln_two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> a=new ArrayList<>();
        ArrayList<String> set=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String in=sc.nextLine().toLowerCase();
            if(a.indexOf(in)==-1)
                set.add(in);
            a.add(in);
        }
        System.out.println(a);
        System.out.println(set);
        
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<set.size();i++)
        {
            int c=0;
            for(int j=0;j<a.size();j++)
            {
                if(set.get(i).equalsIgnoreCase(a.get(j)))
                    c++;
            }
            h.put(set.get(i),c);
        }

        Iterator<Map.Entry<String,Integer>> itr = h.entrySet().iterator();
        boolean f=false;
        while(itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            int no=entry.getValue();
            if(no%2!=0)
            {
                System.out.println(entry.getKey());
                f=true;
                break;
            }
        }
        if(f==false)
            System.out.println("All are even");
        
    }
}