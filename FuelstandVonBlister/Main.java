package Uebungen.Strukturprogramm.FuelstandVonBlister;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Tablettenform einenueTablette= new Tablettenform(2,8,3,1508,200);

        ArrayList<Medikament> produzierteMedikamente=new ArrayList<Medikament>();


        for (int i =0;i<60;i++){
            produzierteMedikamente.add(new Medikament("01.11.2022","Eucolaptum","Kopfschmerzen",1299,einenueTablette));
        }

        Blister ersteblister=new Blister(2,6,2022,produzierteMedikamente);

        ersteblister.entnehmen(0,2);
        //System.out.println(ersteblister.entnehmen(1,0));

        ersteblister.druckBestandInfo();


    }
}
