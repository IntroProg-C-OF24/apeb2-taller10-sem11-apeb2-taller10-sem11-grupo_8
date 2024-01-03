package taller_10;

import java.util.Scanner;

public class diagonalSecunadri_07 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim;
        System.out.print("Defina el tamaño de la matriz: ");
        lim = tcl.nextInt();
        int[][] tamanoMatriz = new int[lim][lim];
        for (int i = 0; i < lim; i = i + 1) {
            for (int j = 0; j < lim; j = j + 1) {
                tamanoMatriz[i][j] = (int) (Math.random() * (9 - (-9) + 1) + (-9));
            }
        }
        for (int i = 0; i < lim; i = i + 1) {
            for (int j = 0; j < lim; j = j + 1) {
                System.out.print(tamanoMatriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.print("Diagonal Secundaria: ");
        int j = lim - 1;
        for (int i = 0; i < lim; i = i + 1) {
            System.out.print(tamanoMatriz[i][j--] + " ");
        }
        System.out.println("");
        System.out.println("LOS NUMEROS POR ENCIMA DE LA DIAGONAL SECUNDARIA SON:");
        for (int i = 0; i < lim; i = i + 1) {
            for (int k = 0; k < lim; k = k + 1) {
                if (i == k) {
                    System.out.print(tamanoMatriz[i][k] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("LOS NUMEROS POR ABAJO DE LA DIAGONAL SECUNDARIA SON:");
        for (int i = 1; i < lim; i = i + 1) {
            for (int k = lim - i; k < lim; k = k + 1) {
                System.out.print(tamanoMatriz[i][k] + " ");
            }
        }
    }
}
