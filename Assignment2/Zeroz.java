public class Zeroz
{
int roll;
String name ;
int marks ;

public Zeroz()
{
 roll=120;
 name ="Vikram";
 marks=100;
System.out.println("Roll:"+roll+"\nName :"+name +"\nMarks:"+marks);

}
public Zeroz (int roll )
{
  this.roll=roll;
  System.out.println("\nRoll :"+roll);
}
public Zeroz (int roll , String name )
{
  this.roll=roll;
  this.name=name ;
  System.out.println("\nRoll:"+roll+"\nName :" +name );
}

public static void main (String args [])
{
  Zeroz z1=new Zeroz();
 Zeroz z2=new Zeroz(113);
 Zeroz z3=new Zeroz(134,"Raviraj ");


}
}