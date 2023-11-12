package String_18_22;

import java.util.Scanner;

import static java.lang.System.*;

public class SumarBinario {

    public static void main(String[] args) {

        String binario1;
        String binario2;
        String binarioMayor;
        String binarioMenor;
        boolean meLlevoUna = false;
        char cifraBinarioMayor;
        String sumaBinario = " ";

        Scanner input = new Scanner(in);
        System.out.println("Introduce el número binario: ");
        binario1 = input.nextLine();

        System.out.println("Introduce el otro número binario: ");
        binario2 = input.nextLine();

        if (binario1.length()>= binario2.length()){
            binarioMayor = binario1;
            binarioMenor = binario2;
        }else{
            binarioMayor = binario2;
            binarioMenor = binario1;
        }

        int diferenciaLongitud = binarioMayor.length() - binarioMenor.length();

        for (int i = binarioMayor.length()-1; i >= 0 ; i--) {

            if (i - diferenciaLongitud < 0){
                if (meLlevoUna){
                    if (binarioMayor.charAt(i) == '0'){
                        sumaBinario = "1" +sumaBinario;
                        meLlevoUna = false;

                    }else{
                        sumaBinario = "0" +sumaBinario;
                        meLlevoUna = true;
                    }
                }else{
                    sumaBinario = binarioMayor.charAt(i) + sumaBinario;
                }
            }else{

                if (meLlevoUna){

                    if (binarioMayor.charAt(i) == '0'){
                        cifraBinarioMayor = '1';
                        meLlevoUna = false;

                    }else{
                        cifraBinarioMayor = '1';
                        meLlevoUna = true;
                    }

                }else{
                    cifraBinarioMayor = binarioMayor.charAt(i);
                }

                if (cifraBinarioMayor == '0'){

                    if (binarioMenor.charAt(i-diferenciaLongitud) == '0'){
                        sumaBinario = "0" +sumaBinario;

                    }else{

                        sumaBinario = "1" +sumaBinario;
                    }

                }else{

                    if (binarioMenor.charAt(i-diferenciaLongitud) == '0'){

                        if (meLlevoUna){
                            sumaBinario = "0" +sumaBinario;
                            meLlevoUna = false;

                        }else{
                            sumaBinario = "1" +sumaBinario;
                        }

                    }else{

                        if (meLlevoUna) {
                            sumaBinario = "1" +sumaBinario;
                        }else{
                            sumaBinario = "0" +sumaBinario;
                            meLlevoUna = true;
                        }
                    }
                }
            }
        }

        if (meLlevoUna){
            sumaBinario = "1" +sumaBinario;
        }

        System.out.println(sumaBinario);

    }
}


