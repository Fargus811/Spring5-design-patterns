package com.spring5.design.patterns.chapter1.bankapp.service;

import com.spring5.design.patterns.chapter1.bankapp.model.Amount;

public interface TransferService {

    void transferAmount(Long a, Long b, Amount amount);

}
