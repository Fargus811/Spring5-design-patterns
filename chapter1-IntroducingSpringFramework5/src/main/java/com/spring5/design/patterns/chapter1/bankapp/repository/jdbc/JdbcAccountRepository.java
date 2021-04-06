package com.spring5.design.patterns.chapter1.bankapp.repository.jdbc;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;
import com.spring5.design.patterns.chapter1.bankapp.repository.AccountRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JdbcAccountRepository implements AccountRepository {

    private static final Log logger = LogFactory.getLog(JdbcAccountRepository.class);

    @Override
    public Account findByAccountId(Long accountId) {
        Account account = Account.builder()
                .accountId(accountId)
                .name("Some Test Name")
                .amount(Amount.builder()
                        .balance(3000.0)
                        .build())
                .build();
        logger.info(account);
        return account;
    }

}
