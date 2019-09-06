import java.util.*;
class Stack1
{
int stack[]=new int[20];
int top=-1;

void push(int item)
{
if(top==20-1)
{System.out.println("Stack underflow");
return;}
top=top+1;
stack[top]=item;
}
int pop()
{
int v;
if(top==-1)
{System.out.println("Stack underflow");
return -999;}
v=stack[top];
top=top-1;
return v;
}
void display()
{
int i;
if(top==-1)
{System.out.println("Stack is empty");
return;}
for(i=top;i>=0;i--)
{
System.out.println(stack[i]);
}
}
}
class Stackimp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Stack s=new Stack();
int j=1;
int x;
int ch;
while(j!=0)
{
System.out.println("Enter following for operation-\n1)push\t2)pop\t3)display");
ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("Push");
System.out.println("Enter the value to be pushed");
int e=sc.nextInt();
s.push(e);
break;
case 2:
System.out.println("Pop");
x=s.pop();
System.out.println("Popped element="+x);
break;
case 3:
System.out.println("Display");
s.display();
break;
default:
System.out.println("Invalid");
break;
}
System.out.println("Enter other than 0 to continue");
j=sc.nextInt();
}
}
}

