import java.util.*;

public class Primeornot  
{
    public static void main (String args[])
    {
        Scanner no= new Scanner(System.in);
        int a=input.nextInt();
        
        for (int i=1;i<a;i++)
        {
            if (a%i==0)
            {
                System.out.println(i);
            }
            
        }
    }

}