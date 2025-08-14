import java.util.*;

class Studentz{

String  Name;
String Sub_1;
int Marks ;
}

class Sem21 extends Student{
public static void main (String args[])
{
 Scanner sc=new Scanner(System.in);
 Sem21 s1=new Sem21();
 s1.Name=sc.next();
 s1.Sub_1=sc.next();
 s1.Marks=sc.nextInt();
 System.out.println("The Student name :"+ s1.Name );
 System.out.println("The Student subject :" +s1.Sub_1 );
 System.out.println("The Student Marks :" +s1.Marks );
}
}