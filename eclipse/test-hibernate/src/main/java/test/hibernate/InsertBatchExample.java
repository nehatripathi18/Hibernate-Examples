package test.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class InsertBatchExample {
	public static void main(String[] args) {
	      Session session = null;
	      Transaction transaction = null;
	      int batchSize = 50;
	      try {
	         session = HbUtil.getSessionFactory().openSession();
	         transaction = session.beginTransaction();
         for (long i = 1; i <= 100; i++) {
	            Employee employee = new Employee();
	            employee.setName("Rachna Tyagi " + i);
	            employee.setEmail("rtyagi@hotmail.com");
	            session.save(employee);
	            if (i > 0 && i % batchSize == 0) {
	               session.flush();
	               session.clear();
	            }
	         }
	         transaction.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         if (session != null) {
	            session.close();
	         }
	      }
	      
	      HbUtil.shutdown();
	   }
	}

