package Uebungen.Strukturprogramm.FuelstandVonBlister;

public class Tablettenform extends Medikamentenform{

    private double pulverKoemunInum;

    public Tablettenform(double gewichIng,double laengenInMm,double breiteInMm,long id,double pulverKoemunInum){
        super(gewichIng,laengenInMm,breiteInMm,id);
        this.pulverKoemunInum=pulverKoemunInum;
    }
    @Override
    public String wirkstoffreisetzung(){
        String inhalt="Freisetzung von Wirkstoffe durch Zersetsung....in Mikrometer"+ this.pulverKoemunInum;
        return inhalt;
    }



    ///Getter und Setter
    public double getPulverKoemunInum() {
        return pulverKoemunInum;
    }

    public void setPulverKoemunInum(double pulverKoemunInum) {
        this.pulverKoemunInum = pulverKoemunInum;
    }
}
