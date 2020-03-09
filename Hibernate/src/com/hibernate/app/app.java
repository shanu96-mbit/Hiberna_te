	package com.hibernate.app;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.domain.Student;

public class app {
	public static void main(String[] args) {
		Session session= HibernateConnection.getSessionFactory().getCurrentSession();
		Transaction trn = session.beginTransaction();
		
		Criteria crt = session.createCriteria(Student.class);
		
		Student student = new Student();
		student.setFirstName("Prabath");
		student.setLastName("madusanka");
		
		trn.commit();
		session.close();
			
		}
	}

	
	
	
