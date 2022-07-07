/*
The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, "-"(minus sign) will remain as it is. Key value less than 0 should result into INVALID INPUT
*/
import java.util.*;
public class Soln_four 
{
    public static void main(String args[])
    {        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t="";
        int key=Integer.parseInt(sc.nextLine());
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int z;
            if(ch>='A' && ch<='Z')
            {
                z=(int)ch;
                z=z+key;
                if(z>96)
                    z=z-26;
                t=t+(char)z;
            }
            else if(ch>='a' && ch<='z')
            {
                z=(int)ch;
                z=z+key;
                if(z>122)
                    z=z-26;
                t=t+(char)z;
            }
            else if(ch>='0' && ch<='9')
            {
                z=Integer.parseInt((ch+""))+key;
                if(z>9)
                {
                    z=z-10;
                }
                t=t+z;
            }
            else
            {
                t=t+ch;
            }
        }
        System.out.println(t);
    }    
}
