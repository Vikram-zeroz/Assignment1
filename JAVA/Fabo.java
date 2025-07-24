import java.util.*;

public class Fabo
{
public static void main (String args[])
{
int a=0,b=1,n,temp,ch=1;
Scanner s=new Scanner (System.in);
do{

System.out.println("Enter the End Number!!");
n=s.nextInt();

if (n<=0)
{
System.out.println("Enter the Valid Number!!");
}
else if (n==1)
{
System.out.println(a);
}
else 
{
System.out.println(a);
System.out.println(b);

for (int i=2;i<n;i++)
{
  temp=a+b;
  System.out.println(temp);
  a=b;
  b=temp;
}
}
System.out.println("Enter Non zero to Continue!!");
ch=s.nextInt();
}while(ch!=0);
}
}