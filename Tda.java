import java.util.*;
class Tda
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m1;
int n1;
int i;
int j;
System.out.println("Enter number of rows(m1) and number of columns(n1)");
m1=sc.nextInt();
n1=sc.nextInt();
int arr1[][]=new int[m1][n1];
System.out.println("Enter elements of array1");
for(i=0;i<m1;i++)
{
   for(j=0;j<n1;j++)
arr1[i][j]=sc.nextInt();
}
System.out.println("Enter number of rows(m2) and number of columns(n2)");
int m2=sc.nextInt();
 int n2=sc.nextInt();
System.out.println("Enter the elements of array2");
int arr2[][]=new int[m2][n2];
for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
arr2[i][j]=sc.nextInt();
}
System.out.println("Enter number of rows(m3) and number of columns(n3)");
int m3=sc.nextInt(); 
int n3=sc.nextInt();
int arr3[][]=new int[m3][n3];
if(m1==m2 && m2==m3 && n1==n2 && n2==n3)
{
  for(i=0;i<m1;i++)
{
   for(j=0;j<n1;j++)
  arr3[i][j]=arr1[i][j]+arr2[i][j];
}
}
else System.out.println("Invalid operation");

System.out.println("*** Added array is displayed ***");
for(i=0;i<m3;i++)
{
for(j=0;j<n3;j++)
System.out.println(arr3[i][j]);
}
}
}
