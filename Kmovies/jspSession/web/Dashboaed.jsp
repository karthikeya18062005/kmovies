<% 
String name=(String)session.getAttribute("name");
if(name!=null)
{
    out.print("<a href=logout.jsp>Logout Here</a>"); 
    out.print("<br>Welcome to second page,"+name);    
    
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.addHeader("Cache-Control", "post-check=0, pre-check=0");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

}
else
{         
    out.print("Please login first");  
    request.getRequestDispatcher("index.jsp").include(request, response);  
}
    

%>   
