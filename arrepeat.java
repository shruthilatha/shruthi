import java.util.*;
class arrepeat
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[10];
        int k=0;
        for(int i=0;i<n;i++)
        {
            a1[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a1[i]==a1[j] )&&(i!=j))
                {
                    a2[k]=a1[j];
                    k++;
                }
            }
        }
        System.out.print("The first repeated element in array is"+" "+a2[0]);
    }
}
    

       
