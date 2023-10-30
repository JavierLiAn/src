package Ej36_al_40;

public class Ejercicio38 {
    public static void main(String[] args) {

        int vocales= 0;
        String texto = "Como en los ejercicios anteriores, la cadena de texto puede ser definida dentro";

        for (int i = 0; i < texto.length(); i++) {
            if( texto.charAt(i) == 'a'||texto.charAt(i) == 'e'||
                    texto.charAt(i) == 'i' || texto.charAt(i) == 'o'||
                    texto.charAt(i) == 'u'|| texto.charAt(i) == 'A' ||
                    texto.charAt(i) == 'E'||texto.charAt(i) == 'I'||
                    texto.charAt(i) == 'O' || texto.charAt(i) == 'U') {

                vocales++;
            }
        }
        System.out.println("El texto tiene "+vocales+" vocales.");
    }
}