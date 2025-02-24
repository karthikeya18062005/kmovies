<jsp:useBean id="obj" class="lbrce.User">
    <jsp:setProperty name="obj" property="*"/>

<%    
String uname=request.getParameter("uname");  
String upass=request.getParameter("upass");  
int status=

if(uname.equals("lahari") && upass.equals("karthik"))
{
session.setAttribute("name",uname);
response.sendRedirect("Dashboaed.jsp");
}
else{
request.getRequestDispatcher("index.jsp").include(request,response);
out.println("wrong details entered..");
}
%>  

