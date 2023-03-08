package com.example.intranet;

import com.example.intranet.entities.User;
import com.example.intranet.persistence.UserMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void init() {

        UserMapper.populateUserMap();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //først modtager vi requestværdi fra en input form
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        //check if login + password finder i systemet (DB)
        if(UserMapper.isLoginValid(login,password)){
            request.setAttribute("message","Login: " + login+ " is valid");
            User user = UserMapper.getUserByLogin(login);

            //gem user i session-state:
            HttpSession session= request.getSession();
            session.setAttribute("user",user);

        } else {
            request.setAttribute("message","Login: " + login+ " or password is not valid");

        }



        //forward til index.jsp siden
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }
}
