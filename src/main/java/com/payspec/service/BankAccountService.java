package com.payspec.service;

import com.payspec.domain.api.IBankAccount;

import java.util.List;

public interface BankAccountService {

    List<? extends IBankAccount> getByIUser(String username);

    IBankAccount createAccount(IBankAccount account);

    void withdrawFromAccount(String accountNumber, double withdrawAmount);

    void transferFromAccount(String fromAccountNumber, String toAccountNumber, double transferAmount);

    Long createAndReturnAccountId(IBankAccount bankAccountDetails);

	List<? extends IBankAccount> getInactiveBankAccounts();

	IBankAccount deActivateBankAccount(String accountNumber);

	void deActivateBankAccount(List<IBankAccount> account);
}
