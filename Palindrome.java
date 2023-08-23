import java.util.*;
class Palindrome
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number:");
int x=in.nextInt();
if(x<0)
System.out.print("Not a Palindrome");
int temp=x;
int reversed=0;
while(temp!=0)
{
int digit =(int)temp%10;
reversed=reversed*10+digit;
temp/=10;
}
if(reversed==x)
System.out.print("Palindrome");
else
System.out.print("Not Palindrome");
}
}