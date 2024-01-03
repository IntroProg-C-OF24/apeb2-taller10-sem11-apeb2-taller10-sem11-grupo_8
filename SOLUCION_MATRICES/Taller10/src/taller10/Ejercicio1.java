package taller10;
public class Ejercicio1 {
    public static void main(String[] args) {
        String[] nomEst = {"Juan","Max","Pedro","Diego"} ;
        String nombNotMay=null, nombNotMen=null;
        double nmayor=0, nmenor=10, promcurs=0, sum=0;
        int limEst=nomEst.length, limNotas = 3;
        double arrProm[]= new double [limEst];
        double notas[][] = new double [limEst][limNotas];
        for (int i = 0; i < limEst; i++) 
            for (int j = 0; j < limNotas; j++) {
                notas[i][j]=(double)(Math.random()*(9-0+1)+0);
            }
        for (int i = 0; i < limEst; i++) {
            arrProm[i] = (notas[i][0]*0.35)+(notas[i][1]*0.35)+(notas[i][2]*0.35);
        }
        System.out.println("NOMBRES / ACD   / APE   / AA   /Promedios");
        for (int i = 0; i < limEst; i++) {
            System.out.print(nomEst[i]+"\t");
            for (int j = 0; j < limNotas; j++) 
                System.out.printf("/ %.2f \t",notas[i][j]);
                
            System.out.printf("/ %.2f \t",arrProm[i]);
            System.out.println("");
        }
        for (int i = 0; i < limEst; i++) {
             sum += arrProm[i];
        }
        promcurs=sum/limEst;
        System.out.printf("%s %.2f", "El promedio del curso es", promcurs);
        System.out.println("");
        System.out.println("Notas sobre el promedio");
        for (int i = 0; i < limEst; i   ++) {
            if (arrProm[i]>promcurs)
                System.out.printf("%s %.2f\n",nomEst[i],arrProm[i]);
        }
        System.out.println("");
        System.out.println("Notas bajo el promedio");
        for (int i = 0; i < limEst; i++) {
            if (arrProm[i]<promcurs)
                System.out.printf("%s %.2f\n",nomEst[i],arrProm[i]);
        }
        for (int i = 0; i < limEst; i++) {
            if(arrProm[i]>nmayor){
                nmayor=arrProm[i];
                nombNotMay = nomEst[i];
            }
            if(arrProm[i]<nmenor){
                nmenor=arrProm[i];
                nombNotMen = nomEst[i];
            }
        }
        System.out.printf("%s %s%s %.2f ","El mejor estudiante fue: ",nombNotMay," con un promedio de",nmayor);
        System.out.printf("\n%s %s%s %.2f ","El peor estudiante fue: ",nombNotMen," con un promedio de",nmenor);
    }
}