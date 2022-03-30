package com.credit.card.service;

import com.credit.card.bean.DebitCard;
import com.credit.card.repository.DebitCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class DebitCardService {

    @Autowired
    private DebitCardRepository debitCardRepository;

    public Mono<DebitCard> saveDebitCard (DebitCard debitCard) {
        return debitCardRepository.save(debitCard);
    }
}
