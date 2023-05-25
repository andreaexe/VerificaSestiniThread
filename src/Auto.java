public class Auto extends Thread{
    
    private int id;
    private Pilota pilota;
    private String scuderia;
    private Semaforo s;
    private Box box;



    public Auto(int id, Pilota pilota, String scuderia, Semaforo s, Box box) {
        this.id = id;
        this.pilota = pilota;
        this.scuderia = scuderia;
        this.s = s;
        this.box = box;
    }



    public void run(){

        int tempoGiro=(int)(Math.random()*4)+1;
       

        for(int i=1;i<=10;i++){
            
            try {
                Thread.sleep(1000*tempoGiro);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("GIRO "+i+pilota.stampaGiro());

            if(i==3||i==6||i==9){

               

                //zona critica
                s.P();

                System.out.println(pilota.getNome()+box.pitStop(pilota));


                s.V();
                //
            }
        }
   
    }


    public Pilota getPilota() {
        return pilota;
    }



    public String getScuderia() {
        return scuderia;
    }



    public Semaforo getS() {
        return s;
    }



    public Box getBox() {
        return box;
    }

    
}
