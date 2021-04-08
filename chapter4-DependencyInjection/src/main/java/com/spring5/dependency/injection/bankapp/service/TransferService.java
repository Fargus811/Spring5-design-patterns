package com.spring5.dependency.injection.bankapp.service;

import com.spring5.dependency.injection.bankapp.model.Amount;

public interface TransferService {

    void transferAmount(Long a, Long b, Amount amount);
}
