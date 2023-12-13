// Importăm clasa necesară pentru a folosi Stack
import java.util.*;

public class StackTest {
    // Metoda pentru a introduce (push) un element în stivă și a-l afișa
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("Impinge(" + a + ")");
        System.out.println("Stiva: " + st);
    }

    // Metoda pentru a elimina (pop) un element din stivă și a-l afișa
    static void showpop(Stack st) {
        System.out.print("Impusca -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stiva: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("Stiva: " + st);

        // Adăugăm câteva elemente în stivă și le afișăm
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);

        // Scoatem elemente din stivă și le afișăm
        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (EmptyStackException e) {
            System.out.println("Stiva pustie"); // Tratăm excepția EmptyStackException în cazul unui stack gol
        }
    }
}
