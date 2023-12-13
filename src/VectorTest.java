// Importăm clasa pentru a folosi Vector și alte clase necesare
import java.util.*;

public class VectorTest {
    public static void main(String args[]) {
        // Inițializăm un obiect Vector cu un anumit capacitate inițială (3) și un pas (2)
        Vector v = new Vector(3, 2);
        // Afișăm dimensiunea inițială a vectorului
        System.out.println("Marimea initiala: " + v.size());
        // Afișăm capacitatea inițială a vectorului
        System.out.println("Capacitatea initiala: " + v.capacity()); // Metoda capacity() returnează capacitatea actuală a vectorului.

        // Adăugăm elemente în vector folosind metoda addElement(Object obj)
        v.addElement(Integer.valueOf(1));
        v.addElement(Integer.valueOf(2));
        v.addElement(Integer.valueOf(3));
        v.addElement(Integer.valueOf(4));
        // Afișăm capacitatea după adăugarea celor patru elemente
        System.out.println("Capacitate după patru pliuri: " + v.capacity());

        // Adăugăm elemente de tip Double și Integer în vector
        v.addElement(Double.valueOf(5.45));
        System.out.println("Capacitatea actuală: " + v.capacity());
        v.addElement(Double.valueOf(6.08));
        v.addElement(Integer.valueOf(7));
        System.out.println("Capacitatea actuală: " + v.capacity());

        // Adăugăm elemente de tip Float și Integer
        v.addElement(new Float(9.4));
        v.addElement(Integer.valueOf(10));
        System.out.println("Capacitatea actuală: " + v.capacity());

        // Adăugăm două elemente de tip Integer
        v.addElement(Integer.valueOf(11));
        v.addElement(Integer.valueOf(12));

        // Afișăm primul element din vector folosind metoda firstElement()
        System.out.println("Al cincilea element: " + (Integer)v.firstElement());
        // Metoda firstElement() returnează primul element (elementul cu indexul 0) din vector.

        // Afișăm ultimul element din vector folosind metoda lastElement()
        System.out.println("Ultimul element: " + (Integer)v.lastElement());
        // Metoda lastElement() returnează ultimul element din vector.

        // Verificăm dacă vectorul conține elementul cu valoarea 3 folosind metoda contains(Object elem)
        if(v.contains(new Integer(3)))
            System.out.println("Vectorul contine 3.");

        // Enumerăm elementele din vector folosind un obiect de tip Enumeration și afișăm elementele
        Enumeration vEnum = v.elements();
        System.out.println("\nElementele din vector:");

        // Folosim un ciclu while pentru a parcurge și afișa elementele
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
