import java.util.*;
class Student
{
String usn,name;
int sub;
int cred[];
int marks[];

         Student()
        {
Scanner sc=new Scanner(System.in);
System.out.println("Enter name and USN of student");
name=sc.next();
usn=sc.next();
System.out.println("Enter number of subjects");
sub=sc.nextInt();
System.out.println("Enter marks in each subject");
cred=new int[sub];
marks=new int[sub];
int i;
for(i=0;i<sub;i++)
marks[i]=sc.nextInt();
System.out.println("Enter credits in each subject");
for(i=0;i<sub;i++)
cred[i]=sc.nextInt();
         }
        void sg()
	{
int total=0,sum=0;
double sgpa;
int i;
int crd;
for(i=0;i<sub;i++)
{
if(marks[i]>=90 && marks[i]<=100)
crd=10;
else if(marks[i]>=80 && marks[i]<90)
crd=9;
else if(marks[i]>=70 && marks[i]<80)
crd=8;
else if(marks[i]>=60 && marks[i]<70)
crd=7;
else if(marks[i]>=50 && marks[i]<60)
crd=6;
else if(marks[i]>=40 && marks[i]<50)
crd=5;
else if(marks[i]>=30 && marks[i]<40)
crd=4;
else 
crd=0;
total=total+(crd*cred[i]);
}
for(i=0;i<sub;i++)
{
sum=sum+cred[i];
}
 sgpa=(double)total/sum;
System.out.println("SGPA="+sgpa);
	}
void display()
{
System.out.println("Name="+name+ "USN="+usn+ "Number of subjects="+sub);
System.out.println("Marks with corresponding credits are displayed");
for(int i=0;i<sub;i++)
System.out.println(marks[i]);
for(int i=0;i<sub;i++)
System.out.println(cred[i]);
}
}

   class Studentdemo
{
public static void main(String args[])
{
Student stud=new Student();
stud.sg();
stud.display();
}
}						