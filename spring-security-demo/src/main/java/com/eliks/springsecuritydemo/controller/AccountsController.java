package com.eliks.springsecuritydemo.controller;

import com.eliks.springsecuritydemo.model.Account;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsController {
    List<Account> accounts = Arrays.asList(new Account("1234", "DEPOSIT", "1"), new Account("56789", "LOAN", "1"));

    @GetMapping("/{customerId}")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public List<Account> getAccountsByCustomerId(@PathVariable String customerId) {
        return accounts.stream().filter(account -> account.getCustomerId().equals(customerId)).collect(Collectors.toList());
    }
}
