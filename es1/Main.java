package Thread;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Dovresti passare il numero intero");
            return;
        }
        int n = Integer.parseInt(args[0]);
        Thread TP = new PariDispari(n+1, true);
        Thread TD = new PariDispari(n+1, false);
        System.out.println("->Contate fino a "+n);
        TP.start();
        TD.start();
        try{
            TP.join();
            TD.join();
        }catch(InterruptedException e){
            System.out.println("<-Fine conteggio!");
        }
    }
}
