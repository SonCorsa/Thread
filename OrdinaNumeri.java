class ConteggioDispari extends Thread {
    private int[] array;

    public ConteggioDispari(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                count++;
            }
        }
        System.out.println("Numero di elementi dispari: " + count);
    }
}







