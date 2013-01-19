package zad2.zad2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Wyswietlanie biezace = new DaneBiezace();
        Wyswietlanie prognoza = new Prognoza();
        
        DanePogodowe dane = new DanePogodowe();
        
        dane.dodajWyswietlacz(prognoza);
        dane.dodajWyswietlacz(biezace);
        
        dane.setCisnienie(23);
        dane.setTemperatura(45);
        dane.setWilgotnosc(12);
        
        System.out.println(biezace.wyswietlanie());
        System.out.println(prognoza.wyswietlanie());
    }
}
