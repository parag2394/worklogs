package com.icreon;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.annotations.EntityBinder;
import org.hibernate.criterion.Restrictions;

import com.icreon.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Worklogs wd=(Worklogs)session.load(Worklogs.class, 1);
		
		Transaction tx=session.beginTransaction();
		
	/*	String hql = "FROM Worklogs E WHERE E.status =:status";
	//Query query = (Query) session.createQuery(hql);
		SQLQuery query = session.createSQLQuery(hql);
		query.addEntity(Worklogs.class);
		query.setParameter("status",1);
		List results = query.list();
		
		
		System.out.println(results.get(1));
	*/
		
		String sql = "SELECT * FROM tbl_worklogs WHERE status= :status";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(Worklogs.class);
		query.setParameter("status", 1);
		List results = query.list();
		System.out.println(results.size());
		
		Iterator it=results.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
    	
		tx.commit();
		session.close();
	}

}
