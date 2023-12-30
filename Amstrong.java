import java.util.*;

class Amstrong

{
    
public static void main(String[] args)
 
{
        
Scanner s=new Scanner(System.in); 
        
int n,r=0,d,x;
        
System.out.println("Enter n Value");
        
n=s.nextInt();
        
x=n;
	    
while (n>0)
	     
{
	         
d=n%10;
	         
n=n/10;
	         
r=r+d*d*d;
	     
}
	     
if(r==x)
	     
{
	    
 System.out.println("Amstrong no");
	     
}
	     
else
	     
{
	         
System.out.println(" Not Amstrong no");
	    
}
	         
	    
      
    
}

}



	   
	   
		