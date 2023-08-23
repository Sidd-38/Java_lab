import java.util.*;
class Vowel
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.print("Enter string:");
String str=in.nextLine();
boolean a=false;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||
str.charAt(i)=='e'||
str.charAt(i)=='i'||
str.charAt(i)=='o'||
str.charAt(i)=='u'||
str.charAt(i)=='A'||
str.charAt(i)=='E'||
str.charAt(i)=='I'||
str.charAt(i)=='O'||
str.charAt(i)=='U')
{
a=true;
System.out.print("Yes");
break;
}
}
if(!a)
System.out.print("No");
}
}