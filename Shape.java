import java.util.*;
abstract class Shape
{
Scanner sc=new Scanner(System.in);
protected int a,b;
abstract void area();
}
class Rect extends Shape
{
Rect()
 {
  System.out.println("Enter the two values");
  a=sc.nextInt();
  b=sc.nextInt();
 }
void area()
 {
    System.out.println("Area="+(a*b));
  }
}
class Tri extends Shape
{
Tri()
 {
  System.out.println("Enter the two values");
  a=sc.nextInt();
  b=sc.nextInt();
 }
void area()
 {
  System.out.println("Area="+(0.5*a*b));
 }
}
class Circle extends Shape
{
void area()
{
System.out.println("Enter the value of radius(a)");
a=sc.nextInt();
  System.out.println("Area 0f circle="+(3.14*a*a));
 }
}
class Area
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Shape ob=null;
int ch,j=1;
while(j!=0)
{
System.out.println("Enter the choice-");
System.out.println("1.Rectangle\t2.Triangle\t3.Circle");
ch=sc.nextInt();
switch(ch)
{
case 1:
ob=new Rect();
ob.area();
break;
case 2:
ob=new Tri();
ob.area();
break;
case 3:
ob=new Circle();
ob.area();
break;
default:
System.out.println("Invalid");
break;
}
System.out.println("Enter other than '0' to continue");
j=sc.nextInt();
}
}
}

OUTPUT
Enter the choice-
1.Rectangle	2.Triangle	3.Circle
3
Enter the value of radius(a)
7
Area 0f circle=153.86
Enter other than '0' to continue
1
Enter the choice-
1.Rectangle	2.Triangle	3.Circle
1
Enter the two values
4
3
Area=12
Enter other than '0' to continue
1
Enter the choice-
1.Rectangle	2.Triangle	3.Circle
2
Enter the two values
4
4
Area=8.0
Enter other than '0' to continue
0

