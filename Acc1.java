import java.util.*;
class Acc1
{
protected String acc_no;
protected String name;
protected String type;
protected double bal;
Scanner sc=new Scanner(System.in);
void getdata()
{

System.out.println("Enter account number and type");
acc_no=sc.next();
type=sc.next();
System.out.println("Enter name");
name=sc.next();
System.out.println("Enter your previous balance");
bal=sc.nextDouble();
}
void deposit()
{
double dep;
System.out.println("Enter the deposit amount");
dep=sc.nextDouble();
bal=bal+dep;
disp_bal();
}
void disp_bal()
{
System.out.println("BALANCE:"+bal);
}
void withdraw()
{
double with;
System.out.println("Enter amount to be withdrawn");
with=sc.nextDouble();
bal=bal-with;
disp_bal();
}
}
class Save extends Acc1
{
Scanner sc=new Scanner(System.in);
void interest()
{
super.getdata();
System.out.println("Enter time");
int time=sc.nextInt();
double intr=6.75;
bal=bal+(bal*(Math.pow((1+intr)/100,time)));
super.disp_bal();
}
}
class Curr extends Acc1
{
Scanner sc=new Scanner(System.in);
void min_bal()
{
super.getdata();
int min=500;
int charge=100;
if(bal<min)
{
System.out.println("Balance less than minimum,Service charges apply");
bal=bal-charge;
super.disp_bal();
}
else
{
System.out.println("BAlance above minimum");
disp_bal();
}
}
}
class Bank
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Acc1 ob=new Acc1();
ob.getdata();
int ch;
int j=1;
while(j!=0)
{
System.out.println("Enter the following-");
System.out.println("1.Display Balance\t2.Deposit Amount\t3.Cash Withdrawl\t4.Compute interest\t5.Check for minimum balance");
ch=sc.nextInt();
switch(ch)
{
case 1:
ob.disp_bal();
break;
case 2:
ob.deposit();
break;
case 3:
ob.withdraw();
break;
case 4:
Save ob1=new Save();
ob1.interest();
break;
case 5:
Curr ob2=new Curr();
ob2.min_bal();
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