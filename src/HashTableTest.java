// Importăm clasa necesară pentru a utiliza Hashtable și Enumeration
import java.util.*;

public class HashTableTest {
    public static void main(String args[]) {
        // Creăm o hartă hash (Hashtable)
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        // Adăugăm câteva perechi cheie-valoare în Hashtable
        balance.put("Maria", new Double(3434.34));
        balance.put("Mihai", new Double(123.22));
        balance.put("Oleg", new Double(1378.00));
        balance.put("Denis", new Double(99.22));
        balance.put("Anton", new Double(-19.08));

        // Afișăm toate balanțele din Hashtable
        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Adăugăm 1,000 la soldul lui Maria
        bal = ((Double)balance.get("Maria")).doubleValue();

        // Returnează un obiect get(Object key), care conține valoarea asociată cu cheia.
        // În cazul în care cheia nu se află în tabelul hash, se returnează un obiect nul.
        balance.put("Maria", new Double(bal + 1000));
        //Object put(Object key, Object value)
        // Inserați cheia și valoarea în tabelul hash. Returnează null dacă cheia nu este încă
        // în tabelul hash, returnează valoarea anterioară asociată cu cheia dacă aceasta se află deja în tabelul hash.
        System.out.println("New Balance Maria: " + balance.get("Maria"));
    }
}