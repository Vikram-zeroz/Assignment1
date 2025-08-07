import java.util.*;

public class factorial
{
    public static void main (String args[])
    {
        Scanner no= new Scanner(System.in);
        int a=no.nextInt();
        
        for (int i=1;i<a;i++)
        {
            if (a%i==0)
            {
                System.out.println(i);
            }
            
        }
    }

}