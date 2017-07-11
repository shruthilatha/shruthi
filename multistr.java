import java.util.*;
class multistr
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        int i=Integer.parseInt(s1);
        int j=Integer.parseInt(s2);
        int result=i*j;
        String res=Integer.toString(result);
        System.out.print(res);
    }
}
