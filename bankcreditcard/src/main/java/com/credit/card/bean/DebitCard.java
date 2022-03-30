package com.credit.card.bean;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Random;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "debit-card")
public class DebitCard {

    @Id
    private String id;

    @Builder.Default
    private String cardNumber = java.util.UUID.randomUUID().toString();

    @Builder.Default
    private LocalDate expirationDate = LocalDate.now().plusYears(5);

    @Builder.Default
    private String cvv = Integer.toString(new Random().nextInt(999));

    private String mainAccount;

}
