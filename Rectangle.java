import java.util.*;
class Rectangle {
int length;
int width;
void input()
{
System.out.println("Enter the length and width of rectangle");
Scanner sc = new Scanner(System.in);
int l=sc.nextInt();
int w=sc.nextInt();
length=l;
width=w;
}
int Area()
{int area= length*width;
return area;
}
void output()
{
System.out.println("Length = "+length);
System.out.println("Width = "+width);
int area = Area();
System.out.println("Area = "+area);
}
}
class RectangleDemo {
public static void main(String args[])
{

Rectangle rect1 = new Rectangle();
Rectangle rect2 = new Rectangle();
rect1.input();
rect2.input();
rect1.output();
rect2.output();
}
}