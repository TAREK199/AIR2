package controller;


import org.springframework.stereotype.Controller;
import service.DemandeCongeServiceMock;


@Controller
public class DetailDdcController {
    private DemandeCongeServiceMock demandeCongeService = new DemandeCongeServiceMock();

}
