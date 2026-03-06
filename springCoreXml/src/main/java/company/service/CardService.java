package company.service;

import company.repository.CardRepository;

public class CardService {
    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void processCard() {
        System.out.println("Processing Card..");
        cardRepository.saveCard();
    }
}
