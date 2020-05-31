package insertdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Appli {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Product p=new Product(); 

        p.setProductid(101);
        p.setProname("dell");
        p.setPrice(2000);
        AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");
		//AnnotationConfiguration cfg=new AnnotationConfiguration();
       // cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        

        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        session.close();
        factory.close();
    }


	}


