package servlets;


import entities.Flashcard;
import entities.PointsCounter;
import services.FlashcardService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/game")
public class FlashcardServlet extends HttpServlet {

    private final FlashcardService flashcardService = new FlashcardService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Flashcard card = flashcardService.getRandomFlashcard();
        HttpSession session = req.getSession();
        session.setAttribute("card", card);

        if (session.getAttribute("points") == null) {
            session.setAttribute("points", new PointsCounter());
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/question.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Flashcard card = (Flashcard) session.getAttribute("card");
        session.removeAttribute("card");
        PointsCounter points = (PointsCounter) session.getAttribute("points");

        String answer = req.getParameter("answer");
        boolean isCorrect = card.checkAnswer(answer);

        if (isCorrect) {
            req.setAttribute("message", "Poprawna odpowiedź");
            points.correctAnswer();
        } else {
            req.setAttribute("message", "Zła odpowiedź");
            points.wrongAnswer();
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/result.jsp");
        dispatcher.forward(req, resp);
    }
}
