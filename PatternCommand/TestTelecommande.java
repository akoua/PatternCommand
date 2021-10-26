import implementations.CommandAllumerLampe;
import object.Lampe;

public class TestTelecommande {

    public static void main(String[] args){
        //Invocateur
        TelecommandeSimple tls = new TelecommandeSimple();
        //Récepteur
        Lampe lampe = new Lampe();
        //La commande en elle même
        CommandAllumerLampe cmdAllumerLampe = new CommandAllumerLampe(lampe);

        //Enregistrement de la commande
        tls.setCommande(cmdAllumerLampe);
        //Demande d'éxécution de la commande par notre invocateur au récep
        tls.boutonPresse();

    }
    
}
