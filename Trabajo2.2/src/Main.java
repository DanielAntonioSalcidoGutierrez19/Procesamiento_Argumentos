import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arreglo = {1, -2, 1, 0, 5};
        int x = 0;
        boolean resultado = ParejadosNumeros(arreglo, x);

        if (resultado) {
            System.out.println("Se encontraron dos elementos con suma igual a " + x);
        } else {
            System.out.println("No se encontraron dos elementos con suma igual a " + x);
        }
    }

    public static boolean ParejadosNumeros(int[] arreglito, int x) {
        Arrays.sort(arreglito);
        int izquierda = 0;
        int derecha = arreglito.length - 1;
        boolean f= false;

        while (izquierda < derecha) {
            int suma = arreglito[izquierda] + arreglito[derecha];

            if (suma == x) {
                f = true;
                break;
            } else if (suma < x) {
                izquierda++;
            } else {
                derecha--;
            }
        }

        return f;
    }

}
