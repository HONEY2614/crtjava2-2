import java.util.Scanner;
import Ammu.Arth;
class Test
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int  a,b;
		System.out.println("ENTER TWO NUMBERS");
		a=s.nextInt();
		b=s.nextInt();
		Arth a1=new Arth();
		int r=a1.add(a,b);
		System.out.println("ADDITION="+r);
		System.out.println("PRODUCT="+a1.mul(a,b));
	}
}
