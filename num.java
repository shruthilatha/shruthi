import java.io.*;
import java.util.*;
class num{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0)
		{
		    System.out.println("Number is zero");
		}else if(n>0)
		{
		    System.out.println("Number is positive");
		    }else
		    {
		        System.out.println("Number is negative");
		    }
	}
}
