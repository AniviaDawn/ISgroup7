package com.group7.isgroup7.controller;

import com.group7.isgroup7.pojo.Account;
import com.group7.isgroup7.pojo.Result;
import com.group7.isgroup7.service.AccountService;
import com.group7.isgroup7.utils.Error;
import com.group7.isgroup7.utils.JsonUtils;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.group7.isgroup7.utils.JsonUtils.Json;

@RestController
@RequestMapping("/group7/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping("/register")
    public Object registerAccount(@RequestBody Account account){
        account.setId(null);
        Result result = accountService.registerAccount(account);
        if (result.getError()!= Error.OK){
            return Json(-1,result.getError().getMsg());
        }
        return Json(0,"register success");
    }
}
