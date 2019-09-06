import java.util.*;
class Stack
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
int x;
s.push(4);
s.push(7);
s.push(6);
s.display();
x=s.pop();
System.out.println("Popped value="+x);
s.display();
}
}

