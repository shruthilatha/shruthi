import java.util.*;
class revstr {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String s1[]=s.nextLine().split(" ");
		int len=s1.length;
		for(int i=len-1;i>=0;i--)
		{
		    System.out.print(" "+s1[i]);
		}
	}
}
