import java.util.*;

public class ImplementThis{

int student_roll;
String name;
int fees;

public ImplementThis (int student_roll,String name, int fees)
{
 this.student_roll=student_roll;
 this.name=name;
 this.fees=fees;

}
void display ()
{
System.out.println("Roll No :" +student_roll + " \nStudent Name :" +name +" \nfees :" +fees );
}

public static void main (String args[])
{
ImplementThis A=new ImplementThis(1,"Vikram",10000);
A.display();
}
}

