                                 // ASSIGNMENT 3

//Program to demonstrate Inheritance and method Overloading 

class Parent {
int Balance =100000;
String Name ="Vikram" ;

public void  display()
{
System.out.println("Name >>"+Name +"\n Balance >>"+Balance);
}
}

public class Child extends Parent {
public static void main (String args [])
{
   Child c=new Child ();
   c.display();
  System.out.println("Name >>"+(c.Balance) +"\n Balance >>"(+c.Name));


}

}

