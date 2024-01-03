
package taller10;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numProd,capacidad=200, datos=2, tipoCambio, anadir, elim, mod, compra, cantcompra, numProdsComp;
        double total=0, descuento=0;
        String cambios;
        boolean config=true;
        System.out.println("Ingrese el numero de productos que quiere ingresar");
        numProd = teclado.nextInt();
        double prods[][]= new double [capacidad][datos];
        String nombres[]= new String[capacidad];
        for (int i = 0; i < numProd; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("Ingrese el nombre del producto "+(i+1));
                nombres[i]= teclado.next();
                System.out.println("Ingrese el precio del producto "+(i+1));
                prods[i][j]=teclado.nextDouble();
                System.out.println("Ingrese la cantidad de unidades del producto "+(i+1));
                prods[i][(j+1)]=teclado.nextDouble();
            }
        }
        System.out.println("   NOMBRE\t\t/ PRECIO\t/ UNIDADES");
        for (int i = 0; i < numProd; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.printf("%d-%s\t\t\t",(i+1),nombres[i]);
                System.out.printf("%.2f\t\t",prods[i][j]);
                System.out.printf("%.0f\n",prods[i][(j+1)]);
            }
        }
        while(config){
            System.out.println("===========================================");
            System.out.println("DESEA REALIZAR CAMBIOS EN EL INVENTARIO?");
            System.out.println("-Escriba [SI] si desea realizar cambios ");
            System.out.println("-Escriba [NO] si NO desea realizar cambios");
            System.out.println("===========================================");
            cambios = teclado.next();
            if(cambios.equals("SI")){
                System.out.println("SI DESEAS ANADIR OBJETOS ESCRIBE [1]");
                System.out.println("SI DESEAS ELIMINAR OBJETOS ESCRIBE [2]");
                System.out.println("SI DESEAS MODIFICAR OBJETOS ESCRIBE [3]");
                tipoCambio=teclado.nextInt();
                if(tipoCambio==1){
                    System.out.println("CUANTOS OBJETOS QUIERE ANADIR?");
                    anadir = teclado.nextInt();
                    for (int i = numProd; i < (numProd+anadir); i++) {

                        for (int j = 0; j < 1; j++) {
                            System.out.println("Ingrese el nombre del producto "+(i+1));
                            nombres[i]= teclado.next();
                            System.out.println("Ingrese el precio del producto "+(i+1));
                            prods[i][j]=teclado.nextDouble();
                            System.out.println("Ingrese la cantidad de unidades del producto "+(i+1));
                            prods[i][(j+1)]=teclado.nextDouble();
                        }
                    }
                    numProd+=anadir;
                    System.out.println("   NOMBRE\t\t/ PRECIO\t/ UNIDADES");
                    for (int i = 0; i < numProd; i++) {
                        for (int j = 0; j < 1; j++) {
                            System.out.printf("%d-%s\t\t\t",(i+1),nombres[i]);
                            System.out.printf("%.2f\t\t",prods[i][j]);
                            System.out.printf("%.0f\n",prods[i][(j+1)]);
                        }
                    }
                }
                if(tipoCambio==2){
                    System.out.println("QUE PRODUCTO QUIERE ELIMINAR");
                    elim=teclado.nextInt();
                    prods[(elim-1)][0]=0;
                    prods[(elim-1)][1]=0;
                    nombres[(elim-1)]="N/E";
                    System.out.println("   NOMBRE\t\t/ PRECIO\t/ UNIDADES");
                    for (int i = 0; i < numProd; i++) {
                        for (int j = 0; j < 1; j++) {
                            System.out.printf("%d-%s\t\t\t",(i+1),nombres[i]);
                            System.out.printf("%.2f\t\t",prods[i][j]);
                            System.out.printf("%.0f\n",prods[i][(j+1)]);
                        }
                    }
                }
                if(tipoCambio==3){
                    System.out.println("QUE PRODUCTO QUIERE MODIFICAR");
                    mod=teclado.nextInt();
                    for (int i = (mod-1); i < mod; i++) {
                        for (int j = 0; j < 1; j++) {
                            System.out.println("Ingrese el nombre del producto "+(i+1));
                            nombres[i]= teclado.next();
                            System.out.println("Ingrese el precio del producto "+(i+1));
                            prods[i][j]=teclado.nextDouble();
                            System.out.println("Ingrese la cantidad de unidades del producto "+(i+1));
                            prods[i][(j+1)]=teclado.nextDouble();
                        }
                    }           
                    System.out.println("   NOMBRE\t\t/ PRECIO\t/ UNIDADES");
                    for (int i = 0; i < numProd; i++) {
                        for (int j = 0; j < 1; j++) {
                            System.out.printf("%d-%s\t\t\t",(i+1),nombres[i]);
                            System.out.printf("%.2f\t\t",prods[i][j]);
                            System.out.printf("%.0f\n",prods[i][(j+1)]);
                        }
                    }
                }
            }
            else{
                config=false;
                System.out.println("CUANTOS PRODUCTOS VA A COMPRAR?");
                numProdsComp = teclado.nextInt();
                for (int i = 0; i < numProdsComp; i++) {
                    for (int j = 0; j < 1; j++) {
                        System.out.println("-------------------------------------");
                        System.out.println("ELIJA El PRODUCTO QUE DESEA COMPRAR");
                        compra = teclado.nextInt();
                        System.out.println("ELIJA LA CANTIDAD DE UNIDADES QUE DESEA");
                        cantcompra = teclado.nextInt();
                        System.out.println("-------------------------------------");
                        total=(prods[(compra-1)][j]*cantcompra)+total;
                    }
                }
                if(total>100)
                    descuento=(total*0.25);
                System.out.println("");
                System.out.println("+++++++++++++++++++++++++");
                System.out.println("---FACTURA ELECTRONICA---");
                System.out.println("SUMATORIA: $"+total);
                System.out.println("IVA: "+(total*0.12));
                System.out.println("DESCUENTO: "+descuento);
                System.out.println("TOTAL: "+(total+(total*0.12)-descuento));
                System.out.println("+++++++++++++++++++++++++");
            }
            
        }
    }
}