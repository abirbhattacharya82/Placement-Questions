/*
A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.
*/
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
