abstract class Parent
{
	void show()
	{
		System.out.println("SHOW METHOD IN PARENT CLASS");
}
public abstract void m1();
}
class Child extends Parent
{
	public void m1()
{
		System.out.println("m1 ABSTRACT METHODS IN CHILD CLASS");
}
}
class Test
{
	public static void main(String args[])
{
		Child c1=new Child();
		c1.show();
		c1.m1();
}
}
