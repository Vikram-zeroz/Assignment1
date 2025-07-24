import java.util.*;

public class Vivan2
{
    public static void main (String args[])
    {
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the N value");
        int a=no.nextInt();
         int sum=1;
        for (int i=a;i>0;i--)
        {
            {
               sum=sum*i;
            }
            
        }
        System.out.println("factorial is " +sum);
    }


}