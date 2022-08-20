package com.minami.service;

import com.minami.domain.Account;

import java.util.List;

public interface AccountService {
    void insert(Account account);

    void deleteById(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account selectById(Integer id);
}
