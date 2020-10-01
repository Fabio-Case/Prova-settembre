/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verfica.pkg1.pkg10.pkg20;

/**
 *
 * @author fabio
 */
public class MyThread extends Thread{
    DatiCondivisi dati;
    int codProf;
    String[] prof;
    String nome;
    
    
    public MyThread(DatiCondivisi dati, int codProf){
        this.codProf = codProf;
        this.dati = dati;
    }
    
    public void run(){
        prof = dati.read(codProf);
        nome = prof[0];
        for(int i=0; i<prof.length; i++){
            if(prof[i].indexOf(dati.visClasse()) != -1)
                dati.writeOrario(1, i, nome);
        }
    }
}
