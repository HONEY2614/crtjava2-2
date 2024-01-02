import java.util.*;
class Search
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n,i,j;
n=s.nextInt();
for(i=1;i<=n;i++)
{
for(j=2;j<i;j++)
{
if(i%j==0)
break;
}
if(j==i)
System.out.println(i+" ");
}
}
}
