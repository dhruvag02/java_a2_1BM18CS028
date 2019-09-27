import java.util.*;
interface Dstack
{
void push();
int pop();
int is_empty();
void disp();
}
class Dynamic implements Dstack
{
Scanner sc=new Scanner(System.in);
int top;
int size;
int st[];
Dynamic()
{
top=-1;
System.out.println("Enter the size of Stack");
size=sc.nextInt();
st=new int[size];
}
public void push()
{
System.out.println("Enter the value to be pushed");
int item=sc.nextInt();
if(top==size-1)
 {
  System.out.println("New array has been created");
  size=size*2;
  int arr[]=new int[size];
   for(int i=top;i>=0;i--)
    {
     arr[i]=st[i];
     }
     st=arr;
  }
top=top+1;
st[top]=item;
}
public int pop()
{    
int v;
if(is_empty()==1)
{System.out.println("Stack underflow");
return -9999;}
v=st[top];
top=top-1;
return v;
}
public void disp()
{
if(is_empty()==1)
{System.out.println("Stack is empty");
return;}
System.out.println("***Values are displayed***");
for(int i=top;i>=0;i--)
{System.out.println(st[i]);}
} 
public int is_empty()
{
if(top==-1)
return 1;
else 
return 0;
}
}
class STACK
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Dstack ob=null;
ob=new Dynamic();
int ch,j=1;
while(j!=0)
{
System.out.println("Enter the choice-");
System.out.println("1.Push\t2.Pop\t3.Display");
ch=sc.nextInt();
if(ch==1)
{
System.out.println("PUSH");
ob.push();
}
else if(ch==2)
{
System.out.println("POP");
System.out.println("Popped element="+ob.pop());
}
else if(ch==3)
{
System.out.println("DISPLAY");
ob.disp();
}
else
{
System.out.println("Invalid");
}
System.out.println("Enter other than '0' to continue");
j=sc.nextInt();
}
}
} 
