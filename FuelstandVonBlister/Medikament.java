package Uebungen.Strukturprogramm.FuelstandVonBlister;

public class Medikament {
    private  String haltbarkeisdatum;
    private String name;
    private String wirksamkeit;
    long id;
    private Medikamentenform arzneiForm;// kommt von ANlage 2
    public Medikament(String haltbarkeisdatum, String name, String wirksamkeit, int i, Medikamentenform formInfos){
        this.haltbarkeisdatum=haltbarkeisdatum;
        this.name=name;
        this.wirksamkeit=wirksamkeit;
        this.id=id;
        this.arzneiForm=formInfos;
    };


    ///Getter und Setter

    public String getHaltbarkeisdatum() {
        return haltbarkeisdatum;
    }

    public void setHaltbarkeisdatum(String haltbarkeisdatum) {
        this.haltbarkeisdatum = haltbarkeisdatum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWirksamkeit() {
        return wirksamkeit;
    }

    public void setWirksamkeit(String wirksamkeit) {
        this.wirksamkeit = wirksamkeit;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
