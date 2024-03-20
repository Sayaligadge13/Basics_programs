//wap to find out all armstrong number between 1 to 300//


class Armst
{
public static void main(String args[])
{
int i,n,b,sum=0;
for(i=0;i<=300;i++)
{
n=i;
while(n>0)
{
b=n%10;
sum=sum+(b*b*b);
n=n/10;
}
if(sum==i)
{
System.out.println(i+"  ");
}
sum=0;
}
}
}