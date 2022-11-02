package Uebungen.Strukturprogramm.FuelstandVonBlister;

import java.util.ArrayList;

public class Blisterr  {
    private int anzahlMulde;// minus heist private
    public int anzahlspalten; // dh plus= public
    private int anzahlReihen;
    private int anzahlMedikanmente;
    private boolean[][] bestandinfo;
    private long id;
    private ArrayList<Medikament> medikamente;

    //private Medikament prodzuiertemedikamente; Ohne Klammer wäre;
    public Blisterr(int anzahlReihen, int anzahlspalten, long id,
                    ArrayList<Medikament> produzierteMedikamente) {

        anzahlMulde = anzahlReihen * anzahlspalten;
        medikamente = new ArrayList<Medikament>();
        for (int i = 0; i < anzahlMulde; i++) { //12
            this.medikamente.add(produzierteMedikamente.get(i));
        }

        bestandinfo = new boolean[anzahlReihen][anzahlspalten];
        if (anzahlMulde == anzahlMedikanmente) {
            for (int i = 0; i < anzahlReihen; i++) {
                for (int j = 0; j < anzahlspalten; j++) {
                    bestandinfo[i][j] = true;
                }
            }
        } else
            anzahlMedikanmente = 0; //nochmal üperprueft
        anzahlMedikanmente = medikamente.size();

    }

    public boolean entnehmen(int indexReihe, int indexspalte) {
        boolean ruckgabe = false;

        if (bestandinfo[anzahlReihen][anzahlspalten] == true) {
            medikamente.remove(medikamente.size() - 1);
            ruckgabe = true;

        }
        return ruckgabe;
    }

    public void druckbestandinfo() {
        for (int i = 0; i < anzahlReihen; i++) {
            for (int j = 0; j < anzahlspalten; j++) {
                if (bestandinfo[i][j] = true) {
                    System.out.println(" O ");
                } else
                    System.out.println(" X ");
            }
        }
    }
}





