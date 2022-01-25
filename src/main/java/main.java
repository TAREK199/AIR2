
import model.DemandeConge;
import model.DemandeCongeSansModificateurs;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {


    public static void main(String []args){



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");
        DemandeConge demandeConge2 = (DemandeConge) context.getBean("demandeConge");

        DemandeCongeSansModificateurs demandeCongeSansModificateurs = (DemandeCongeSansModificateurs) context.getBean("demandeCongeSansModificateurs");


//        System.out.println(demandeConge);
//        System.out.println(demandeConge2);

        System.out.println(demandeCongeSansModificateurs);



    }


}
