import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number");
int x=in.nextInt();
int temp=x;
int a=1;
while(temp!=0)
{
a*=temp;
temp-=1;
}
System.out.print("Factorial of "+x+" is"+a);
}
}
