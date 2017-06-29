import java.util.*;
class primeinterval
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int flag=0;
        for(int i=n1;i<=n2;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=0;
                    break;
                }else
                {
                    flag=1;
                }
            }
                if(flag==1)
                {
                    System.out.println(i);
                }
            
        }
    }
}
