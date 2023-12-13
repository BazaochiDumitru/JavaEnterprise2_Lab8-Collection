import java.util.BitSet;

public class BitSetTest {
    public static void main(String args[]) {
        // Se creează două obiecte BitSet cu o dimensiune inițială de 16 de biți fiecare.
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // Se setează anumiți biți în fiecare BitSet.
        for (int i = 0; i < 20; i++) {
            if ((i % 2) == 0)
                bits1.set(i); // Se setează biți pe pozițiile pare în bits1.
            if ((i % 5) != 0)
                bits2.set(i); // Se setează biți pe pozițiile care nu sunt divizibile cu 5 în bits2.
        }

        // Afișarea stării originale a BitSet-urilor.
        System.out.println("BitSet inițial bits1:");
        System.out.println(bits1);
        System.out.println("\nBitSet inițial bits2:");
        System.out.println(bits2);

        // Operația de AND între cele două BitSet-uri (bits2 și bits1).
        bits2.and(bits1);
        System.out.println("\nBitSet-ul rezultat după operația AND între bits2 și bits1:");
        System.out.println(bits2);

        // Operația de OR între cele două BitSet-uri (bits2 și bits1).
        bits2.or(bits1);
        System.out.println("\nBitSet-ul rezultat după operația OR între bits2 și bits1:");
        System.out.println(bits2);

        // Operația de XOR între cele două BitSet-uri (bits2 și bits1).
        bits2.xor(bits1);
        System.out.println("\nBitSet-ul rezultat după operația XOR între bits2 și bits1:");
        System.out.println(bits2);
    }
}
