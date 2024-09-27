package com.springcore.hibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..." );
        Configuration con=new  Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory fac=con.buildSessionFactory();
        
        
        Student s=new Student();
        s.setName("s");
        s.setYear("ty");
//        Scanner sc=new Scanner(System.in);
//        for(int i=1;i<=2;i++) {
//        	int a=sc.nextInt();
//        	s.setId(a);
//        	String name=sc.next();
//        	s.setName(name);
//        	String year=sc.next();
//        	s.setYear(year);
//        }
        Session session=fac.openSession();
        Transaction t=session.beginTransaction();
        session.save(s);
        t.commit();
//        for(int i=1;i<=2;i++) {
//        	int a=sc.nextInt();
//        	s.setId(a);
//        	String name=sc.next();
//        	s.setName(name);
//        	String year=sc.next();
//        	s.setYear(year);
//        }
       // for(int i=1;i<7;i++) {
        	s=(Student)session.load(Student.class, s.getId());
        System.out.println(s);
       // } 
        
        session.close();
    }
}
