
package model;

public class DemandeConge {

    private Collaborateur collaborateur;
    private Periode periode ;
    private int numero ;

    public DemandeConge(Collaborateur collaborateur,Periode periode,int numero) {
        this.collaborateur = collaborateur;
        this.periode = periode;
        this.numero = numero ;
    }

    @Override
    public String toString() {
        return "model.DemandeConge [collaborateur=" + collaborateur + ", periode=" + periode + "]";
    }

    public void setCollaborateur(Collaborateur collaborateur) {
        this.collaborateur = collaborateur;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }
}
