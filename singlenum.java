import java.util.*;
class singlenum
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a1[i]==a1[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                k=a1[i];
                break;
            }
        }
        System.out.print(k);
    }
}

