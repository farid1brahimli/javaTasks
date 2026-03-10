package az.company.spring_jdbc_template.controller;

import az.company.spring_jdbc_template.model.request.CreateCardRequest;
import az.company.spring_jdbc_template.model.response.CardResponse;
import az.company.spring_jdbc_template.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCard(@RequestBody CreateCardRequest createCardRequest) {
        cardService.createCard(createCardRequest);
    }

    @GetMapping
    public List<CardResponse> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public CardResponse getCardById(@PathVariable Long id) {
        return cardService.getCardById(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCardById(@PathVariable Long id) {
        cardService.deleteCardById(id);
    }
}
