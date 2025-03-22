import java.util.Arrays;
import java.util.Random;

public class ThreadArrayDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100); // Genera numeri casuali da 0 a 99
        }
        
        System.out.println("Array generato: " + Arrays.toString(array));
        
        OddCounter counterThread = new OddCounter(array);
        ArraySorter sorterThread = new ArraySorter(array);
        
        counterThread.start();
        try {
            counterThread.join(); // Attende che il conteggio finisca prima di ordinare
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        sorterThread.start();
    }
}

