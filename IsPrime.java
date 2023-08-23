import java.util.*;
class IsPrime
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number:");
int x=in.nextInt();
int a=2;
if(x==1)
System.out.print("Neither composite nor prime");
else if(x==2)
System.out.print(x+" is prime");
else
{
for(a=2;a<x;a++)
{
if(x%a==0)
{
System.out.print(x+" is not prime");
break;
}
else
{
System.out.print(x+" is prime");
break;
}
}
}
in.close();
}
}