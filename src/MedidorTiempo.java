
public class MedidorTiempo {

    public void medirTiempo(int[] arreglo, String metodo) {

        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();
        long tiempoInicial;
        long tiempoFinal;
        long duracion;

        switch(metodo) {
            case "Burbuja":
                tiempoInicial = System.nanoTime();
                 metodosOrdenamiento.sortByBubbleMejorado(arreglo);
                tiempoFinal = System.nanoTime();
                break;
            case "Selección":
                tiempoInicial = System.nanoTime();
                metodosOrdenamiento.metodosSeleccion(arreglo);
                tiempoFinal = System.nanoTime();
                break;
            case "Inserción":
                tiempoInicial = System.nanoTime();
                metodosOrdenamiento.insertionSort(arreglo);
                tiempoFinal = System.nanoTime();
                break;
            default:
                return;
        }

        duracion = (tiempoFinal - tiempoInicial); // / 1000000; // Convertir de nanosegundos a milisegundos

        System.out.print("Con " + arreglo.length + " valores el tiempo es de " + duracion + " ms.");
        metodosOrdenamiento.imprime(arreglo);
        //System.out.println();
    }
}
