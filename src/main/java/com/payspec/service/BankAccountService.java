package com.payspec.service;

import com.payspec.domain.exception.QuaspecServiceException;
import com.payspec.domain.api.IBankAccount;

import java.util.List;

public interface BankAccountService {

    List<? extends IBankAccount> getByIUser(String username) throws QuaspecServiceException;

    IBankAccount createAccount(IBankAccount account) throws QuaspecServiceException;

    void withdrawFromAccount(String accountNumber, double withdrawAmount) throws QuaspecServiceException;

    void transferFromAccount(String fromAccountNumber, String toAccountNumber, double transferAmount);

    Long createAndReturnAccountId(IBankAccount bankAccountDetails);

	List<? extends IBankAccount> getInactiveBankAccounts();

	IBankAccount deActivateBankAccount(String accountNumber);

	void deActivateBankAccount(List<IBankAccount> account);

}
