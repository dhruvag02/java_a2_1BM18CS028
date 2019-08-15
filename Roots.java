import  java.util.*;
class Roots
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the values of  a,b and c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double d=(b*b)-(4*a*c);
if (d==0)
{
double x1 = -b/(2*a);
System.out.println("Roots are Equal and="+x);
}
else if (d>0)
{
double x1=((-b+Math.sqrt(b*b-4*a*c))/2*a);
double x2=((-b-Math.sqrt(b*b-4*a*c))/2*a);
System.out.println("Roots are distinct"+x1+x2);
}
else if(d<0)
{
System.out.println("Imaginary roots");
}
else
System.out.println("Invalid");
}
}