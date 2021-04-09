package com.spring5.life.cycle.bankapp.repository;

import com.spring5.life.cycle.bankapp.model.Account;

public interface AccountRepository {

    Account findByAccountId(Long accountId);

}
