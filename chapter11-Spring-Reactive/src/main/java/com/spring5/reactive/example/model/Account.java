package com.spring5.reactive.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

@Data
@AllArgsConstructor
public class Account {

    private static final long serialVersionUID = 9050672799345744358L;

    @Id
    Long id;

    String name;

    Long balance;

    String branch;
}
