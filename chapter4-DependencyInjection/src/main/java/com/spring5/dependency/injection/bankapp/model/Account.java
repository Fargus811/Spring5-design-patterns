package com.spring5.dependency.injection.bankapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private static final long serialVersionUID = 1L;

    Long accountId;
    String name;
    Amount amount;
}
