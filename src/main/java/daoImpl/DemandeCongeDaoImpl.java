package daoImpl;

import dao.DemandeCongeDao;
import model.DemandeConge;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemandeCongeDaoImpl implements DemandeCongeDao{

    @Override
    public DemandeConge getDemandConge() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");
        return demandeConge;
    }

}
