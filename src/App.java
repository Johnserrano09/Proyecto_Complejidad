
public class App {
    public static void main(String[] args) throws Exception {

        // Intancia de generador de nuemeros Random 
        GeneradorDeNumeros generador = new GeneradorDeNumeros();
        // Intancia de medidor de tiempo
        MedidorTiempo medir = new MedidorTiempo();

        // Tamaños del arreglo
        int [] tamanos = {10, 20, 100, 1000 ,5000, 10000, 30000} ;
        //instancio de un arreglo de tamano cero
        int [] arregloOriginal =  new int[0];
        ///
       
            
       // Burbuja Mejorado
       System.out.println("Método Burbuja con Ajustes");
       for(int tamano: tamanos){
           arregloOriginal = generador.GeneradorRandom(arregloOriginal, tamano);

           int [] arregloBurbuja = arregloOriginal.clone();
           medir.medirTiempo(arregloBurbuja,"Burbuja");
       }
       // Seleccion
       System.out.println("Método Selección");
        for(int tamano: tamanos){
            arregloOriginal = generador.GeneradorRandom(arregloOriginal, tamano);

            int [] arregloSeleccion = arregloOriginal.clone();
            medir.medirTiempo(arregloSeleccion,"Selección");
        }
        // Inserccion
        System.out.println("Método Inserción");
        for(int tamano: tamanos){
            arregloOriginal = generador.GeneradorRandom(arregloOriginal, tamano);

            int [] arregloInserccion = arregloOriginal.clone();
            medir.medirTiempo(arregloInserccion,"Inserción");
        }
        
  
        
        

        

    }


}
