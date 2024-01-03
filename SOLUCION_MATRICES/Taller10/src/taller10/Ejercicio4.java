package taller10;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] tabla = new char[3][3];
        char jugTurn = 'X';
        boolean gana = false;
        int moves = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = '-';
            }
        }
        System.out.println("INICIO");
        while (!gana && moves < 9) {
            for (int i = 0; i < tabla.length; i++) {
                for (int j = 0; j < tabla.length; j++) {
                    System.out.print(tabla[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("TURNO DE: " + jugTurn);
            System.out.print("ELIGE UNA FILA DEL 1 AL 3: ");
            int fila = sc.nextInt() - 1;
            System.out.print("ELIGE UNA COLUMNA DEL 1 AL 3: ");
            int columna = sc.nextInt() - 1;
            if (tabla[fila][columna] == '-') {
                tabla[fila][columna] = jugTurn;
                moves++;
                if (tabla[fila][0] == jugTurn && tabla[fila][1] == jugTurn && tabla[fila][2] == jugTurn
                        || tabla[0][columna] == jugTurn && tabla[1][columna] == jugTurn && tabla[2][columna] == jugTurn
                        || fila == columna && tabla[0][0] == jugTurn && tabla[1][1] == jugTurn && tabla[2][2] == jugTurn
                        || fila + columna == 2 && tabla[0][2] == jugTurn && tabla[1][1] == jugTurn && tabla[2][0] == jugTurn) {
                    gana = true;
                    System.out.println("=============== GANA: " + jugTurn + " ===============");
                }
                jugTurn = jugTurn == 'X' ? '0' : 'X';
            } else {
                System.out.println("POSICION YA OCUPADA, ELIGE OTRA");
            }
        }
        if (!gana) {
            System.out.println("EMPATE");
        }
        System.out.println("TABLERO");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("FIN DEL JUEGO");
    }
}