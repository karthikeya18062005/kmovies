<%   
 
    request.getRequestDispatcher("index.jsp").include(request,response);
    session.removeAttribute("name");    
    session.invalidate();
    out.print("You are successfully logged out!");   
    
%>  