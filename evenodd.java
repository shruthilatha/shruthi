import java.io.*;
import java.util.*;
class  evenodd{
	public static void main (String[] args) {
	  Scanner s=new Scanner(System.in);
	  String s1=s.nextLine();
	  char ch[]=s1.toCharArray();
	  int c=ch.length;
	  char temp;
	  for(int i=0;i<c-1;i=i+2)
	    {
	        temp=ch[i];
	        ch[i]=ch[i+1];
	        ch[i+1]=temp;
	    }
	    String s2="";
	    for(int i=0;i<c;i++)
	    {
	       s2=s2+ch[i];
	    }
	   System.out.print(s2);
	}
}
