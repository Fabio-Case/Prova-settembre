/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verfica.pkg1.pkg10.pkg20;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabio
 */
public class Verfica11020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        DatiCondivisi dati = new DatiCondivisi();
        
        dati.addClasse("3EE");
        
        MyThread[] th = new MyThread[7];
        for(int i =0; i< th.length; i++)
            th[i] = new MyThread(dati, i+1);
        for(int i=0; i<th.length; i++)
            th[i].start();
        for(int i=0; i<th.length; i++)
            try {
                th[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Verfica11020.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        System.out.println(dati.visClasse());
    }
    
}
