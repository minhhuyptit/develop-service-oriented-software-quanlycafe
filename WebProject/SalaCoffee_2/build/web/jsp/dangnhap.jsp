
<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UserDAO userDAO = new UserDAO();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    User user = userDAO.login(username, password);
    
    //user = new Users(Long.parseLong("2142"), "dfsdf", "asfd", true);
    int userrule=-1;
    userrule = user.getAccess_level();
    if (userrule != -1) {
        session.setAttribute("user", user);                                 
        session.setAttribute("name", user.getName()); //user.getUserID()
    }
    out.print(userrule);
%>
