import java.util.*;
class Smallest
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Three Nos");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a<b && a<c)
		{
			System.out.println(a+"is Smallest");
		}
		else
		if(b<c)
		{
			System.out.println(b+"is the Smallest");
		}
		else
		{
			System.out.println(c+"is the Smallest");
		}
	}
}


		




