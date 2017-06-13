import java.io.*;
import java.util.*;
class sum 
{
	public static void main (String[] args)
  {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int i=0,sum=0;
	  while(i<=n)
	  {
	      sum=sum+i;
	      i++;
	  }System.out.print("Sum of natural number is:"+sum);
	}
}
