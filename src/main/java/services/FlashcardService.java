package services;

import entities.Flashcard;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlashcardService {

    private static List<Flashcard> cards = new ArrayList<>();

    static {
        cards.add(new Flashcard("Stolica Polski", "WARSZAWA"));
        cards.add(new Flashcard("Stolica Hiszpanii", "MADRYT"));
        cards.add(new Flashcard("Stolica Czech", "PRAGA"));
        cards.add(new Flashcard("Stolica Urugwaju", "MONTEVIDEO"));
        cards.add(new Flashcard("Stolica Kanady", "OTTAWA"));
    }

    public Flashcard getRandomFlashcard() {
        Random random = new Random();
        int index = random.nextInt(cards.size());
        return cards.get(index);
    }
}
