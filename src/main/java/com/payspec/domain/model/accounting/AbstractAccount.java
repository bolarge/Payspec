package com.payspec.domain.model.accounting;

import com.payspec.domain.model.organization.Identity;
import com.payspec.domain.model.user.AbstractUser;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Account")
@Table(name = "account")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "acc_type")
public abstract class AbstractAccount extends Identity {

	@Column(name = "bvn", unique = true, nullable = false)
	protected String bankVerificationNumber;

	@Column(name = "balance_amount")
	protected double balanceAmount;

	@Column(name = "last_transaction_ts")
	protected Date lastTransactionTimestamp;

    @Column(name = "account_number", unique = true, nullable = false)
    protected String accountNumber;

    @Column(name = "creation_date")
    protected Date creationDate;

    @Column(name = "active")
    protected String active;

    @Column(name = "enabled")
	protected boolean enabled = true;

    @Column(name = "account_type", nullable = false)
    protected String accountType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", nullable = false)
    protected AbstractUser user;

	public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

	public Long getId() {
		return super.getId();
	}

	public void setId(Long accountId) {
		super.setId(accountId);
	}

	public AbstractUser getUser() {
		return user;
	}

	public void setUser(AbstractUser user) {
		this.user = user;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public Date getLastTransactionTimestamp() {
		return lastTransactionTimestamp;
	}

	public void setLastTransactionTimestamp(Date lastTransactionTimestamp) {
		this.lastTransactionTimestamp = lastTransactionTimestamp;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getBankVerificationNumber() {
		return bankVerificationNumber;
	}

	public void setBankVerificationNumber(String bankVerificationNumber) {
		this.bankVerificationNumber = bankVerificationNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


}
