package com.credit.card.repository;

import com.credit.card.bean.CreditCard;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {
}
