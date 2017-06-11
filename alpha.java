import java.io.*;
import java.util.*;
class alpha 
{
public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(Character.isAlphabetic(ch))
		{
		    System.out.println("Character is alphabet");
      }else
      {
	    System.out.println("Character is not alphabet");
	  }

	}
}
