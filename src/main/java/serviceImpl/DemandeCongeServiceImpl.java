package serviceImpl;
import daoImpl.DemandeCongeDaoImpl;
import model.DemandeConge;
import service.DemandeCongeService;

public class DemandeCongeServiceImpl implements DemandeCongeService {

   // @Autowired
    private DemandeCongeDaoImpl demandeCongeDaoImpl;

    public DemandeCongeServiceImpl(DemandeCongeDaoImpl demandeCongeDaoImpl) {
        this.demandeCongeDaoImpl = demandeCongeDaoImpl;
    }

    @Override
    public DemandeConge getDemandCongeS() {
        return demandeCongeDaoImpl.getDemandConge();
    }

}

