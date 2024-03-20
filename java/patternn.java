public class Patternn
{
public static void main(String args[])
{
int i;j;a;b;c;
a=5;b=0;
for(i=a;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
if(b==0 && i==a)
{
for(c=j-2;c>=1;c--)
System.out.print(c+" ");
b++;
}
else
{
for(c=1;c<=b;c++)
System.out.print("  ");
for(c=j-1;c>=1;c--)
System.out.print(c+" ");
b=b+2;
}
System.out.println(" ");
}
}
}