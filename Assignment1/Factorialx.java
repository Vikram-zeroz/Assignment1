import java.util.*;

public class Factorialx
{
   public int fact(int n)
     {
       int total=1;
       if (n>=1)
       total=n*fact(n-1);
     return total;
     }

   
   public static void main (String args[])
     {
        int num1;
        System.out.print("Enter the value of Number >>");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        Factorialx f=new Factorialx();
        f.fact(num1);
        System.out.print("The Factorail is >>" +f.fact(num1));




      }










}