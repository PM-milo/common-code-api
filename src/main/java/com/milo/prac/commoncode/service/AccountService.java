package com.milo.prac.commoncode.service;

import com.milo.prac.commoncode.dto.AccountDto;
import com.milo.prac.commoncode.mapper.AccountMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountMapper accountMapper;

    public List<AccountDto> findAll () {
        return accountMapper.findAll();
    }

    public int insert (AccountDto accountDto) {
        return accountMapper.insert(accountDto);
    }

    public int update (AccountDto accountDto) {
        return accountMapper.update(accountDto);
    }

    public int delete (String accountNumber) {
        return accountMapper.delete(accountNumber);
    }
}
