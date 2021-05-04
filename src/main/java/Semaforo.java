
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Semaforo {
    
    int valore;
    
    public Semaforo(int v){
    
        this.valore = v;
    }
    
    synchronized public void P(){
    
        while(valore == 0){
        
            try {wait();
               sleep(1000);     } 
           
            catch (InterruptedException ex) {
                Logger.getLogger(Semaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        valore--;
    }
    
    synchronized public void V(){
    
        valore ++;
        notify();
    }
}
