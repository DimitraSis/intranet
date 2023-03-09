package com.example.intranet;

import com.example.intranet.entities.Event;
import com.example.intranet.entities.Participant;
import com.example.intranet.entities.User;
import com.example.intranet.persistence.EventMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ParticipateServlet", value = "/participate")
public class ParticipateServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String comment = request.getParameter("comment");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user !=null){
            Participant participant = new Participant(user,comment);
            EventMapper.getEvent().addParticipant(participant);
            request.setAttribute("participantList",EventMapper.getEvent().getParticipantList());
            request.getRequestDispatcher("WEB-INF/participate.jsp").forward(request,response);

        }

    }
}
