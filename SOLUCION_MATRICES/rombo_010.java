package taller_10;
import java.util.Scanner;
public class rombo_010 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el tamano:");
        int lim = tcl.nextInt();
        int [] c = new int[lim];
        for (int i = 0; i < c.length; i++) {
            for (int p = 0; p < c.length - i ; p++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 0; i <= lim; i++) {
            for (int m = lim-i; m < lim   ; m++) {
                System.out.print(" ");
            }   
            for (int j = lim; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}