import java.util.*;
class sumzero {
    	public static void main(String a[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a1[]=new int[n];
		int sum=0,t=0,x=0,y=0;
	    for(int i=0;i<n;i++)
		{
			a1[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=Math.abs(a1[i]+a1[j]);
				if(i==0 && j==1)
				{
					t=sum;
					x=a1[i];
					y=a1[j];
				}
				if(sum<t)
				{
					t=sum;
					x=a1[i];
					y=a1[j];
				}
			}
	  }
		System.out.println("The two elements are:"+x+" "+y);
	}
}
