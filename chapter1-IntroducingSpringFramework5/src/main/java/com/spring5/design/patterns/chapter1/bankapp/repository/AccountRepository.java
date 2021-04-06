package com.spring5.design.patterns.chapter1.bankapp.repository;

import com.spring5.design.patterns.chapter1.bankapp.model.Account;

public interface AccountRepository {

    Account findByAccountId(Long accountId);

}
