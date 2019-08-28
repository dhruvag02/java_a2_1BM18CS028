import java.util.*;
class MAX
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows(m) and columns(n)");
int m=sc.nextInt();
int n=sc.nextInt();
int arr[][]=new int[m][n];
int i;
int j;
System.out.println("Enter the elements in array");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
arr[i][j]=sc.nextInt();
}

int large= mdn0;
for(int a[]:arr)
{
for(int x:a)
{
if(x>large)
large=x;
}
}
System.out.println("largest element="+large);
}
}