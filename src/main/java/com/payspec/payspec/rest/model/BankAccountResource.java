package com.payspec.payspec.rest.model;

import com.payspec.payspec.domain.api.IBankAccount;

import java.util.Date;

public class BankAccountResource extends DefaultResource implements IBankAccount<UserResource> {

    private String accountNumber;

    private String bankVerificationNumber;

    private String accountType;

    private String applicantId;

    private UserResource iUser;

    public BankAccountResource() {
        super();
    }

    public BankAccountResource(IBankAccount bankAccount) {
        this.accountNumber = bankAccount.getAccountNumber();
        this.bankVerificationNumber = bankAccount.getBankVerificationNumber();
        this.accountType = bankAccount.getAccountType();
        if (bankAccount.getUser() != null) {
            this.iUser = new UserResource(bankAccount.getUser());
        }
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public UserResource getUser() {
        return iUser;
    }

    @Override
    public void setUser(UserResource iUser) {
        this.iUser = iUser;
    }

	@Override
	public double getBalanceAmount() {
		return 0;
	}

	@Override
	public void setBalanceAmount(double balanceAmount) {

	}

	@Override
	public Date getLastTransactionTimestamp() {
		return null;
	}

	@Override
	public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {

	}

	@Override
	public Long getId() {
		return 0L;
	}

	@Override
	public void setId(Long accountId) {

	}

	@Override
	public Date getCreationDate() {
		return null;
	}

	@Override
	public void setCreationDate(Date creationDate) {

	}

	@Override
	public String getActive() {
		return null;
	}

	@Override
	public void setActive(String active) {

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
		return applicantId;
	}

	@Override
	public void setApplicantId(String applicantId) {

	}

}
