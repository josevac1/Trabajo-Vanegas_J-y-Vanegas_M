import java.util.Arrays;

public class MetodosDeOrdenamiemto {

    public  int[] burbujaMejorado(int[] arregloOriginal){
        int[] arreglo= Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        boolean cambio;
        do{
            cambio=false;
            for(int i=0; i<arreglo.length-1;i++){
                if(arreglo[i]>arreglo[i+1]){
                    int temp=arreglo[i];
                    arreglo[i]=arreglo[i+1];
                    cambio=true;

                }
            }
        }while(cambio);
        return arreglo;

    }

    public int[] seleccion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;

        }
        
        return arreglo;
        
    }


    public int[] insercion(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i > 0 && arreglo[i] > key) {
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;

        }
       
        return arreglo;
    }

    public void imprimirVec(int[]arreglo){
        for(int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
            
        }
        System.out.println();
    }


}
