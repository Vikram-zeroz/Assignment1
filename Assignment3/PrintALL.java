class Employee 
{
int salary =10000;
}
//Class 2
class Programmer extends Employee 
{
 int bonus=5000  ;
 void function1()
{
System.out.println("My Friends Kunal :");
}
}
// class 3 
class Tester extends Employee{
int bonus=2000;
void fun2()
{
System.out.println("my friend Raviraj ");
}
}

public class PrintALL{
public static void main (String[] args)
{
 Tester t=new Tester();
 Programmer p=new Programmer ();
 p.fun1();
 int psal=p.salary +p.bonus ;
 System.out.println("The Gross Salary is :"+psal);

 t.fun2();
 int tsal=t.salary+t.bonus;
 System.out.println("The Gross Salary is :"+tsal);


 

}
}
