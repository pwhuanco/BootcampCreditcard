package com.credit.card.repository;

import com.credit.card.bean.CreditMovement;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CreditMovementRepository extends ReactiveMongoRepository<CreditMovement, String> {
}
