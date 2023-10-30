package z_Prueba;


public class Strin {

    public static void main(String[] args){

        String str = "a";

        int longitud = 0;

        String str2 ="";

        for (int i = 0; i < 5; i++){
            str2 +=str;

        }


        System.out.println(str2);



        /*
        String[] cadenas = new String[5];
        int[] espacios = new int[5];
        System.out.println("Introduce 5 cadenas de texto:");
        Scanner miScanner;
        String aux = "";


        for (int i = 0; i < cadenas.length; i++){
            miScanner = new Scanner(System.in);
            cadenas[i] = miScanner.next();
            aux =cadenas[i];
            espacios[i] = aux.length();
            if (longitud <= aux.length()){
                longitud = aux.length();

            }

        }


        for (int i = 0; i < cadenas.length; i++){
            System.out.println(cadenas[i]+" "+espacios[i]+" "+longitud+ aux);
            aux ="";
            for (int j = 0; j < longitud-espacios[j]; j++) {


                aux= aux+ "-";

                System.out.println(aux+"    *"+longitud + " "+espacios[j]);

            }
            System.out.println("*    "+cadenas[i]+aux+"    *");






            //for (int i = 0; i < cadenas.length; i++) {






            //System.out.println(cadenas[i]+" ");



        }

*/


    }}



