public class Box {

    private int tempoBox;

    public Box() {
    }
    
    public String pitStop(Pilota pilota){

         this.tempoBox=(int)(Math.random()*5)+1;
        
         try {

            Thread.sleep(tempoBox*1000);
            System.out.println("--------------------"+pilota.getNome()+" in attesa ai box -------------------------");

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        return " cambio gomme in corso";
    }
}
