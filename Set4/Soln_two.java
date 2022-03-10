/*
Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.
Display the most fit trainee (or trainees) and the highest average oxygen level.
*/
import java.util.*;
public class Soln_two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<3;i++)
        {
            ArrayList<Integer> row=new ArrayList<>();
            for(int j=0;j<3;j++)
            {
                int x=sc.nextInt();
                if(x<1 || x>100)
                    x=0;
                row.add(x);
            }
            a.add(row);
        }
        for(int i=0;i<3;i++)
        {
            int avg=a.get(i).get(0)+a.get(i).get(1)+a.get(i).get(2);
            avg=(int)(avg/3);
            a.get(i).add(avg);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++)
        {
            if(max<a.get(i).get(3))
                max=a.get(i).get(3);
        }
        if(max<70)
            System.out.println("All trainees are unfit");
        else
        {
            for(int i=0;i<3;i++)
            {
                if(max==a.get(i).get(3))
                    System.out.println("Trainee Number: "+(i+1));
            }
        }
    }
}