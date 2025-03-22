import java.util.Arrays;
class OrdinaArray extends Thread {
    private int[] array;

    public OrdinaArray(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Arrays.sort(array);
        System.out.print("Primi cinque elementi dell'array: ");
        for(int i = 0 ; i < 5 ; i++) {
            System.out.print((array[i])+" ");
        }
    }
}
