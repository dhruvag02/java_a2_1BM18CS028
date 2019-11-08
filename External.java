package SEE;
import java.util.*;
import CIE.*;
public class External extends Internals{
Scanner sc=new Scanner(System.in);
public int j,marks2[]=new int[5];
public External(){
super();
System.out.println("Enter SEE marks out of 50");
for(j=0;j<5;j++)
{
System.out.println("Enter marks in sub:"+(j+1));
marks2[j]=sc.nextInt();
}
}
}



