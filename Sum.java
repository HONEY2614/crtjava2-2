import java.util.*;
class Sum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[][],i,j,m,n,sum=0;
		System.out.println("Enter rows and columns");
		m=s.nextInt();
		n=s.nextInt();
		a=new int[n][n];
		System.out.println("Enter an Element");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for (j=0;j<n;j++)
			{
				if(i==j)
					sum=sum+a[i][j];
			}
			
		}
		System.out.println("sum of elements="+sum);
	}

}

	

