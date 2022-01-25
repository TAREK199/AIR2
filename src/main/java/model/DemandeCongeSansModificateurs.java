package model;

public class DemandeCongeSansModificateurs {


    private Collaborateur collaborateur;
    private Periode periode;

    public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
        this.collaborateur = collaborateur;
        this.periode = periode;
    }

    @Override
    public String toString() {
        return "DemandeCongeSansModificateurs{" +
                "collaborateur=" + collaborateur +
                ", periode=" + periode +
                '}';
    }

}
