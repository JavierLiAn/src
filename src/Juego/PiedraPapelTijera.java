package Juego;

import java.util.Scanner;

import static java.lang.System.*;


public class PiedraPapelTijera {

    static public int victoriasJugador=0;
    static public int victoriasMaquina=0;
    static public int empates=0;
    static public int[] jugadasJugador = {0, 0, 0};
    static public int[] jugadasMaquina = {0, 0, 0};

    // 0 = Piedra
    // 1 = Papel
    // 2 = Tijeras


    public static int jugadaIA (){
        return (int)Math.floor(Math.random()*3);
    }

    public static String calculaGanador (int jugador, int maquina){
        if (jugador >=0 || jugador <=2) {
            jugadasJugador[jugador]++;
            jugadasMaquina[maquina]++;

            if (jugador == maquina) {
                empates ++;
                return "Empate";
            }

            switch (jugador) {
                case 0:
                    if (maquina == 1) {
                        victoriasMaquina++;
                        return "Gana la IA";

                    } else {
                        victoriasJugador++;
                        return "Gana el usuario";
                    }

                case 1:

                    if (maquina == 2) {
                        victoriasMaquina++;
                        return "Gana la IA";

                    } else {
                        victoriasJugador++;
                        return "Gana el usuario";
                    }
                case 2:

                    if (maquina == 0) {
                        victoriasMaquina++;
                        return "Gana la IA";

                    } else {
                        victoriasJugador++;
                        return "Gana el usuario";
                    }
            }

        }
        return "El número no es válido";
    }

    public static String muestraEstadisticas (int jugador, int maquina){

        int total = victoriasJugador + victoriasMaquina + empates;
        String victoriasJ;
        String victoriasM;
        String empatesJyM;

        if (victoriasJugador > 0){ // Comprueba que el valor es > 0 para evitar dividir 0
            victoriasJ= Integer.toString((victoriasJugador*100)/total);
        }else{
            victoriasJ= Integer.toString((victoriasJugador));
        }

        if (victoriasMaquina > 0){
            victoriasM= Integer.toString((victoriasMaquina*100)/total);

        }else{
            victoriasM= Integer.toString((victoriasMaquina));

        }
        if (empates > 0){
            empatesJyM= Integer.toString((empates*100)/total);
        }else{
            empatesJyM= Integer.toString((empates));

        }

        String jugadasJ = "Piedra: "+jugadasJugador[0]+" Papel: "+jugadasJugador[1]+" Tijeras: "+ jugadasJugador[2] ;
        String jugadasM = "Piedra: "+jugadasMaquina[0]+" Papel: "+jugadasMaquina[1]+" Tijeras: "+ jugadasMaquina[2] ;

        return "[Jugador] Victorias: "+victoriasJ+"% Empates: "+ empatesJyM+"%\n"+jugadasJ+"\n"+
                "[Maquina] Victorias: "+victoriasM+"% Empates: "+ empatesJyM+"%\n"+jugadasM;
    }


    public static void main(String[] args) {


        int jugador;
        int maquina = jugadaIA();

        Scanner input = new Scanner(in);

        System.out.println("Piedra (0),Papel (1), Tijeras (2)\nIntroduce la jugada: ");
        jugador = input.nextInt();

        System.out.println(jugador+" "+maquina);


        while (jugador< 2 || jugador > 0){
            System.out.println(jugador+" "+maquina);
            System.out.println(calculaGanador(jugador, maquina));
            System.out.println(muestraEstadisticas(jugador, maquina));

            System.out.println("\n_____________________________  \n");

            System.out.println("Piedra _0_,Papel (1), Tijeras (2)\nIntroduce la jugada: ");
            jugador = input.nextInt();
            maquina = jugadaIA();

        }

    }
}
