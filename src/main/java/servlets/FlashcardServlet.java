package servlets;


import entities.Flashcard;
import services.FlashcardService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FlashcardServlet extends HttpServlet {

    private final FlashcardService flashcardService;

    public FlashcardServlet(FlashcardService flashcardService) {
        this.flashcardService = flashcardService;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Flashcard card = flashcardService.getRandomFlashcard();
        HttpSession session = req.getSession();
        session.setAttribute("card", card);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/question.jsp");
        requestDispatcher.forward(req, resp);
    }
}
