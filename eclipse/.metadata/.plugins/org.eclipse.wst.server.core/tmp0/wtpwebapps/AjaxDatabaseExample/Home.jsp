<%@ page import="java.sql.*"%>

<%
	String s = request.getParameter("val");
	if (s == null || s.trim().equals("")) {
		out.print("Please enter id");
	} else {
		int id = Integer.parseInt(s);
		//out.print(id);  
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "root");
			PreparedStatement ps = con.prepareStatement("select   from actor where actor_id=?");
			ps.setInt(1, id);
			//ps.setString(2,name);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("Working");
				out.print(rs.getInt(1) + " " + rs.getString(2)+rs.getString(3) + " " + rs.getString(2) );
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>
