import java.util.*;
class Time
{
int h,m,s;
Time(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
void cur_time()
{
m=m+(s/60);
s=s%60;
h=h+(m/60);
m=m%60;
h=h%24;
}
void advance(int d,int e,int f)
{
s=s+f;
m=m+e+(s/60);
s=s%60;
h=h+d+(m/60);
m=m%60;
h=h%60;
}
void print()
{
System.out.println(h+"/"+m+"/"+s);
}
}
class Timedemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of h,m,s for current time");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
Time t=new Time(a,b,c);
t.cur_time();
t.print();
System.out.println("Enter values of h,m,s for advance time");
int d=sc.nextInt();
int e=sc.nextInt();
int f=sc.nextInt();
t.advance(d,e,f);
t.print();
}
}