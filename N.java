import java.io.*;
import java.util.*;
class N
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num,sum=0; 
        for(int i=0;i<n;i++)
        {
            num=s.nextInt();
            sum=sum+num;
        }
        System.out.println("Sum of N number is:"+sum);
    }
}
