package Try_catch;


public class Try_catch5 
{
    public void m()
    {
        int data=50/0;
        System.out.println("muhtemelen çalismaz. m()'nin ici hata sonrasi");
    }    
    public void n()
    {
        m();
    }
    public void p()
    {
        n();
        System.out.println("yine muhtemelen calismaz. p()'nin ici fonksiyon cagirm asonrai");
    }
    public static void main(String[] Soylu)
    {
        Try_catch5 obj=new Try_catch5();
        try
        {
            obj.p();
        }
        catch(Exception e)
        {
            System.out.println("hata yakalandi :))");
        }
        System.out.println("normal flow :)");
    }
}
/*   
    output
    hata yakalandi :))
    normal flow :)
*/
//görüldüğü üzere hataadan sonraki fonksiyonu çalıştırmıyor açıkçası hat bulana kadar gidiyo gidiyo akıyo hiç  sorun yok ama hata bulduğu
//an catch bloğun ageçiyor ve daaha try bloğun adönmüyor. !!!önemlidir dikkate edelim :)) 