package com.example.intranet;

import com.example.intranet.entities.User;
import com.example.intranet.persistence.UserMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignupServlet", value = "/signup")
public class SignupServlet extends HttpServlet {


    public void init() {

        UserMapper.populateUserMap();
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //først modtager vi requestværdi fra en input form
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        User user = UserMapper.createUser(login,password);

        if (user == null){
            request.setAttribute("message","User already exists");
        }else {
            request.setAttribute("message","grats, you are oprettet med login = " + login);
        }

        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
