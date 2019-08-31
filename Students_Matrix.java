import java.util.*;
class MATRIX1
{
int arr[][];
MATRIX1(int m,int n)
{
arr=new int[m+2][n+2];
}
void input(int m,int n)
{
Scanner sc=new Scanner(System.in);
int i,j;
for(i=0;i<m;i++)
{
System.out.println("Enter marks of Student"+(i+1));
for(j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}
}
void sum(int m,int n)
{
int i=0;
int j=n;
while(j==n)
{
  for(i=0;i<m;i++)
   {
     arr[i][n]=0;
     arr[i][n+1]=0;
     for(j=0;j<n;j++)
      {
       arr[i][n]=arr[i][n]+arr[i][j];
       }
      arr[i][n+1]=arr[i][n]/n;
      System.out.println("Total and average of student"+(i+1)+"="+arr[i][n]+","+arr[i][n+1]);
    }
 j++;
}
i=m;
j=0;
while(i==m)
{
 for(j=0;j<n;j++)
  {
   arr[m][j]=0;
   arr[m+1][j]=0;
   for(i=0;i<m;i++)
    {
      arr[m][j]=arr[m][j]+arr[i][j];
     }
    arr[m+1][j]=arr[m][j]/m;
    System.out.println("Total and average of a subject"+(j+1)+"="+arr[m][j]+","+arr[m+1][j]);
   }
 i++;
} 
}
}
class MATRIXTOTAL
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,m;
System.out.println("Enter number of students(m) and number of subjects(n)");
m=sc.nextInt();
n=sc.nextInt();
MATRIX1 m1=new MATRIX1(m,n);
m1.input(m,n);
m1.sum(m,n);
}
}
 
