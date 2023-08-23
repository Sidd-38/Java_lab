import java.util.*;
public class Anagrams{
    public static void main(String ar[])
    {
        String a,b;
        int n1,n2,t=1;
        try(Scanner sc=new Scanner (System.in))
        {
            System.out.print("Enter 1st String : ");
            a=sc.nextLine();
            System.out.print("Enter 2nd String : ");
            b=sc.nextLine();
        }
        
        char a1[],b1[];
        a=a.toLowerCase();
        b=b.toLowerCase();
        a1=a.toCharArray();
        b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        n1=a1.length;
        n2=b1.length;
        if(n1!=n2)
            System.out.println("The Given String are not Anagrams");
        else{
            for(int i=0;i<n1;i++)
            {
                if(a1[i]!=b1[i])
                {
                    System.out.println(a1[i]+ "   "+b1[i]);
                    System.out.println("The Given String are not Anagrams");
                    t=0;
                    break;
                }

            }
        if(t==1)
            System.out.println("The Given String are Anagrams");
        }
        // System.out.println(n1+"  "+n2);
        // System.out.println(Arrays.toString(a1));
        // System.out.println(Arrays.toString(b1));
    }
}