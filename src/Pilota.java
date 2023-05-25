public class Pilota {
    
    String nome;

    public Pilota(String nome) {
        this.nome = nome;
    }

    public String stampaGiro(){

        return " completato da "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    
}
