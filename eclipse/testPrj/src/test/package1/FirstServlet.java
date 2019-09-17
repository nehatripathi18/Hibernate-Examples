package test.package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Session session = null;
		Transaction transaction = null;
		try {
			session = HbUtil.getSessionFactory().openSession();
			transaction=session.getTransaction();
			if(!transaction.isActive()) 
				transaction.begin();
			Customer1 customer = new Customer1();
			customer.setId(Integer.parseInt(request.getParameter("id")));
			customer.setFirstName(request.getParameter("fname"));
			customer.setLastName(request.getParameter("lname"));
			customer.setEmail(request.getParameter("email"));
			/*customer.setId(17);
			customer.setFirstName("Nisha");
			customer.setLastName("Rastogi");
			customer.setEmail("rNisha@gmail.com");*/
			session.save(customer);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}

		HbUtil.shutdown();
	}
		
		
	//doGet(request, response);
	
			/*response.setContentType("text/html");
			String name=request.getParameter("user");
			String pass=request.getParameter("pwd");
			
			
			if(pass.equals("123"))
			{
				Cookie ck=new Cookie("username",name);
				response.addCookie(ck);
				response.sendRedirect("FirstServlet");
				
				
			}*/
}



