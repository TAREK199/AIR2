package service;
import model.Collaborateur;
import model.DemandeConge;
import model.Periode;
import org.springframework.stereotype.Service;


@Service
public class DemandeCongeServiceMock {

    public DemandeConge getDemandeConge(int ddcId) {
        Collaborateur collaborateur = new Collaborateur("REBAI", "Tarek");
        Periode periode = new Periode((int) (Math.random() * 30 + 1) + "/12/2022", (int) (Math.random() * 5 + 1));
        DemandeConge demandeConge = new DemandeConge(collaborateur, periode, ddcId * 17);

        return demandeConge;
    }
}
