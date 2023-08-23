class SecondLargest
{
public static void main(String args[])
{
int x[]=new int[args.length];
int max=0;
for(int i=0;i<args.length;i++)
{
x[i]=Integer.parseInt(args[i]);
if(x[i]>max)
max=x[i];
}
int temp=max;
max=0;
for(int i=0;i<args.length;i++)
{
x[i]=Integer.parseInt(args[i]);
if(x[i]<temp && x[i]>max)
max=x[i];
}
System.out.print("Second largest number is "+max);
}
}