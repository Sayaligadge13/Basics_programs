//try...catch block//


import java.util.*;
class catc
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter a and b:");
a=s.nextInt();
b=s.nextInt();
try
{
c=a/b;
System.out.println("Divide Answer:"+c);
}
catch(ArithmeticException e)
{
System.out.println("divide by zero error occur"+e);
}
c=a+b;
System.out.println("Addition:"+c);
}
}


/*Enter a and b:
6 6
Divide Answer:1
Addition:12
*/