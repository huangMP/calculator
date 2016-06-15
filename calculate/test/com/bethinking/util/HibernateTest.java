package com.bethinking.util;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;

import com.bethinking.model.CalculateWay;
import com.bethinking.model.Record;

public class HibernateTest {

	@Test
	public void testSave() {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		Record r = new Record("7","7","5","",2,1);
		CalculateWay cw = new CalculateWay();
		
		cw.setId(6);
		r.setCalculateWay(cw.getId());
		
		s.beginTransaction();			
		s.save(cw);
		s.getTransaction().commit();
	}

}
