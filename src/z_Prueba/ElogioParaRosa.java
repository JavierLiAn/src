package z_Prueba;

public class ElogioParaRosa {
    public static void main(String[] args) {
        String nombre = "guapa";
        String elogio = elogiar(nombre);
        System.out.println(elogio);
    }

    public static String elogiar(String nombre) {
        return "Hola " + nombre + ", solo quería decirte que eres una monada.";
    }
}
