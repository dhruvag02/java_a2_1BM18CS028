import java.util.*;
class Array
{
public static void main(String args[])
{
System.out.println("Enter size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j;
int arr[]=new int[n];
System.out.println("Enter elements");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Elements have to be sorted in ascending order");
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
if(arr[i]>arr[j])
{int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;}
}
System.out.println("Elements are sorted in ascending order");
for(i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}