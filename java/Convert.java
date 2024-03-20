import java.util.Scanner;
class Con
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch;
System.out.println("Enter UpperrCase character:");
ch=s.next().charAt(0);
char x;
x=65;
while(x<=90)
{
System.out.println("The LowerCase character:"+x);
x++;
}
}
}

