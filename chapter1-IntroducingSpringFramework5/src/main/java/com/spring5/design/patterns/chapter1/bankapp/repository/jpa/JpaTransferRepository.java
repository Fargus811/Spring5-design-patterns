package com.spring5.design.patterns.chapter1.bankapp.repository.jpa;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;
import com.spring5.design.patterns.chapter1.bankapp.model.Amount;
import com.spring5.design.patterns.chapter1.bankapp.repository.TransferRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class JpaTransferRepository implements TransferRepository {

    private static final Log logger = LogFactory.getLog(JpaTransferRepository.class);

    @Override
    public void transfer(Account accountA, Account accountB, Amount amount) {
        logger.info("Transfering amount from account A to B via JPA implementation");
    }

}
