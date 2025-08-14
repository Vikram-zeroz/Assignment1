//WITH DIFFERENT PARAMETRES AND RETURN TYPE 


import java.util.*;

class Polymorphism {


public void add()
{
int a=20;
int b=90;
int c=a+b;
System.out.println( "The Sum is :" +c);
}

public double add( double num3)
{
double sum= num3 +120;
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
Polymorphism add1= new Polymorphism();
add1.add();
System.out.println("The sum is :" +add1.add(190));
System.out.println("The sum is :" +add1.add(121,118));
}
}


