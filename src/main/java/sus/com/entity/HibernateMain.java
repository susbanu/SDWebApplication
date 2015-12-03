package sus.com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	public static void main(String[] args) {
		
		Configuration configuration = null;
		StandardServiceRegistryBuilder builder = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		try{
			configuration = new Configuration().configure();
			builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());
			session = factory.openSession();
			transaction = session.beginTransaction();
			transaction.begin();

			// Do some work here
			
			transaction.commit();
		}catch(Exception e){
			if(transaction != null){
				transaction.rollback();
			}
			e.printStackTrace();
		}finally{
			if(session != null){
				session.close();
			}
		}
	}
}
