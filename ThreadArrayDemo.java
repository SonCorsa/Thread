import java.util.Arrays;
import java.util.Random;

public class ThreadArrayDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100)+1; // Genera numeri casuali da 1 a 100
        }
        
        System.out.println("Array generato: " + Arrays.toString(array));
        
        ConteggioDispari conteggioThread = new ConteggioDispari(array);
        OrdinaArray ordinaThread = new OrdinaArray(array);
        
        conteggioThread.start();
        try {
            conteggioThread.join(); // Attende che il conteggio finisca prima di ordinare
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ordinaThread.start();
    }
}

