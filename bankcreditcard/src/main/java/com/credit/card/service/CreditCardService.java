package com.credit.card.service;

import com.credit.card.bean.CreditCard;
import com.credit.card.bean.CreditMovement;
import com.credit.card.dto.CreditCardDto;
import com.credit.card.dto.CreditMovementDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardService {

    Flux<CreditCard> findAllCreditCard();
    Mono<CreditCard> findByIdCreditCard(String id);
    Mono<CreditCard> saveCreditCard(CreditCard creditCard);
    Mono<CreditCardDto> updateCreditCard(Mono<CreditCardDto> creditCardMono, String id);
    Mono<Void> deleteByIdCreditCard(String id);
    CreditCard findCreditCardByIdClient(String idClient);
    String seeBalance(String idCard);
    Mono<CreditMovementDto> consumeCard(String idCard, Double consume);
    Mono<CreditMovementDto> payCard(String idCard, Double pay);
    Flux<CreditMovement> findAllCreditMovement();
    Flux<CreditMovement> findByIdCreditMovementByCard(String idCard);
    Mono<CreditMovement> findAllCreditMovementById(String idMovement);



}
