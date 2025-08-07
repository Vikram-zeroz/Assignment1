import java.util.*;

public class AreaOfCircle
{
  double r,Area;
  public double area()
     {
       Area= 3.14*r*r;
       return Area;
     }
  public static void main (String args[])
     {
       AreaOfCircle a= new AreaOfCircle();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Radius >>");
       a.r=s.nextDouble();
       System.out.println("The Area of triangle is>>" +a.area());
}
}