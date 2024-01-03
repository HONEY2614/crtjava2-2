import java.util.*;
class Sorting
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n;
		System.out.println("Enter size of the array");
		n=s.nextInt();
		a=new int[n];
		System.out.println(" The Elements Before Sorting");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+"  ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("The Elements after Sorting");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}

	

			
		