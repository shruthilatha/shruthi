import java.io.*;
import java.util.*;
class days {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	if((s1.contains("monday"))||(s1.contains("tuesday"))||(s1.contains("wednesday"))||(s1.contains("thursday"))||(s1.contains("friday")))
	{
	   System.out.print(true);
	}else{
	    System.out.print(false);
	}
}
}
