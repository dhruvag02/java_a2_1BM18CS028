package CIE;
import java.util.*;
public class Internals{
Scanner sc=new Scanner(System.in);
public int n=5,i;
public int marks[];
public Internals(){
System.out.println("Number of subjects=5");
marks=new int[n];
System.out.println("Enter CIE marks");
for(i=0;i<n;i++)
{
System.out.println("Enter CIE marks in sub"+(i+1)+" out of 50");
marks[i]=sc.nextInt();
}
}
}

