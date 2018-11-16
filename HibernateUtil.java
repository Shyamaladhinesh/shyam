package com;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class HibernateUtil 
	{
		public static void main(String arg[])
		{
			try
			{
				Configuration config=new Configuration();
				
				config.configure("hibernate.cfg.xml");
                 Product product1=new Product();
				
				product1.setProductId("7668");
				product1.setProductName("micromax");
				product1.setPrice(11000);
				
				SessionFactory sessionFactory=config.buildSessionFactory();
				
				Session session=sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
		    	session.save(product1);
				
				transaction.commit();
				
				session.close();
				sessionFactory.close();
				
				System.out.println("Object is Saved");
				
			}
			catch(Exception e)
			{
				System.out.println("Exception Occured:"+e);
			}
			
		}
	}

