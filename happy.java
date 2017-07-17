import java.util.*;
class happy
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=0,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
            if(n==0 && sum!=1)
            {
                n=sum;
                sum=0;
            }
        }
        if(sum==1)
        {
            System.out.print("happy number");
        }else{
            System.out.print("Not a happy number");
        }
    }
}
