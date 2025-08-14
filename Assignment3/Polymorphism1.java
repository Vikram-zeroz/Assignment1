

//WITH SAME RETURN TYOE BUT DIFFERENT PARAMETERS 
import java.util.*;

class Polymorphism1 {


public int add()
{
int a=20;
int b=90;
int c=a+b;
//System.out.println( "The Sum is :" +c);
return c;
}

public int add(int  num3)
{
int  sum= num3 +120;
return sum;
}

public int add( int num1, int num2)
{
 return num1 +num2 ;
//System.out.println( "The Sum is :" +(c+d));
}

public static void main (String args[])
{
Scanner sc =new Scanner (System.in);
Polymorphism1 add1= new Polymorphism1();
System.out.println("The sum is :" +add1.add());

System.out.println("The sum is :" +add1.add(190));
System.out.println("The sum is :" +add1.add(121,118));
}
}


