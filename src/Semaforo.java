public class Semaforo {
    
    private int valore;

    

    public Semaforo(int valore) {
        this.valore = valore;
    }



    public synchronized void P(){

        while(valore==0){

            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        valore=0;
    }

    public synchronized void V(){

        valore=1;
        notify();
    }
}
