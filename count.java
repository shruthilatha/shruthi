import java.io.*;
import java.util.*;
class count
{
	public static void main (String[] args)
  {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r,count=0;
		while(n>0)
		{
		    r=n%10;
		    n=n/10;
		    count++;
		}
		System.out.println(count);
	}
}
