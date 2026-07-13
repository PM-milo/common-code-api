package com.milo.prac.commoncode.controller;

import com.milo.prac.commoncode.dto.AccountDto;
import com.milo.prac.commoncode.service.AccountService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    @GetMapping
    public List<AccountDto> findAll() {
        return accountService.findAll();
    }

    @PostMapping
    public int insert (@RequestBody AccountDto accountDto) {
        return accountService.insert(accountDto);
    }

    @PutMapping("/{accountNumber}")
    public int update (
            @PathVariable String accountNumber,
            @RequestBody AccountDto accountDto) {
        accountDto.setAccountNumber(accountNumber);
        return accountService.update(accountDto);
    }

    @DeleteMapping("/{accountNumber}")
    public int delete (@PathVariable String accountNumber) {
        return accountService.delete(accountNumber);
    }

}
