package com.minami.service.impl;

import com.minami.dao.AccountDao;
import com.minami.domain.Account;
import com.minami.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void insert(Account account) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(Account account) {

    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account selectById(Integer id) {
        return accountDao.selectById(id);
    }
}
