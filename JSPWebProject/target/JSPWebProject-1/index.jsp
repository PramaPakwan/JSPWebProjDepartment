

<%@page import="com.leapfrog.jspwebproject.dao.impl.DepartmentDAOImpl"%>
<%@page import="com.leapfrog.jspwebproject.dao.DepartmentDAO"%>
<%@page import="com.leapfrog.jspwebproject.entity.Department"%>
<%@include file="header.jsp" %>
<h1>Department</h1>
        <% 
            DepartmentDAO deptDAO=new DepartmentDAOImpl();
            try{
            int result=deptDAO.insert(new Department(0,"Accounting", "Accounting Section", true));
            }catch(Exception e){
                out.println("<h1>" + e.getMessage()+"</h1>");
                
            }
            
        %>
<%@include  file="footer.jsp"%>

