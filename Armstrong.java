import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a number:");
int x=in.nextInt();
int temp=x;
int pemt=x;
int d=0;
while(pemt!=0)
{
int c=(int)pemt%10;
pemt/=10;
d+=1;
}
int digit=0;
int arm=0;
while(x!=0)
{
digit=(int)x%10;
int b=1;
for(int i=0;i<d;i++)
{
b*=digit;
}
x/=10;
arm+=b;
}
if(temp==arm)
System.out.println(temp+" is an Armstrong number");
else
System.out.println(temp+" is not an Armstrong number");
}
}