
package model;

public class DemandeConge {

    private Collaborateur collaborateur;
    private Periode periode ;

//    public DemandeConge(Collaborateur collaborateur,Periode periode) {
//        this.collaborateur = collaborateur;
//        this.periode = periode;
//    }

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
