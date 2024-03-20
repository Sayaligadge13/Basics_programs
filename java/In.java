//ArrayIndexOutOfBoundException//

class In
{
public static void main(String args[])
{
int a[]={22,33,44,11,77};
try
{
int d=a[6]+a[2];
System.out.println("Result:"+d);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
try
{
int c=a[2]/0;
System.out.println("Addition:"+c);
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println(e1);
}
catch(ArithmeticException e2)
{
System.out.println(e2);
}
int e=a[1]+a[2];
System.out.println("Result:"+e);
}
}

/*Program Files\Java\jdk1.8.0_202\bin>java In
java.lang.ArrayIndexOutOfBoundsException: 6
java.lang.ArithmeticException: / by zero
Result:77
*/