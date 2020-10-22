package servlets;

import entities.Player;
import services.PlayerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/start")
public class StartingPageServlet extends HttpServlet {

    private final PlayerService playerService = new PlayerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/start.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("playername");
        HttpSession session = req.getSession();

        Player player = playerService.addNewPlayer(name);
        if (player != null) {
            session.setAttribute("player", player);
            resp.sendRedirect("game");
        } else {
            req.setAttribute("message", "Nazwa gracza jest zajęta");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/start.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
