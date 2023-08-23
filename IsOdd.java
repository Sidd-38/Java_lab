class IsOdd
{
public static void main(String args[])
{
boolean a=true;
for(int i=0;i<args.length;i++)
{
if(Integer.parseInt(args[i])%2==0)
{
System.out.print("No");
a=false;
break;
}
}
if(a==true)
System.out.print("Yes");
}
}