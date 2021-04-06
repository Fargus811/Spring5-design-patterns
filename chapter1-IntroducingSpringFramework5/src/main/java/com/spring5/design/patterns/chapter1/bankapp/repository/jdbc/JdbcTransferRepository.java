package com.spring5.design.patterns.chapter1.bankapp.repository.jdbc;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;
import com.spring5.design.patterns.chapter1.bankapp.repository.TransferRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JdbcTransferRepository implements TransferRepository {

    private static final Log logger = LogFactory.getLog(JdbcTransferRepository.class);

    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        logger.info("Transfering amount from account A to B via JDBC implementation");
    }

}
