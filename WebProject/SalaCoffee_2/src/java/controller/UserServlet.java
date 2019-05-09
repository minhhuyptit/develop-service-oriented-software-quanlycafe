package controller;

import dao.UserDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.sendRedirect("/SalaCoffee_2/hoadon.jsp");

        HttpSession session;
        session = request.getSession();//cai nay de lam gi 
        String command = request.getParameter("command");
        String userName = request.getParameter("user_name");
        String userPass = request.getParameter("user_pass");
        String url = "";
        UserDAO usersDAO = new UserDAO();
        User user = null;
        switch (command) {
            case "login":
                if (userName == "" || userPass == "") {
                    request.setAttribute("error", "Bạn chưa nhập đầy đủ thông tin");
                    url = "/login.jsp";

                } else {
                    user = usersDAO.login(userName, userPass);
                    if (user != null) {
                        session.setAttribute("user", user);
                        session.setAttribute("name", user.getName());
                        if (user.getAccess_level() == 1) {
                           response.sendRedirect("/SalaCoffee_2/hoadon.jsp");
                           
                        } else if (user.getAccess_level() == 0) {
                            response.sendRedirect("/SalaCoffee_2/hoadon_1.jsp");
                            
                        }
                        return;
                    } else {
                        request.setAttribute("error", "Mật khẩu hoặc Password không đúng !");
                        url = "/login.jsp";
                    }
                }
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

}
