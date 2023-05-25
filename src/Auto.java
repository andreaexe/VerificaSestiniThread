//**classe auto che gestisce i run di ogni thread macchina */
public class Auto extends Thread{
    /**id che identifica l' auto */
    private int id;
    /**pilota che guida l'auto */
    private Pilota pilota;
    /**scuderia dell' auto */
    private String scuderia;
    /**semaforo per mutua esclusione */
    private Semaforo s;
    /**box che cambia le gomme */
    private Box box;


/**
 * costruttore dell' auto
 * @param id
 * @param pilota
 * @param scuderia
 * @param s
 * @param box
 */
    public Auto(int id, Pilota pilota, String scuderia, Semaforo s, Box box) {
        this.id = id;
        this.pilota = pilota;
        this.scuderia = scuderia;
        this.s = s;
        this.box = box;
    }


/**metodo run chiamato tramite il main che fa correre ogni auto */
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

/**
 * 
 * @return pilota dell auto
 */
    public Pilota getPilota() {
        return pilota;
    }


/**
 * 
 * @return scuderia dell auto
 */
    public String getScuderia() {
        return scuderia;
    }


/**
 * 
 * @return semaforo 
 */
    public Semaforo getS() {
        return s;
    }


/**box */
    public Box getBox() {
        return box;
    }

    
}
