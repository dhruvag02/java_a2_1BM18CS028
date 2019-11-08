import java.util.*;
import CIE.*;
import SEE.*;
class Marks{
public static void main(String args[]){
int i,n=5;
int total[]=new int[n];
for(i=0;i<n;i++)
{
total[i]=0;
}
Scanner sc=new Scanner(System.in);
String name,usn;
int sem;
System.out.println("Enter usn,name and sem of student");
usn=sc.next();
name=sc.next();
sem=sc.nextInt();
External e=new External();
for(i=0;i<n;i++)
{
total[i]=e.marks2[i]+e.marks[i];
}
System.out.println("Marks of 5 students are displayed");
for(i=0;i<n;i++){
System.out.println(total[i]);
}
}
}
