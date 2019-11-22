import java.util.*;
class Asc{
Thread t;
int  num[],n1;
int i,temp;
public Asc(int arr[],int n){
n1=n;
num=new int[n1];
for(i=0;i<n1;i++)
{
num[i]=arr[i];
}
t=new Thread(this,"Asc");
t.start();
}
public void run(){
for(i=0;i<n1;i++)
{
   for(int j=1;j<n1;j++)
   {
      if(num[i]>num[j])
      {
         temp=num[i];
         num[i]=num[j];
         num[j]=temp;
       }
    }
}
while(true)
{
for(i=0;i<n1;i++)
{
System.out.println(num[i]);
}
try{
Thread.sleep(2000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

class Desc{
Thread t;
int  num[],n1;
int i,temp;
public Desc(int arr[],int n){
n1=n;
num=new int[n1];
for(i=0;i<n1;i++)
{
num[i]=arr[i];
}
t=new Thread(this,"Desc");
t.start();
}
public void run(){
for(i=0;i<n1;i++)
{
   for(int j=1;j<n1;j++)
   {
      if(num[i]<num[j])
      {
         temp=num[i];
         num[i]=num[j];
         num[j]=temp;
       }
    }
}
while(true)
{
for(i=0;i<n1;i++)
{
System.out.println(num[i]);
}
try{
Thread.sleep(2000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

class Threadlist{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,arr[],n;
System.out.println("Enter number of elements in array");
n=sc.nextInt();
arr=new int[n];
System.out.println();
System.out.println("Enter numbers in array");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Entered Array is displayed");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}
Asc a=new Asc(arr,n);
Desc d=new Desc(arr,n);
try{
a.t.join();
d.t.join();
}
catch(Exception e){
System.out.println(e);
}
System.out.println("Exiting from main");
}
}
