import java.util.*;

public class CopyConstructor {

int student_roll;
String name;
int fees;
public CopyConstructor (int R,String N, int F)
{
 student_roll=R;
 name=N;
 fees=F;
System.out.println("Roll No :" +student_roll + " \nStudent Name :" +name +"\n fees :" +fees );
}
public CopyConstructor(CopyConstructor s) 
{
 student_roll=s.student_roll;
 name=s.name;
 fees=s.fees;
System.out.println("Roll No :" +student_roll + " \nStudent Name :" +name +" \nfees :" +fees );
}

public static void main (String args[])
{
CopyConstructor s=new CopyConstructor(1,"Vikram",10000);
CopyConstructor s1=new CopyConstructor(s);
}
}