package taller_10;

import java.util.Scanner;

public class sumRest_06 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Defina la dimension de las matrices:");
        int lim = tcl.nextInt();
        int[][] resultadoM = new int[lim][lim];
        int[][] tamanoMatriz = new int[lim][lim];
        int[][] tamanoMatriz2 = new int[lim][lim];
        System.out.println("Matriz 1:");
        for (int i = 0; i < tamanoMatriz.length; i++) {
            for (int j = 0; j < tamanoMatriz.length; j++) {
                tamanoMatriz[i][j] = ((int) (Math.random() * (9 - (-9) - 1) + (-9)));
            }
        }
        for (int i = 0; i < tamanoMatriz.length; i++) {
            for (int j = 0; j < tamanoMatriz.length; j++) {
                System.out.print(tamanoMatriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Matriz 2:");

        for (int i = 0; i < tamanoMatriz2.length; i++) {
            for (int j = 0; j < tamanoMatriz2.length; j++) {
                tamanoMatriz2[i][j] = ((int) (Math.random() * (9 - (-9) - 1) + (-9)));
            }
        }
        for (int i = 0; i < tamanoMatriz2.length; i++) {
            for (int j = 0; j < tamanoMatriz2.length; j++) {
                System.out.print(tamanoMatriz2[i][j] + "\t");
            }
            System.out.println("");

        }
        System.out.println("=====================================================================");
        System.out.println("Ingrese el simbolo (+) si desea SUMAR o si desea RESTAR ingrese (-)");
        String operacion = tcl.next();
        if (operacion.equals("+")) {
            for (int i = 0; i < lim; i++) {
                for (int j = 0; j < lim; j++) {

                    resultadoM[i][j] = tamanoMatriz[i][j] + tamanoMatriz2[i][j];

                }
            }
        } else if (operacion.equals("-")) {
            for (int i = 0; i < lim; i++) {
                for (int j = 0; j < lim; j++) {
                    resultadoM[i][j] = tamanoMatriz[i][j] - tamanoMatriz2[i][j];
                }
            }
            System.out.println("=====================================================================");
            System.out.println("Resultado :");
            for (int i = 0; i < resultadoM.length; i++) {
                for (int j = 0; j < resultadoM.length; j++) {
                    System.out.print(resultadoM[i][j] + "\t");
                }
                System.out.println("");
            }
        }
    }
}
