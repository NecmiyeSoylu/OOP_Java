package StaticVaraible;
// Nedir bu static? Normalde biz obje oluşturduğumuzda class bellekte bulunnan bir yapı değil ancak her obje
//bellekte ayrı ayrı yaşayan yapılar olarak düşünşebilir demiştik. yani her obje bellekte atyrı ayrı yer kaplar. 
//şimdi biz tüm objeler için aynı olacak bir değerde ne diye bellekte ayrı ayrı yer kaplıyalım diyoruz. 
//Static tam bu noktada yardım ediyor. Bir ifade static olduğu  zaman bellekte ilk tanımladığımızda bir kez yer kaplıyor. her obje bu bir tane ifadeyi kullanıyor :))
public class Static_ 
{
    private int id;
    private String name;
    private int salary;
    static String company_name="Simurg";//bunu consructerın içerisinde atmammamızın sebebi zaten bir sefer atanınca herkes için aynı oluyor
                                        //her constructer çalıştığında tekrar tekrar oraya uğrayıp atamnın bir manası yok.
    Static_(int id, String name, int salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void print_info()
    {
        System.out.println(company_name+" "+id+" "+name+" "+salary);
    }
    
}
