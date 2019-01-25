package it.anto.hibernate;

import java.util.ArrayList;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;

import org.apache.commons.lang3.SerializationUtils;
import org.hibernate.ogm.datastore.mongodb.type.GridFS;


public class Test {

	public static void main(String[] args) {
		
		
		try {
			
			Random rnd = new Random();
			OgmBigListEvent event2= new OgmBigListEvent();
			event2.setTitle("titleeee1");
			OgmBigListEventBody body2 = new OgmBigListEventBody();
			body2.setName("body name");
			body2.setId(rnd.nextLong());
			event2.setUsername("Username");
			ArrayList<RowElement> elements = new ArrayList<RowElement>();
			RowElement el = new RowElement("name1",1L,"itemCode","itemDescription",3,5,4,5,2,"fragility","pack_type",5,"category","simCode","rotation","attributeLink",2L,1L,"owner_ev_link");
			elements.add(el);
			elements.add(new RowElement("name2",1L,"itemCode","itemDescription",3,2,4,5,2,"fragility","pack_type",5,"category","simCode","rotation","attributeLink",2L,1L,"owner_ev_link"));
			body2.setElements(elements);
			event2.setOgmEventBody(body2);
			body2.setList(new GridFS(SerializationUtils.serialize(el)));
			
			EntityManager e = Persistence.createEntityManagerFactory("hibernatedebug").createEntityManager();
			EntityTransaction tx = e.getTransaction();
			tx.begin();
			e.persist(event2);
			tx.commit();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		System.out.println("done");

	}

}
