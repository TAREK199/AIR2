

import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemandeCongeService;

public class main {

    public static void main(String []args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        DemandeCongeService demandeCongeService =(DemandeCongeService) context.getBean("DemandeCongeServiceImpl");
        System.out.println(demandeCongeService.getDemandCongeS());
    }
}
