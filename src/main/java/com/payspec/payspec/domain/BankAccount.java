package com.payspec.payspec.domain;

import com.payspec.payspec.domain.base.Account;
import com.payspec.payspec.service.api.model.IBankAccount;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity(name = "SavingsAccount")
@DiscriminatorValue(value = "1")
public class BankAccount extends Account implements IBankAccount<Customer>{

	@Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getUser() {
        return user;
    }

    public void setUser(Customer user) {
        this.user = user;
    }

    @Override
	public Long getId() {
		return id;
	}

    @Override
	public void setId(Long accountId) {
		this.id = accountId;
	}

    @Override
	public double getBalanceAmount() {
		return balanceAmount;
	}

    @Override
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

    @Override
	public Date getLastTransactionTimestamp() {
		return lastTransactionTimestamp;
	}

    @Override
	public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
		this.lastTransactionTimestamp = lastTransactionTimestamp;
	}
	
    @Override
	public Date getCreationDate() {
		return creationDate;
	}

    @Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
    @Override
	public String getActive() {
		return active;
	}

    @Override
	public void setActive(String active) {
		this.active = active;
	}

    @Override
	public String getBankVerificationNumber() {
		return bankVerificationNumber;
	}

    @Override
	public void setBankVerificationNumber(String bankVerificationNumber) {
		this.bankVerificationNumber = bankVerificationNumber;
	}
	
    @Override
	public String getAccountType() {
		return accountType;
	}

	@Override
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String getApplicantId() {
		return null;
	}

	@Override
	public void setApplicantId(String applicantId) {
		
	}
	
}
