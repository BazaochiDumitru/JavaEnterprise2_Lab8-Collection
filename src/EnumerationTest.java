import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTest {
    public static void main(String args[]) {
        // Aici se declară o variabilă de tip Enumeration numită days. Interfața Enumeration permite extragerea secvențială a elementelor dintr-o structură de date.
        Enumeration days;
        // Se creează un obiect Vector numit dayNames pentru a stoca numele zilelor săptămânii
        Vector dayNames = new Vector();

        dayNames.add("Luni"); //adaugarea
        dayNames.add("Marti");
        dayNames.add("Miercuri");
        dayNames.add("Joi");
        dayNames.add("Vineri");
        dayNames.add("Sambata");
        dayNames.add("Duminica");
        days = dayNames.elements();

        // O buclă while este folosită pentru a parcurge elementele. Aceasta se execută atâta timp cât Enumeration are mai multe elemente de extras.
        while (days.hasMoreElements()) {
            System.out.println(days.nextElement()); //Obiectul nextElement() - este folosit pentru a obține următorul element din secvență
        }
    }
}