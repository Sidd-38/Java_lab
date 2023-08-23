import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter x:");
int x= in.nextInt();
System.out.print("Enter y:");
int y= in.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.print("x="+x+"\t"+"y="+y);
in.close();
}
}
