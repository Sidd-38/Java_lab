import java.util.*;
public class Sort
{
    public static void main(String ar[])
    {
        int n,i,j;
        int a[];
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter size of the Array : ");
            n=sc.nextInt();
            a=new int[n];
            for (i=0;i<n;i++)
            {
                System.out.print("Enter "+ (i+1)+ " Element : ");
                a[i]=sc.nextInt();
            }
            

        }
        System.out.println(Arrays.toString(a));
            for(i=0;i<n;i++)
            {
                for (j=i+1;j<n;j++)
                {
                    if(a[j]<a[i])
                    {
                        a[i]=a[i]+a[j];
                        a[j]=a[i]-a[j];
                        a[i]=a[i]-a[j];
                    }

                }
            }
        System.out.println(Arrays.toString(a));

    }
}