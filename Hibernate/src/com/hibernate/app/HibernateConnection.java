package com.hibernate.app;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConnection {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory== null) {
			try {
				//create registry
				registry = new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();
				//create MetadataSource 
				MetadataSources source= new MetadataSources(registry);
				//create Metadata
				Metadata metadata = source.getMetadataBuilder().build();
				//Create SessionFactory
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				
				
			} catch (Exception e) {
				e.printStackTrace();
				if(registry !=null){
					StandardServiceRegistryBuilder.destroy(registry);
				}
			}
			
			
		}
		
		return sessionFactory;
		
	}
	public static void shutdown(){
		if(registry!= null){
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
