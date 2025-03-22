class OrdinaArray extends Thread {
    private final int[] array;

    public OrdinaArray(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        Arrays.sort(array);
        System.out.println("Primi 5 numeri ordinati: " + Arrays.toString(Arrays.copyOfRange(array, 0, 5)));
    }
}