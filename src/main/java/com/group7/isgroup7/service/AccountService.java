package com.group7.isgroup7.service;

import com.group7.isgroup7.pojo.Account;
import com.group7.isgroup7.pojo.Result;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.geom.RectangularShape;

@Service
@Transactional(rollbackFor = Exception.class)
public interface AccountService {

    Result registerAccount(Account account);
}
