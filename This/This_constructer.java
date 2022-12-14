package This;
//? Nedir yahu bu this? this objenin refaransı döndürür
public class This_constructer
{
    public static void main(String[] Soylu)
    {
        Student s1=new Student(1,"elif","can");
        System.out.println(s1.name);
    }    
}
class Student
{
    int number;
    String name, sur_name, nick_name;
    Student(int number, String name, String sur_name)
    {                       //? this çalıştıran bulunulan objenin refaransını döndürür demiştik
        this.number=number;//? mesala burada objenin refaransı.number diyoruz. normalde maind de aynısını yapıyoruz zaten.
        this.sur_name=name;
        this.name=name;
    }
    Student(int number, String name, String sur_name, String nick_name)
    {
        this(number,name,sur_name); // !
        this.nick_name=nick_name;
    }
}
class Numara 
{
    int number;
    Numara(int number)
    {
        this.number=number;
    }
    Numara()
    {
        this(5);//defaoult :)) C++'da zaten default değer yapabiliyruz ama javada yok o da boyle çözülebilir.
    } 
}
class Kedi
{
    String color, name;
    int age;
    Kedi(int age, String color, String name)
    {
        this(name);
        this.age=age;
        this.color=color;
        
    }
    Kedi(String name)
    {
        this.name=name;
        System.out.println("yeni kedinin adi  "+name);// kurucu yapmasını istediğimiz bir işi yapıyorsa. bu işlemi yapması için başka kurucun içindede this() çalıştırırız
    }
}
/*
 * this()kullanımı
 * tekrar tekrar atamakatan kurtukmak için diğer kurucuyu çağırmma amaçlı
 * default değer vermek için
 * diğer kurucu onemli bir işlem yapılıyorsa bunun yapılmasını sağlama:)
 * kısaca this'in zaten bu obje demek olduğunu biliyoruz this() deyince de bu obje için kurucuyu çalıştırıryor :))
 */