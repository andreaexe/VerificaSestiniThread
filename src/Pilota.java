/**classe del pilota dell' auto */
public class Pilota {
    
    String nome;
/**
 * costruttore del pilota
 * @param nome
 */
    public Pilota(String nome) {
        this.nome = nome;
    }
/**
 * 
 * @return stringa del pilota che ha completato il giro
 */
    public String stampaGiro(){

        return " completato da "+this.nome;
    }
/**
 * 
 * @return nome pilota
 */
    public String getNome() {
        return nome;
    }

    
}
