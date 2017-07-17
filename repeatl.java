import java.util.*;
class repeatl{
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		int len=s2.length;
		int max=0;
		String s3="";
		for(int i=0;i<len;i++)
		{
		    int count=0;
		    for(int j=0;j<s2[i].length();j++)
		    {
		        for(int k=0;k<s2[i].length();k++)
		        {
		            if(s2[i].charAt(j)==s2[i].charAt(k))
		            {
		                count++;
		            }
		        }
		    }
		          if(count>max)      
		          {
		              s3=s2[i];
		              max=count;
		          }
		}
		System.out.print(s3);
	}
}
		                
		                
		                	
