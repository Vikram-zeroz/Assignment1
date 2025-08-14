import java.util.*;
class Employee {
 int Salary ;
 
void PF(){
System.out.println("The Name of Function is PF");
}

}

class Programmer extends Employee {
void show()
{
System.out.println("This is Programmer Class");
}

public static void main (String[] args)
{
 Scanner sc=new Scanner(System.in);
 Programmer p=new Programmer();
 System.out.println("Enter the Salary ");
 p.Salary=sc.nextInt();
 p.PF();
 p.show();
 System.out.println(" Salary is " +p.Salary);

}
}