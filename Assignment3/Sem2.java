class Student{

String  Name="Vikram ";
String Sub_1="Physics";
int Marks =50;
String  Name="Vikram ";
String Sub_2="Maths";
int Marks =50;
}

class Sem2 extends Student{
public static void main (String args[])
{
 Sem2 s1=new Sem2();
 System.out.println("The Student name :"+ s1.Name );
 System.out.println("The Student subject :" +s1.Sub_1 );
 System.out.println("The Student Marks :" +s1.Marks );
System.out.println("The Student name :"+ s1.Name );
 System.out.println("The Student subject :" +s1.Sub_2 );
 System.out.println("The Student Marks :" +s1.Marks );

}
}