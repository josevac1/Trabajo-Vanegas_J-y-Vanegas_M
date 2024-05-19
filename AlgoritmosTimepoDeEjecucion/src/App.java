import java.util.Random;


public class App {
    
    public static void main(String[] args) throws Exception {
        MetodosDeOrdenamiemto metodo = new MetodosDeOrdenamiemto();
        Random random = new Random();
        int[] sizes = {10,20, 50, 100, 1000, 5000, 10000,30000};

        for (int s : sizes) {
            int[] lista = new int[s];
            for (int i = 0; i < s; i++) {
                lista[i] = random.nextInt();
            }

            System.out.println("Tamaño del arreglo: " + s);

            int[] array1 = lista.clone();
            int[] array2 = lista.clone();
            int[] array3 = lista.clone();

            
            long start = System.currentTimeMillis();
            metodo.burbujaMejorado(array1);
            long end = System.currentTimeMillis();
            System.out.println("Burbuja con ajuste: " + (end - start) + " s");

            start = System.currentTimeMillis();
            metodo.seleccion(array2);

            end = System.currentTimeMillis();
            System.out.println("Selección: " + (end - start) + " s");

            start = System.currentTimeMillis();
            metodo.insercion(array3);
            end = System.currentTimeMillis();
            System.out.println("Inserción: " + (end - start) + " s");
            
        }
    }
}
