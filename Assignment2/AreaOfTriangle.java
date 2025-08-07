import java.util.*;

public class AreaOfTriangle 
{
  double B,H,Area;
  public double area()
     {
       Area= (0.5)*(B*H);
       return Area;
     }
  public static void main (String args[])
     {
       AreaOfTriangle a= new AreaOfTriangle();
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Base of triangle >>");
       a.B=s.nextDouble();
       System.out.println("Enter the Height of triangle >>");
       a.H=s.nextDouble();
       System.out.println("The Area of triangle is>>" +a.area());
}
}