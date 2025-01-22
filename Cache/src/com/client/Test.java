package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.model.Student;




public class Test {
	
	public static void main(String [] args)
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		
		Student s1=session.get(Student.class,1);
		//session.clear();
		Student s2=session.get(Student.class,1);
		//session.evict(s2);
		Student s3=session.get(Student.class,1);
		
		Session session2=HibernateUtil.getSessionFactory().openSession();
		Student s4 =session2.get(Student.class,1);
		
		System.out.println("CJC in karvenagar");
		
		
		
	}
}

		
		
			
		
		
		
	