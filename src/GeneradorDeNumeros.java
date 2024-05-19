import java.util.Arrays;
import java.util.Random;

public class GeneradorDeNumeros {
        public  int[] GeneradorRandom(int [] arregloOriginal, int tamano) {
        Random random = new Random();
        int [] arregloNew = Arrays.copyOf(arregloOriginal, tamano);
        for (int i = arregloOriginal.length; i < tamano; i++) {
            arregloNew[i] = random.nextInt(100); // Rango del 0 al 100 
        }
        return arregloNew;
    }

}
