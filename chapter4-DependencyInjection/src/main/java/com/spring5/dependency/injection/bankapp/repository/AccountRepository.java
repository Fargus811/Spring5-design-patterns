package com.spring5.dependency.injection.bankapp.repository;

import com.spring5.dependency.injection.bankapp.model.Account;

public interface AccountRepository {

    Account findByAccountId(Long accountId);
}
