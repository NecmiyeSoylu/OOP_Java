// hocanın yazdığı q girene kadar oyun devam der her elden sonra skorlar yazdırılır
import java.util.Scanner;
public class RockPapperSicissor3 
{
    public static void main(String[] Soylu)
    {
        Gamer g1=new Gamer("Edison");
        Gamer g2=new Gamer("tesla");
        Arena arena=new Arena(g1,g2);
        arena.startGame();
    }
}
class Arena
{
    Gamer gamer1, gamer2;
    static boolean isGameOver;
    Arena(Gamer g1, Gamer g2)
    {
        this.gamer1=g1;
        this.gamer2=g2;
    }
    void startGame()
    {
        while(!isGameOver)
        {
            this.gamer1.move();
            this.gamer2.move();
            processMoves(gamer1, gamer2);
            disPlayScor(gamer1, gamer2);
        }
    }
    static void processMoves(Gamer g1, Gamer g2)
    {
        if(g1.sign==null || g2.sign==null || Arena.isGameOver) return;
        else if(g1.sign==g2.sign) Gamer.draw++;
        else if(g1.sign==HandSign.PAPPER && g2.sign==HandSign.ROCK) g1.win++;
        else if(g1.sign==HandSign.SICİSSOR && g2.sign==HandSign.PAPPER) g1.win++;
        else if(g1.sign==HandSign.ROCK && g2.sign==HandSign.SICİSSOR) g1.win++;
        else g2.win++;
        Gamer.trail++;
    }
    static void disPlayScor(Gamer g1, Gamer g2)
    {
        System.out.println(g1.name+" "+g1.win);
        System.out.println(g2.name+" "+g2.win);
        System.out.println("trail "+Gamer.trail);
    }
}
class Gamer
{
    boolean isInputValid=false;
    String name;
    static int draw, trail;
    int win;
    Scanner in=new Scanner(System.in);
    HandSign sign;
    Gamer(String name)
    {
        this.name=name;
    }
    void move()
    {
        do{
            isInputValid=false;
            System.out.println("enter  "+this.name+" ");
            char c=in.nextLine().charAt(0);
            switch(c)
            {
                case 'q':
                    Arena.isGameOver=true;
                    break;
                case 'r':
                    sign=HandSign.ROCK;
                    break;
                case 'p':
                    sign=HandSign.PAPPER;
                    break;
                case 's':
                    sign=HandSign.SICİSSOR;
                    break;
                default:
                    System.out.println("wrong choise. It must be s, r or p");
                    isInputValid=true;
                    break;
            }
        }while(isInputValid);
    }
    
}
enum HandSign 
{
    ROCK,
    SICİSSOR,
    PAPPER;
}
