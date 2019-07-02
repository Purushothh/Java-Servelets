package WebAppMFS;
import appLayer.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by PurushothA on 7/2/2019.
 */
@WebServlet(name = "login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User userObj = new User();
       /** PrintWriter out = response.getWriter();
        out.println("doPost-version: \n");
        out.print("Login-name : " + request.getParameter(" loginname \n") + "Password:"
                + request.getParameter(" password "));
        */

        request.setAttribute("username",request.getParameter("loginname"));
        request.setAttribute("password",request.getParameter("password"));

        if(userObj.isValidateUser
                (request.getParameter("loginname"), request.getParameter("password"))){
            request.getRequestDispatcher("/welcome.jsp").forward(request,response);

        }else{
            request.setAttribute("errorMessage","Incorrect username or password. Try" +
                    "again..!");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.print("Login-name" + request.getParameter("loginname") + "Password:"
                + request.getParameter("password"));
    }
}
