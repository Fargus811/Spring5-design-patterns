package com.spring5.life.cycle.bankapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    Long accountId;
    String name;
    Amount amount;
}
