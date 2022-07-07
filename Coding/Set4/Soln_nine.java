/*
FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:
Coffee
   1 Espresso Coffee
   2 Cappuccino Coffee
   3 Latte Coffee
Tea
   1 Plain Tea
   2 Assam Tea
   3 Ginger Tea
   4 Cardamom Tea
   5 Masala Tea
   6 Lemon Tea
   7 Green Tea
   8 Organic Darjeeling Tea
Soups 
   1 Hot and Sour Soup
   2 Veg Corn Soup
   3 Tomato Soup
   4 Spicy Tomato Soup
Beverages
   1 Hot Chocolate Drink
   2 Badam Drink
   3 Badam-Pista Drink
Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the first letter to select main menu):
Welcome to CCD 
Enjoy your
*/
import java.util.*;
public class Soln_nine 
{
    public static void main(String args[])
    {
        String c[]={"","Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String t[]={"","Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String s[]={"","Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String b[]={"","Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        int ind=Integer.parseInt(sc.nextLine());

        try
        {
            if(ch.equalsIgnoreCase("c") && c.length-1>=ind && ind!=0)
            {
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "+c[ind]);
            }
            else if(ch.equalsIgnoreCase("t") && t.length-1>=ind && ind!=0)
            {
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "+t[ind]);
            }
            else if(ch.equalsIgnoreCase("s") && s.length-1>=ind && ind!=0)
            {
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "+s[ind]);
            }
            else if(ch.equalsIgnoreCase("b") && b.length-1>=ind && ind!=0)
            {
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "+b[ind]);
            }
            else
            {
                System.out.println("INVALID OUTPUT!");
            }
        }
        catch(Exception e)
        {
            System.out.println("INVALID OUTPUT!");
        }
    }
}
