import java.util.*;
class Nelements
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[],i,n,sum=0;
		float avg;
		a=new int[5];
		System.out.println("Enter size of the array");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter n Elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg(float)sum/n;
		System.out.println("Sum of Elements="+sum);
		System.out.println("average="+avg);
	}
}


	