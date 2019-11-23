package com.lhozy.controller;

import com.lhozy.domain.Account;
import com.lhozy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/list")
    public ModelAndView list(){
        List<Account> accounts = accountService.listAccount();
        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts",accounts);
        mv.setViewName("list");
        return mv;
    }

    @RequestMapping("/save")
    public String save(Account account){
        accountService.saveAccount(account);
        return "success";

    }
}
