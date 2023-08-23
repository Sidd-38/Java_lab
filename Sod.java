import java.util.*;
class Sod
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number:");
int x=in.nextInt();
int digit=0;
while(x!=0)
{
digit+=(int)x%10;
x/=10;
}
System.out.print("Sum of digits is "+digit);
}
}
