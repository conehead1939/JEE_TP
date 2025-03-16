package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao;

    // Injection des dépendances via le constructeur avec @Qualifier
    @Autowired
    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    public double calcul() {
        double t = dao.getData();
        return t * 43 / 3;
    }
}
