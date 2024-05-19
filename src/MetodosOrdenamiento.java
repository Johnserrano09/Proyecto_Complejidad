import java.util.Arrays;

public class MetodosOrdenamiento {

    public int[] sortByBubbleMejorado(int[] numeros){
        //Copia del arreglo original
        int[] numerosCopia = Arrays.copyOf(numeros, numeros.length);

        boolean cambio = false;

        ///Obtener el tamano del arreglo
        int tamano = numerosCopia.length;
        /// Bucle externo que va a recorrer todo el arreglo
        for(int i = 0; i < tamano ; i++){
            //Bucle for interno que comparta el elemento actual con los siguintes
            for(int j = i+1; j < tamano ; j++){
                    if(numerosCopia[i] > numerosCopia[j]){

                        int temporal = numerosCopia[i];
                        numerosCopia[i] = numerosCopia[j];
                        numerosCopia[j] = temporal;
                        cambio = true;
                        

                    }
                }
            if (!cambio) {
                break;
            }
        }
        return numerosCopia;
    
    }

    ///Metodo seleccion
    public int[] metodosSeleccion(int[] numeros) {
        int [] numeroC2 = Arrays.copyOf(numeros, numeros.length);
        int tamano = numeroC2.length;
        //System.out.println(tamano);
        
        for(int i = 0; i < tamano; i++){
            //TENEMOS QUE ENOCTRAR EN MENOR
            int index_menor = i;

            for(int j = i + 1; j< tamano; j++){
                if(numeroC2[j] < numeroC2[index_menor]){
                    index_menor = j;
                }
            }
            //Intercambiar el menor
            int aux = numeroC2[index_menor];
            numeroC2[index_menor] = numeroC2[i];
            numeroC2[i] = aux;
            
        }
        return numeroC2;
    }


 // Metodo Inseccion
 public int[] insertionSort(int[] numeros){
    int [] numerosC3 = Arrays.copyOf(numeros, numeros.length);
    int tamano = numerosC3.length;
    for(int i = 1; i < tamano; i++){
        //El elemento a comparar
        int elementoActual = numerosC3[i];
        int j = i -1;
        // Si la variable forma = true, se ordena de manera ascendente
        while (j >= 0 && numerosC3[j] > elementoActual) {
            numerosC3[j+1] = numerosC3[j];
            j = j - 1;
        }
        numerosC3[j + 1] = elementoActual;
        //imprime(numerosC3);
    }
    return numerosC3;
}
    // metodo que imprimw
    public void imprime(int[] arreglo) {
        System.out.print("[");
        // Imprime solo los primeros 30 números o todos si el arreglo es más pequeño
        int limite = Math.min(arreglo.length, 30);
        for (int i = 0; i < limite; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arreglo[i]);
        }
        // Si el arreglo tiene más de 30 elementos, imprime "..."
        if (arreglo.length > 30) {
            System.out.print(", ...");
        }
        System.out.print("]\n");
    }


}
