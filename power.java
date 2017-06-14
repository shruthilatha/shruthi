import java.io.*;
import java.util.*;
class power
{
	public static void main (String[] args) 
  {
	    Scanner s=new Scanner(System.in);
	    double c;
	    int a=s.nextInt();
	    int b=s.nextInt();
	    c=Math.pow(a,b);
	    System.out.println("power of "+a+" is "+c);
	}
}
