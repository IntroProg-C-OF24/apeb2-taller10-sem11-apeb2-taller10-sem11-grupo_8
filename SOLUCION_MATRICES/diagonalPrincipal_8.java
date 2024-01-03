
package taller_10;
import java.util.Scanner;
public class diagonalPrincipal_8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int lim = tcl.nextInt();
        int [][] c = new int[lim][lim];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=((int)(Math.random()*(9-(-9)-1)+(-9)));
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println("");
        }System.out.println("LOS NUMEROS DE LA DIAGONAL PRINCIPAL SON:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if(c[i] == c[j]){
                    System.out.print(c[i][j]+",");
                }
            }
        }System.out.println("");
        System.out.println("LOS NUMEROS POR ENCIMA YA ABAJO DE LA DIAGONAL PRINCIPAL SON:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if(c[i] != c[j]){
                    System.out.print(c[i][j]+",");
                }
            }
        }
    }
}
