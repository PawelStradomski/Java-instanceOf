
package pkginstanceof;
/**
 * 
 * @author pawelstradomski
 */

public class Instanceof {

    
    public static void main(String[] args) {
        Osoba[] person = new Osoba[4];
        person[0] = new Pracownik("Pawel", "Gawel", 50000);
        person[1] = new Student("Mietek", "Brzuchomowca");
        
//        person[0].pobierzOpis(); // lub mozna to w petli
//        person[1].pobierzOpis(); // lub mozna to w petli

            for(int i=0; i<person.length; i++)
            {
                if(person[i] instanceof Osoba) // sprawdzenie czy person(student,pracownik) to instancja kl.Osoba
                person[i].pobierzOpis();
                else
                    break;
            }
        
        
    }
    
}
abstract class Osoba
{
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    abstract void pobierzOpis();
    
}
class Pracownik extends Osoba
{
    double wynagrodzenie;
    
    Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
    }
    
}
class Student extends Osoba
{
    Student(String imie, String nazwisko)
    {
        super(imie, nazwisko);
        
    }

    @Override
    void pobierzOpis() 
    {
        System.out.println("Jestem studentem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        
    }
    
}