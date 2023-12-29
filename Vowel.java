import java.util.*;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		char a;
		System.out.println("Enter a Charecter");
		a=s.next().charAt(0);
		if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u')
		{
			System.out.println("Vowel");
		}
		 else
		{
			System.out.println("Consonants");
		}
	}
}


		

		




