package com.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	 public static void main( String[] args )
	    {
			Configuration con=new  Configuration().configure("hibernate.cfg2.xml");
		    SessionFactory fac=con.buildSessionFactory();		    
		    
		    College c=new College();
			c.setId(1235);
			c.setName("DKTE");
			c.setAddress("Solapur");		
			
			Dept d=new Dept();
			//d.setDeptId(101);
			d.setDeptId(102);
			d.setName("CSE");
			d.setCollege(c);
			c.setDept(d);
			//.setDept(d);
			
		    Session session=fac.openSession();
		    Transaction t=session.beginTransaction(); session.save(c);
		    session.save(d);
		   
		    t.commit();
		    session.close();
	    }
	
}
