package com.revoltcode.learngraphqljava.resolver;

import com.revoltcode.learngraphqljava.domain.bank.BankAccount;
import com.revoltcode.learngraphqljava.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id){

        log.info("Retrieving bank account id: {}", id);

        return BankAccount.builder()
                .id(id)
                .name("Philip")
                .currency(Currency.USD)
                .build();
    }
}
