package com.lhozy.service.impl;

import com.lhozy.dao.AccountDao;
import com.lhozy.domain.Account;
import com.lhozy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> listAccount() {
        return accountDao.listAccount();
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);

    }
}
