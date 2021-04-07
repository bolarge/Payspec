/*
package com.payspec.payspec.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/accounts", produces = {APPLICATION_JSON_VALUE}, consumes = {APPLICATION_JSON_VALUE})
public class BankAccount {

    @Autowired
    @Qualifier("bankAccountService")
    private BankAccountService iBankAccountService;

    @Secured({"ROLE_USER"})
    @RequestMapping(method = RequestMethod.GET)
    public List<BankAccountResource> getAll() throws QuaspecServiceException {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        List<BankAccountResource> result = new ArrayList<>();

        List<? extends IBankAccount> bankAccountEntities = iBankAccountService.getByIUser(name);
        for (IBankAccount bankAccountEntity : bankAccountEntities) {
            result.add(new BankAccountResource(bankAccountEntity));
        }
        return result;
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @RequestMapping(method = RequestMethod.POST)
    public BankAccountResource openAccount(@RequestBody BankAccountResource account) throws QuaspecServiceException {
    	IBankAccount bankAccount = iBankAccountService.createAccount(account);
    	if(bankAccount != null) {
	            return new BankAccountResource(bankAccount);
    	}
        return null;
    }
}
*/
