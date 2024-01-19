import java.util.Arrays;

public class Ejercicio17 {
    public static void main(String[] args) {
        int numeros[] = {30, 1, 18, 5, 23, 60};
        String letras[] = {"laptop", "cocina", "aves", "zanahoria", "pala"};
        Arrays.sort(numeros);
        System.out.println("Arreglo ordenado de números "+ Arrays.toString(numeros));
        Arrays.sort(letras);
        System.out.println("Arreglo ordenado de palabras"+ Arrays.toString(letras));
    }
}
