package az.company.spring_jdbc_template.service;

import az.company.spring_jdbc_template.dao.entity.CardEntity;
import az.company.spring_jdbc_template.dao.repository.CardRepository;
import az.company.spring_jdbc_template.mapper.CardMapper;
import az.company.spring_jdbc_template.model.request.CreateCardRequest;
import az.company.spring_jdbc_template.model.response.CardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardService {
    private final CardRepository cardRepository;

    public void createCard(CreateCardRequest createCardRequest) {
        CardEntity cardEntity = CardMapper.mapToEntity(createCardRequest);
        cardRepository.save(cardEntity);
    }

    public List<CardResponse> getAllCards() {
       return cardRepository.findAll()
                .stream()
                .map(CardMapper::mapToDto)
                .toList();
    }

    public CardResponse getCardById(Long id) {
        return cardRepository.findById(id)
                .map(CardMapper::mapToDto)
                .orElseThrow(()->new RuntimeException("Card not found"));
    }

    public void deleteCardById(Long id) {
        cardRepository.deleteById(id);
    }
}
