
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
public class Donna {
    Semaforo vuoto;

    public Donna(Semaforo vuoto) {
        this.vuoto = vuoto;
    }
    
    public void entra(){
    
        vuoto.P(); // entra una donna nel bagno
        System.out.println("La donna è entrata");
        sleep(2000);
        vuoto.V(); // esce la donna dal bagno
        System.out.println("La donna è uscita");
    }
}
