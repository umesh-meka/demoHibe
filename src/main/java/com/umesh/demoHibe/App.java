package com.umesh.demoHibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien umesh = new Alien();
        
        umesh.setId(55);
        umesh.setName("Umesh");
        umesh.setColor("light Black");
        
        Configuration con = new Configuration();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        session.save(umesh);
    }
}


