import java.util.*;
class numeric
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        char ch1=0;
        for(int i=0;i<ch.length;i++)
        {
            ch1=ch[i];
        } 
        if((ch1>=65 && ch1<=90)||(ch1>=97 && ch1<=122))
        {
            System.out.print(false);
        }else{
            System.out.print(true);
        }
    }
}
