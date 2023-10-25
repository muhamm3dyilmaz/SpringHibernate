package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		// City için sessionfactory de bir factory oluşturuldu
		SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(City.class)
					.buildSessionFactory();
		
		// Factorydeki session tanımlandı ve kullanıma alındı
		Session session = factory.getCurrentSession();
		
		try {
			//session başlat
			session.beginTransaction();
			
			//session sorgu gönder
//			List<City> cities = session.createQuery("from City").getResultList();
//			
//			for(City city:cities) {
//				System.out.println(city.getName());
//			}
			
			///////////////////////
			
			//Insertion
//			City city = new City();
//			city.setName("Berlin");
//			city.setCountryCode(3);
//			city.setDistrict("Kreuzberg");
//			city.setPopulation(33400);
//			session.save(city);
			
			/////////////////////////
			
			//Update
//			City city = session.get(City.class, 0);
//			city.setDistrict("Kreuzberg");
//			session.save(city);
			
			//Delete
			City city = session.get(City.class, 0);
			session.delete(city);
			
			
			//session işlemleri commit et
			session.getTransaction().commit();
		}finally {
			//işlem sonucu factory kapat
			factory.close();
		}
		
		
	}
}



