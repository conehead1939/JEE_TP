package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        // Scanne les packages "ext", "metier", "dao"
        ApplicationContext context = new AnnotationConfigApplicationContext("ext", "metier", "dao");

        // Obtenir le bean "metier"
        IMetier metier = context.getBean(IMetier.class);

        // Afficher le résultat
        System.out.println("RES=" + metier.calcul());
    }
}
