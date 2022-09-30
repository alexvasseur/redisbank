package com.redislabs.demos.redisbank.transactions;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    private Long id;
    private String account;
    private String accountHolder;
    private String accountType;
}
