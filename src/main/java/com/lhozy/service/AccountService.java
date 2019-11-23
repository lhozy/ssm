package com.lhozy.service;

import com.lhozy.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> listAccount();
    void saveAccount(Account account);
}
