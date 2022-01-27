package model;

public class Periode {
    String dataDebut;
    int nbrJours ;

        public Periode(String dataDebut, int nbrJours) {

        this.dataDebut = dataDebut;
        this.nbrJours = nbrJours;
    }


    @Override
    public String toString() {
        return "model.Periode [dataDebut=" + dataDebut + ", nbrJours=" + nbrJours + "]";
    }

    public String getDataDebut() {
        return dataDebut;
    }
    public void setDataDebut(String dataDebut) {
        this.dataDebut = dataDebut;
    }    public int getNbrJours() {
        return nbrJours;
    }
    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }


}
