import java.io.*;
import java.util.*;
class palindrome
{
	public static void main (String[] args)
  {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,sum=0;
		int temp;
		temp=n;
		while(n>0)
		{
		    r=n%10;
		    sum=(sum*10)+r;
		    n=n/10;
		}
		if(temp==sum)
		{
		    System.out.println("Palindrome");
		}else
		   System.out.println("Not palindrome");
	}
}
