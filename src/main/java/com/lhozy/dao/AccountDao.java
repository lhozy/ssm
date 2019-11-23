package com.lhozy.dao;

import com.lhozy.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface AccountDao {
    @Select("select * from account")
    List<Account> listAccount();
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
