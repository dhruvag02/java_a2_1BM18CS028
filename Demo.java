import java.util.*;
class Demo
{
public static void main(String args[])
{
int t=0;
for(int i=0;i<args.length;i++)
{
System.out.println(Integer.parseInt (args[i]));
t=t+Integer.parseInt(args[i]);
}
System.out.println("SUM="+t);
}
}

