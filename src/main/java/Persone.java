/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Persone extends Thread{
    
    Semaforo pieno;
    Semaforo vuoto;
    Uomo u;
    Donna d;

    public Persone(Semaforo pieno, Semaforo vuoto, Uomo u, Donna d) {
        this.pieno = pieno;
        this.vuoto = vuoto;
        this.u = u;
        this.d = d;
    }
    
    
    public void run(){
    
        u.entra(); // metodo per gli uomini
        d.entra(); // metodo per le donne
    }
}
