package Uebungen.Strukturprogramm.FuelstandVonBlister;

import java.util.ArrayList;

public class Blister {
    private int anzahlMulden;
    private int anzahlReihen;
    private int anzahlSpalten;
    private int anzahlMedikamente;
    boolean [][] bestandinfo;
    private ArrayList<Medikament> medikamente;
    long id;
    public Blister(int anzahlReihen,int anzahlSpalten, long id,ArrayList< Medikament> produzierteMedikamente){
        this.anzahlReihen=anzahlReihen;
        this.anzahlSpalten=anzahlSpalten;
        this.id=id;

        anzahlMulden=anzahlReihen*anzahlSpalten;
        medikamente=new ArrayList<Medikament>();
        for (int i=0; i<anzahlMulden;i++){
            this.medikamente.add(produzierteMedikamente.get(i));

        }
        anzahlMedikamente=medikamente.size();
        bestandinfo=new boolean[anzahlReihen][anzahlSpalten];
        if (anzahlMulden==anzahlMedikamente){
            for (int i=0; i<anzahlReihen;i++){
                for (int j=0; j<anzahlSpalten;j++){
                    bestandinfo[i][j]=true;                }
            }
        }
        else anzahlMedikamente=-1;

    }
    //////////////////////////////
    public boolean entnehmen(int indexReihe, int indexSpalte){
        boolean ruckgabewert=false;

        if(bestandinfo[indexReihe][indexSpalte]==true){
            bestandinfo[indexReihe][indexSpalte]=false;
            medikamente.remove(medikamente.size()-1);
                    ruckgabewert=true;
        }
         return ruckgabewert;}


    //////////DruckBestandInfo Method////////////
    public void druckBestandInfo() {
        for (int i = 0; i < anzahlReihen; i++) {
            for (int j = 0; j < anzahlSpalten; j++) {
                if (bestandinfo[i][j] == true) {
                    System.out.print(" O ");
                } else {
                    System.out.print(" X ");
                }
              //  bestandinfo[i][j] = true;
            }
            System.out.println(" ");
        }

    }

    // Getter und Setter
    public int getAnzahlMulden() {
        return anzahlMulden;
    }

    public void setAnzahlMulden(int anzahlMulden) {
        this.anzahlMulden = anzahlMulden;
    }

    public int getAnzahlReihen() {
        return anzahlReihen;
    }

    public void setAnzahlReihen(int anzahlReihen) {
        this.anzahlReihen = anzahlReihen;
    }

    public int getAnzahlSpalten() {
        return anzahlSpalten;
    }

    public void setAnzahlSpalten(int anzahlSpalten) {
        this.anzahlSpalten = anzahlSpalten;
    }

    public int getAnzahlMedikamente() {
        return anzahlMedikamente;
    }

    public void setAnzahlMedikamente(int anzahlMedikamente) {
        this.anzahlMedikamente = anzahlMedikamente;
    }

    public boolean[][] getBestandinfo() {
        return bestandinfo;
    }

    public void setBestandinfo(boolean[][] bestandinfo) {
        this.bestandinfo = bestandinfo;
    }

    public ArrayList<Medikament> getMedikamente() {
        return medikamente;
    }

    public void setMedikamente(ArrayList<Medikament> medikamente) {
        this.medikamente = medikamente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
