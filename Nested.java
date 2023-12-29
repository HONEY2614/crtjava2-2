import java.util.*;
class Nested
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter Three Nos");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+"is the Biggest");
			}
			else
			{
				System.out.println(c+"is the Biggest");
			}

		}
		else
		if(b>c)
		{
			System.out.println(b+"is the Biggest");
		}
		else
		{
			System.out.println(c+"is the Biggest");
	    }
	}
}


		




