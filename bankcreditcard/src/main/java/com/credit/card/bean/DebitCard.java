package com.credit.card.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("DebitCard")
public class DebitCard {

    @Id
    private String id;
    private String cardNumber;
    private String principalAccount;
    private String idClient;

}
