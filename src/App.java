public class App {
    public static void main(String[] args) throws Exception {

        Semaforo s=new Semaforo(1);

        Box box=new Box();

        Pilota p1=new Pilota("andrea");
        Pilota p2=new Pilota("giovanni");
        Pilota p3=new Pilota("paolo");
        Pilota p4=new Pilota("christian");


        Auto a1=new Auto(1,p1,"ferrari",s,box);
        Auto a2=new Auto(1,p2,"honda",s,box);
        Auto a3=new Auto(1,p3,"redbull",s,box);
        Auto a4=new Auto(1,p4,"mercedes",s,box);

        a1.start();
        a2.start();
        a3.start();
        a4.start();

        a1.join();
        a2.join();
        a3.join();
        a4.join();

        System.out.println("FINE GARA");
    }
}
