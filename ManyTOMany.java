package com.mapping.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.springcore.hibernate.Student;

public class ManyTOMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure("hibernate.cfg3.xml");
		SessionFactory fac=con.buildSessionFactory();
		
		College1 c=new College1();
		//c.setId(1235);
		c.setName("DKTE");
		c.setAddress("Solapur");
		
		
		
		Student1 s=new Student1();
		//s.setId(20);
        s.setName("s");
        s.setYear("ty");
        Student1 s1=new Student1();
        //s1.setId(45);
        s1.setName("s");
        s1.setYear("ty");
    	
        
       
        List <Student1>stud=new ArrayList<Student1>();
        List<College1>cllg=new ArrayList<College1>();
        stud.add(s);
        stud.add(s1);
        cllg.add(c);
        //cllg.add(c1);
        
        
       // s.setCollege(cllg);
        c.setStudent(stud);
        
        Session session=fac.openSession() ;
        Transaction t=session.beginTransaction();
        session.save(s);
        session.save(c);
        session.save(s1);
    //    session.save(c1);
        t.commit();
        fac.close();
        session.close();
		
	}

}
