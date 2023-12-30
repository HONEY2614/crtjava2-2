import java.util.*;

class Asmd

{
    
public static void main(String[] args)
   
{
        
Scanner s=new Scanner(System.in);
int a,b,r;
        
System.out.println("Enter Two Numbers Value");
        
a=s.nextInt();
        
b=s.nextInt();
       
System.out.println("1.Addition\n 2.Subtraction\n 3.Multiply\n 4.Division");
        
System.out.println("Enter your Choice");
        int ch=s.nextInt();
        switch(ch)
       
 {
        
case 1:
        
r=a+b;
        
System.out.println("Addition on"+r);
        
break;
        
case 2:
        
r=a-b;
        
System.out.println("Subtraction on"+r);
        
break;
        
case 3:
        
r=a*b;
       
 System.out.println("Multiplication on"+r);
        
break;
        
case 4:
        
r=a/b;
        
System.out.println("Division"+r);
        
break;
        
default:
        
{
            
System.out.println("Invalid");
        
}
        
}
        
      
    
}

}

