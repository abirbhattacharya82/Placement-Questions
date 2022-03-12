/*
A City Bus is a Ring Route Bus which runs in circular fashion.That is, Bus once starts at the Source Bus Stop, halts at each Bus Stop in its Route and at the end it reaches the Source Bus Stop again.
If there are n  number of Stops and if the bus starts at Bus Stop 1, then after nth Bus Stop, the next stop in the Route will be Bus Stop number 1 always.
If there are n stops, there will be n paths.One path connects two stops. Distances (in meters) for all paths in Ring Route is given in array Path[] as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
Fare is determined based on the distance covered from source to destination stop as  Distance between Input Source and Destination Stops can be measured by looking at values in array Path[] and fare can be calculated as per following criteria:
If d =1000 metres, then fare=5 INR
(When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900n when fare initially calculated is 4.5 which must be ceiled to 5)
Path is circular in function. Value at each index indicates distance till current stop from the previous one. And each index position can be mapped with values at same index in BusStops [] array, which is a string array holding abbreviation of names for all stops as-
THANERAILWAYSTN = TH, GAONDEVI = GA, ICEFACTROY= IC, HARINIWASCIRCLE = HA, TEENHATHNAKA = TE, LUISWADI = LU, NITINCOMPANYJUNCTION = NI, CADBURRYJUNCTION = CA
Given, n=8, where n is number of total BusStops.
BusStops = [ TH, GA, IC, HA, TE, LU, NI, CA ]
Write a code with function getFare(String Source, String Destination) which take Input as source and destination stops(in the format containing first two characters of the Name of the Bus Stop) and calculate and return travel fare.
*/
import java.util.*;
public class Soln_six
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int path[]={800,600,750,900,1400,1200,1100,1500};
        ArrayList<String> stops =new ArrayList<>();
        stops.add("TH");
        stops.add("GA");
        stops.add("IC");
        stops.add("HA");
        stops.add("TE");
        stops.add("LU");
        stops.add("NI");
        stops.add("CA");
        String start=sc.nextLine().toUpperCase();
        String destination=sc.nextLine().toUpperCase();

        if(start.equals(destination))
        {
            System.out.println("INVALID INPUT");
        }
        else if(stops.indexOf(start)!=-1 && stops.indexOf(destination)!=-1)
        {
            int i=stops.indexOf(start)+1;
            int n=stops.indexOf(destination);
            int d=path[n];
            while(i!=n)
            {
                if(i==8)
                    i=0;
                d=d+path[i];
                i++;
            }
            // System.out.println(d);
            double fare=Math.ceil((d/1000.0)*5);
            System.out.println(fare+" INR");
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}