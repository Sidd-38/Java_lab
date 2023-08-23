import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter fibonacci series limit:");
int x=in.nextInt();
int a=0;
int b=1;
int c=0;
System.out.print(a+" "+b);
for(int i=2;i<x;i++)
{
c=a+b;
System.out.print(" "+c);
a=b;
b=c;
}
}
}
