/*
package com.payspec.payspec.domain.model;

import com.payspec.payspec.domain.AbstractAccount;
import com.payspec.payspec.domain.User;
import com.payspec.payspec.domain.api.IBankAccount;
import com.payspec.payspec.domain.api.IUser;

import java.util.Date;

import javax.persistence.*;


@Entity(name = "FixedDeppsit")
@DiscriminatorValue(value = "1")
public class FixedDeposit extends AbstractAccount implements IBankAccount<IUser> {

	@Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public User getUser() {
        return user;
    }

	@Override
	public void setUser(IUser iUser) {

	}

	public void setUser(User user) {
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
*/
