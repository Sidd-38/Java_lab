import java.util.*;
public class CrossWord
{
    public static boolean checkcross(char a[][],char b[],int n1,int n2)
    {
        int x=0;
        int n=b.length;
        if(n>n1 && n>n2)
        {
            return false;
        }
        
        for (int i=0;i<n1;i++)
        {
            for (int j=0;j<n2;j++)
            {
                if(b[x]==a[i][j])
                {
                    x++;
                }
                else
                {
                    x=0;
                }
                if(n==x)
                    return true;

            }
        }
        x=0;
        for (int i=0;i<n2;i++)
        {
            for (int j=0;j<n1;j++)
            {
                if(b[x]==a[j][i])
                {
                    x++;
                }
                else
                {
                    x=0;
                }
                if(n==x)
                    return true;

            }
        }


        return false;
    }
    
    public static void main(String ar[])
    {
        int n1,n2,i,j;
        char a[][];
        String b;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.print("Enter No. of rows: ");
            n1=sc.nextInt();
            System.out.print("Enter No. of columns: ");
            n2=sc.nextInt();
            a=new char[n1][n2];
            for(i=0;i<n1;i++)
            {
                for(j=0;j<n2;j++)
                {
                    System.out.print("Enter "+ (j+1)+" letter of "+(i+1)+" Word : ");
                    a[i][j]=sc.next().charAt(0);    
                }
            }
            System.out.print("Enter the Word to Search : ");
            b=sc.next();
            // System.out.println(b);
            
        }
        /*for(i=0;i<n1;i++)
            {
                for(j=0;j<n2;j++)
                {
                    System.out.print(a[i][j]+"  ");    
                }
                System.out.println();
            }*/
        char s[]=b.toCharArray();
           if(checkcross(a,s,n1,n2)) 
           {
            System.out.println("Word Found");
           }
           else
            System.out.println("Word Not Found ");

    }
}