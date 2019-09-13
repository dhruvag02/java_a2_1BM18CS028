import java.util.*;
abstract class Person
{
protected String name;
protected int age;
protected String add;
abstract void set();
abstract double average();
abstract void display();
}
abstract class Student extends Person
{
protected int roll_no;
protected int sem;
}
class Exam extends Student
{
protected int marks1;
protected int marks2;
protected double avg;
void set()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name,age and adress of person");
String na=sc.next();
int a=sc.nextInt();
String ad=sc.next();
name=na;
age=a;
add=ad;
System.out.println("Enter roll nunber and semester");
int r=sc.nextInt();
int s=sc.nextInt();
roll_no=r;
sem=s;
System.out.println("Enter marks1 and marks2");
int m1=sc.nextInt();
int m2=sc.nextInt();
marks1=m1;
marks2=m2;
avg=(marks1+marks2)/2;
}
double average()
{
double avgr=(marks1+marks2)/2;
return avgr;
}
void display()
{
System.out.println("**** DETAILS OF PERSON ****");
System.out.println("name="+name+",Age="+age+",address="+add+"Roll number="+roll_no+",Semester="+sem+",marks1="+marks1+"and marks2="+marks2);
System.out.println("Average="+avg);
}
}
class Topper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of students");
int n=sc.nextInt();
Person a[];
a=new Exam[n];
for(int i=0;i<n;i++)
{
a[i]=new Exam();
}
for(int i=0;i<n;i++)
{
System.out.println("Enter details of prson"+(i+1));
a[i].set();
a[i].display();
}
int i;
double largest=0;
String topper="Invalid";
for(i=0;i<n;i++)
 {
   largest=a[0].average();
   if(a[i].average()>largest)
   {
   largest=a[i].average();   
   topper=a[i].name;
   }
 }
System.out.println("Highest="+largest+"and topper="+topper); 
}
}

