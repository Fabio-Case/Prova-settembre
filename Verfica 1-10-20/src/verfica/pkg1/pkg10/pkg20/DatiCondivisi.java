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
public class DatiCondivisi {
    private String orario;
    private String[][] orarioProf;
    private String[][] orarioClasse;
    private String classe;
    
    public DatiCondivisi(){
        orario = "ORA,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,6^,1^,2^,3^,4^,5^,tot ore/n"
                + "AGOSTONI G.,2BI,2CI LFS,1AI LFS,.,.,.,2CI,1AI,1BI LFS,2AI,.,.,-,-,-,-,-,-,1BI,2BI LFS,1CI LFS,.,2AI,.,1CI,2CI,1AI,.,2AI LFS,.,1CI,1BI,2BI,.,.,18/n"
                + "ALI' M.,3AL,4BS,.,4AL,5AS,.,5AL,5BL,.,4BL,3AS,.,-,-,-,-,-,-,4BS,3BS,3AL,4BL,.,.,.,.,4AL,3BS,4AS,.,3AS,5BL,5AL,5AS,4AS,20/n"
                + "ALIPRANDI S.,4AM LI5,4AM LI5,4BE,.,3EE,.,.,.,5AM LSM,5AM LSM,3EE LSM,3EE LSM,-,-,-,-,-,-,.,.,.,4BE LSM,4BE LSM,4AM,4AM,5AM LSM,.,4BE,5BM LSM,.,.,.,5BM LSM,5BM LSM,3EE,18/n"
                + "ANDREACCHI S.,5AI LI6,1CI LI4,4BI LI7,5BI LI7,.,.,3BI LI7,3BI LI7,5BI LI7,4CI LI7,4CI LI7,.,5AI LI6,5AI LI6,.,4BI LI7,4BI LI7,.,.,5BI LI7,5BI LI7,.,.,.,.,.,1CI LI4,3BI LI7,4CI LI7,.,-,-,-,-,-,18/n"
                + "ASTA L.,-,-,-,-,-,-,.,.,.,4AM,2AM,2AM,3EE,3EE,.,4AM,2AM,.,2AM,4AM,4AM,.,.,.,3EE,3EE,2AM,4AM,.,.,4AM,3EE,3EE,.,2AM,18/n"
                + "BALLABIO M.L.,5D,2B,1D,.,5AI,.,.,.,2B,5AI,2C,5D,.,.,1D,5D,2C,.,,,,,,,.,5AI,1D,2C,2B,.,-,-,-,-,-,15/n"
                + "BARDI P.,.,.,1BM LI4,5AI LI6,1CM LI4,.,-,-,-,-,-,-,1AM LI4,.,1CM LI4,.,.,.,5AI LI6,5AI LI6,1BM LI4,.,1AM LI4,.,1AC LI2,1AC LI2,1BC LI2,1BC LI2,.,.,5AI LI6,5AI LI6,4AI LI6,4AI LI6,3AI LI6,18";
        orarioProf = new String[8][37];
        orarioClasse = new String[7][37];
        classe = "";
        split();
    }
    public void addClasse(String classe){
        this.classe = classe;
    }
    
    private void split(){
        String[] v = orario.split("/n");
        for(int i=0;i < v.length; i++){
            orarioProf[i] = v[i].split(",");
        }
    }
    public String StampaOrario(){
        String s = "";
        for(int i = 0; i< orarioClasse.length; i++){
            for(int y = 0; y < orarioClasse.length; y++)
                s += orarioClasse[i][y];
        }
        return s;
    }
    
    public String[] read(int i){
        return orarioProf[i];
    }
    
    synchronized public void writeOrario(int i, int y, String nome){
        orarioClasse[i][y] = nome;
    }

    public String visClasse() {
        return classe;
    }
}
