<%@page import="java.sql.*" %>
    <% try{ 
        Class.forName("com.mysql.jdbc.Driver"); 
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mca_b", "root" , "" );
     out.print("Conneted to database successfully"); 
        Statement stmt=con.createStatement(); 
        String fName=request.getParameter("f_name");
        String lName=request.getParameter("l_name"); 
        int age=Integer.parseInt(request.getParameter("age"));
        out.println("<br>"+fName+" "+lName+" "+age+"<br>");

        // sql query for insrt
        int result = stmt.executeUpdate("insert into registration(f_name,l_name,age) values(" + "'" + fName + "',"
        + "'" + lName + "'," + age + ")");
        if (result > 0)
        out.print("successfully inserted");
        else
        out.print("unsuccessful insertion ");
        }catch (Exception e){
        out.print(e.getMessage());
        }
    %>