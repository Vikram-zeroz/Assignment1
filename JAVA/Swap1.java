import java.util.*;

public class Swap1
{
public static void main (String args [])
{
   int a,b;
   Scanner s=new Scanner (System.in);
   System.out.print("Enter the First no>>");
   a=s.nextInt();
   System.out.println("Enter the second no>>");
   b=s.nextInt();
   System.out.println("Before Swaping A:" +a);
   System.out.println("Before Swaping B:" +b);
   a=b+a;
   b=a-b;
   a=a-b;
      System.out.println("After Swaping A:" +a);
      System.out.println("After Swaping B:" +b);
}
}