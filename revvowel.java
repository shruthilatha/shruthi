import java.io.*;
import java.util.*;
class revvowel {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char ch[]=s1.toCharArray();
	int len=ch.length;
	String s2="";
	String s3="";
	for(int i=len-1;i>=0;i--)
	{
	    System.out.print(ch[i]);
	    s2=s2+ch[i];
	}
	s3=s2.replaceAll("[aeiouAEIOU]","");
	System.out.println(" "+s3);
	}
}
