// Importăm clasa necesară pentru a utiliza Properties, Set și Iterator
import java.util.*;

public class PropertiesTest {
    public static void main(String args[]) {
        // Creăm un obiect Properties pentru a stoca perechile cheie-valoare
        Properties capitals = new Properties();
        Set states;
        String str;

        // Adăugăm câteva perechi cheie-valoare în obiectul Properties
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");

        // Afișăm toate statele și capitalele din obiectul Properties
        states = capitals.keySet();   // Obținem un set cu cheile
        Iterator itr = states.iterator();

        while(itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("Capitala " + str + " este " +
                    capitals.getProperty(str) + ".");
        }
        // String getProperty(String key)
        // Returnează valoarea asociată cu cheia. Se returnează un obiect nul
        // dacă cheia nu se află nici în listă, nici în lista de proprietăți implicite.
        System.out.println();

        // Obținem capitala statului "Florida" și furnizăm un mesaj dacă cheia nu există
        str = capitals.getProperty("Florida", "Nu a fost gasita");
        System.out.println("Capitala statului Florida " + str + ".");
    }
}
