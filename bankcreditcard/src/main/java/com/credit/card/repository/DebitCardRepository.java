package com.credit.card.repository;

import com.credit.card.bean.DebitCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DebitCardRepository extends ReactiveMongoRepository<DebitCard, String> {
}
