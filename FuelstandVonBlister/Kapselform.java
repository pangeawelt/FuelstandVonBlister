package Uebungen.Strukturprogramm.FuelstandVonBlister;

public class Kapselform extends Medikamentenform{
    private double gelMengelnIng;
    public Kapselform(double gewichIng,double laengenInMm,double breiteInMm,long id,double gelMengelnIng){
        super(gewichIng,laengenInMm,breiteInMm,id);
        this.gelMengelnIng=gelMengelnIng;
    }

    @Override //
    public String wirkstoffreisetzung() {
        return null;
    }


    ///Getter und Setter

    public double getGelMengelnIng() {
        return gelMengelnIng;
    }

    public void setGelMengelnIng(double gelMengelnIng) {
        this.gelMengelnIng = gelMengelnIng;
    }
}
