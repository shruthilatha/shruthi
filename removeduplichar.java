import java.util.*;
class removeduplichar 
{
	public static void main (String a[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=" ";
		char ch;
		int len=s1.length();
		for(int i=0;i<len;i++)
		{
		    ch=s1.charAt(i);
		    if(ch!=' ')
		    {
		        s2=s2+ch;
		        s1=s1.replace(ch,' ');
		    }
		}
		System.out.print(s2);
	}
}
