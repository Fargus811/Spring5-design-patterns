package com.spring5.reactive.example.repository;

import com.spring5.reactive.example.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    Mono<Account> findById(Long id);

    Flux<Account> findAll();

    Mono<Account> save(Mono<Account> account);
}
