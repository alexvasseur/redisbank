package com.redislabs.demos.redisbank.transactions;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankTransaction {

    @Id
    private Long id;
    private String fromAccount;
    private String fromAccountName;
    private String toAccount;
    private String toAccountName;
    private String amount;
    private String description;
    private String transactionDate;
    private String transactionType;
    private String balanceAfter;

}
