import java.util.*;
class armstrong
{
    public static void main(String a[])
    {
    Scanner s=new Scanner(System.in);
    int nu=s.nextInt();
    int rem=0,sum=0,n;
    n=nu;
    while(n>0)
    {
        rem=n%10;
        sum=sum+rem*rem*rem;
        n=n/10;
    }
    if(nu==sum)
    {
        System.out.println("armstrong number");
    }
        else
        {
        System.out.println("Not an armstrong number");
    }
        
    }
}
