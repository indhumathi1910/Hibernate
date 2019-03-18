
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class HibernateDemo 
{
	public static void main(String arg[])
	{
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=config.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		com.Product product=new com.Product();
		
		product.setProductId(1001);
		product.setProductName("Samsung J7");
		product.setPrice(7000);
		
		session.save(product);
		
		transaction.commit();
		
		session.close();
		
		System.out.println("Object Saved in Database");
		
	}

}
