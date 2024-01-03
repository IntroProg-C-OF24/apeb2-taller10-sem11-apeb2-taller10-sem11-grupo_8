package taller_10;

import java.util.Scanner;

public class piramdie_09 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el tamano:");
        int lim = tcl.nextInt();
        int[] c = new int[lim];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
