import java.util.*;
class POINT
{
int x,y;
POINT()
{
x=0;
y=0;
}
POINT(int i,int j)
{
x=i;
y=j;
}
POINT(POINT ob)
{
x=ob.x;
y=ob.y;
}
void dis(POINT ob)
{
double distance=Math.sqrt(Math.pow((x-ob.x),2)+Math.pow((y-ob.y),2));
System.out.println("Distance="+distance);
}
}
class Distance
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of x1 and y1");
int x1,y1;
x1=sc.nextInt();
y1=sc.nextInt();
POINT p1=new POINT(x1,y1);
System.out.println("Enter the value of x2 and y2");
int x2,y2;
x2=sc.nextInt();
y2=sc.nextInt();
POINT p2=new POINT(x2,y2);
p1.dis(p2);
POINT p3=new POINT(p2);
p3.dis(p2);
p3.dis(p1);
System.out.println("3 objects are there and values of one are copied to second,so two area will be same and one will be 0");
}
}
