
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo (1);
        Semaforo  vuoto = new Semaforo (1);
        
        Uomo Eduardo = new Uomo (pieno);
        Uomo Stefano = new Uomo (pieno);
        Uomo Riccardo = new Uomo (pieno);
        Uomo Tommaso = new Uomo (pieno);
        Donna Chiara = new Donna (vuoto);
        Donna Anna = new Donna (vuoto);
        Donna Sara = new Donna (vuoto);
        Donna Maria = new Donna (vuoto);
        
        Persone b1 = new Persone (pieno, vuoto, Eduardo, Anna);
        Persone b2 = new Persone (pieno, vuoto, Riccardo, Maria);
        Persone b3 = new Persone (pieno, vuoto, Stefano, Sara);
        Persone b4 = new Persone (pieno, vuoto, Tommaso, Chiara);
        
        
        
        b1.start();
        b2.start();
        b3.start();
        b4.start();
    }
    
}
