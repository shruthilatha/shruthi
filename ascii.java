import java.util.*;
class ascii{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        String s1;
        for(int i=33;i<=255;i++)
        {
            s1=new Character((char)i).toString();
            System.out.println(i+"->"+s1);
        }
    }
}

