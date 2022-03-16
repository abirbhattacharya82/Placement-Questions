import java.util.*;
public class Soln_ten 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        while(true)
        {
            String n=sc.nextLine();
            if(n.equalsIgnoreCase(""))
            {
                break;
            }
            else
            {
                a.add(Integer.parseInt(n));
            }
        }
        int cost=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>0 && a.get(i)<17)
                cost=cost+200;
            else if(a.get(i)>=17 && a.get(i)<40)
                cost=cost+400;
            else if(a.get(i)>=40)
                cost=cost+300;
        }
        System.out.println(cost);
    }
}
