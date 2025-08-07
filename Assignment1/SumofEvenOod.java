import java.util.*;
public class Sum
{

 public static void main (String args[])
   {
     int N,SumE=0,SumO=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the array size >>");
     N=s.nextInt();
     int[] a=new int[N];
     System.out.println("Enter the Array elements >>");
     for (int i=0;i<N;i++)
         {
            a[i]=s.nextInt();
         }
     for (int i=0;i<N;i++)
         {
            if (a[i]%2==0)
                 {
                    SumE=SumE+a[i];
                  }
            else 
              {
                 SumO=SumO+a[i];
              }
          }
      System.out.println("The Sum of Even No. is :" +SumE);
      System.out.println("The Sum of odd No. is :" +SumO);

}









  














}