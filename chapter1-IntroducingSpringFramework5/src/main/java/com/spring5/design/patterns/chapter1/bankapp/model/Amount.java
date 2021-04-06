package com.spring5.design.patterns.chapter1.bankapp.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Amount {

    private Double balance;

}
