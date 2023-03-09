package com.example.intranet;

import com.example.intranet.entities.User;
import com.example.intranet.persistence.EventMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ParticipateRedirectServlet", value = "/participateredirect")
public class ParticipateRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session= request.getSession();
        User user = (User) session.getAttribute("user");
        if (user !=null) {
            request.setAttribute("participantList", EventMapper.getEvent().getParticipantList());
            request.getRequestDispatcher("WEB-INF/participate.jsp").forward(request, response);
        }else {
            request.setAttribute("message", " Du har ikke adgang " );
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
