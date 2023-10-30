package MetodosValor;
public class Ejercicio6 {

    public static boolean esPrimo (int num){
        boolean primo = true;

        if (num % 2 != 0) {
            for (int i = 3; i <= num / 2; i += 2) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        } else {
            primo = false;
        }
        return primo;
    }
}
