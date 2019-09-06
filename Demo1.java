import java.util.*;
class Demo1
{
public static void main(String args[])
{
int largest;
int i=0;
largest=Integer.parseInt(args[0]);
for(i=1;i<args.length;i++)
{
if(Integer.parseInt(args[i])>largest)
{
largest=Integer.parseInt(args[i]);
}
}
System.out.println("Largest="+largest);
}
}

