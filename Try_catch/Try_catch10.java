package Try_catch;
import java.util.*;
public class Try_catch10 
{
    public static void main(String[] Soylu)
    {
        float c=2, b=1, d;
        d=89;
        System.out.println("c = "+c+" b = "+b+" d = "+d);
        int a;
        try
        {
            Scanner in=new Scanner(System.in);
            a=in.nextInt();
            if(a==0)
                throw new IllegalArgumentException("the value cannot be zero");
        }
        catch(OutOfMemoryError e)//boyle olursada yakalayamaz. yukarıdakı farklı exception alttakı farklı
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Done");
    }
}//hocam burada fırlattığın specific eexception ile catch'de yakaldığın exception aynı omalı. ancak ben her turlu htayuı yakalasın istiyorum
//dersen direkt Exception dersen her turlu hatayı yakalar.