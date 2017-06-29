import java.util.*;
class ainterval
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int a1=s.nextInt();
        int a2=s.nextInt();
        int temp,r=0;
        int sum=0;
        for(int i=a1;i<=a2;i++)
        {
            temp=i;
            while(temp>0)
            {
                r=temp%10;
                sum=sum+(r*r*r);
                temp=temp/10;
            }
            if(sum==i)
              {    
                 System.out.println(i);
              }
                 sum=0;
         }
    }
}
