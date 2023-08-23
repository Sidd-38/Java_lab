import java.util.Scanner;
public class GCD{
    public static void main(String ar[])
    {
        int a,b,r;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter num1: ");
            a=sc.nextInt();
            System.out.print("Enter num2: ");
            b=sc.nextInt();
        }
        if(a<b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
        }
        // System.out.println(a+"  "+b);
        r=b;
        b=a;
        while(r!=0)
        {
            a=b;
            b=r;
            r=a%b;
        }
        System.out.println("GCD: "+b);
    }
}