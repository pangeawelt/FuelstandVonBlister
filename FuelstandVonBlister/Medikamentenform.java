package Uebungen.Strukturprogramm.FuelstandVonBlister;

public abstract  class Medikamentenform {
    private double gewichIng;
    private double laengenInMm;
    private double breiteInMm;
    long id;

    public Medikamentenform( double gewichIng,double laengenInMm,double breiteInMm,long id){
        this.gewichIng=gewichIng;
        this.laengenInMm=laengenInMm;
        this.breiteInMm=breiteInMm;
        this.id=id;
    }

    public abstract String  wirkstoffreisetzung();


    ///Getter und Setter
    public double getGewichIng() {
        return gewichIng;
    }

    public void setGewichIng(double gewichIng) {
        this.gewichIng = gewichIng;
    }

    public double getLaengenInMm() {
        return laengenInMm;
    }

    public void setLaengenInMm(double laengenInMm) {
        this.laengenInMm = laengenInMm;
    }

    public double getBreiteInMm() {
        return breiteInMm;
    }

    public void setBreiteInMm(double breiteInMm) {
        this.breiteInMm = breiteInMm;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
