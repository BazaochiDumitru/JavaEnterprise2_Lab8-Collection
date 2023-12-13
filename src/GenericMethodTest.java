// Exemplul următor arată cum putem scoate o matrice de tipuri diferite folosind o singură matrice generică:

public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray) {
        // Afișăm elementele din array
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Creăm array-uri de tip Integer, Double și Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'S', 'A', 'L', 'U', 'T'};

        System.out.println("Matricea intArray conține:");
        printArray(intArray);   // Apelăm metoda cu un array de tip Integer

        System.out.println("\nMatricea doubleArray conține:");
        printArray(doubleArray);   // Apelăm metoda cu un array de tip Double

        System.out.println("\nMatricea charArray conține:");
        printArray(charArray);   // Apelăm metoda cu un array de tip Character
    }
}

