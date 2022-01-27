package service;
import model.Collaborateur;
import model.DemandeConge;
import model.Periode;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class DemandeCongeServiceMock2 {


    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public DemandeConge getDemandeCongeFromContext(int ddcId) {
        Collaborateur collaborateur = (Collaborateur)applicationContext.getBean("c");
        Periode periode = (Periode)applicationContext.getBean("p");
        DemandeConge demandeConge = new DemandeConge(collaborateur, periode, ddcId * 17);

        return demandeConge;

    }
}
