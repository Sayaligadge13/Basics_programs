//single inhertance

class A
{
public int i,j;
public void showij()
{
System.out.println(i);
System.out.println(j);
}
}
class B extends A
{
public int k;
public void showk()
{
System.out.println(k);
}
public void sum()
int s=i+j+k;
System.out.println("sum is:"+s);
}
public static void main(String args[])
{
B b=new B();
b.i=10;
b.j=20;
b.showij();
b.k=30;
b.showk();
b.sum();
}
}
