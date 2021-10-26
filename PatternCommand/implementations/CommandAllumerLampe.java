package implementations;

import interfaces.Commande;
import object.Lampe;

public class CommandAllumerLampe implements Commande {

    Lampe lampe;

    public CommandAllumerLampe(Lampe lmp){
        this.lampe = lmp;
    }

    @Override
    public void executer() {        
        lampe.marche();
    }
    
}
