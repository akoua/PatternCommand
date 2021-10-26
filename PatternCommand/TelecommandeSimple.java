import interfaces.Commande;

public class TelecommandeSimple {

    private Commande emplacement;

    public void setCommande(Commande cmd) {
        this.emplacement = cmd;
    }

    public void boutonPresse(){
        emplacement.executer();
    }
    
}
