package com.group7.isgroup7.service.Impl;

import com.group7.isgroup7.pojo.Account;
import com.group7.isgroup7.pojo.Result;
import com.group7.isgroup7.repository.AccountRepository;
import com.group7.isgroup7.service.AccountService;
import com.group7.isgroup7.utils.Error;
import com.group7.isgroup7.utils.exception.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Result registerAccount(Account account) {
        Result result = new Result(Error.OK,null);
        try{
            Account account1 = accountRepository.save(account);
            if (account1==null||account1.getId()==null){
                throw new InsertException(account.getNumber()+"register new account error");
            }
        }catch (InsertException e){
            result.setError(Error.INSERTERROR);
        }catch (NullPointerException e){
            result.setError(Error.NULLPOINTERERROR);
        }
        return result;
    }
}
