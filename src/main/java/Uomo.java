
import static java.lang.Thread.sleep;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Uomo {
    Semaforo pieno;

    public Uomo(Semaforo pieno) {
        this.pieno = pieno;
    }

    
    public void entra(){
    
        pieno.P(); //entra l'uomo nel bagno
        System.out.println("L'uomo è entrato");
        sleep(2000);
        pieno.V(); //esce l'uomo dal bagno
        System.out.println("L'uomo è uscito");
    }
}
