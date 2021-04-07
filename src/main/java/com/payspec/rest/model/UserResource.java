package com.payspec.rest.model;

import com.payspec.domain.api.IUser;

import java.util.Collection;
import java.util.Date;

public class UserResource implements IUser {

	private String userName;

	private String email;

	private String gsmPhoneNumber;

	private String userType;

	private String password;

	private String nationalId;

    public UserResource() {
        super();
    }

    public UserResource(IUser iUser) {
        this.userName = iUser.getUserName();
        this.email = iUser.getEmail();
        this.gsmPhoneNumber = iUser.getGsmPhoneNumber();
        this.userType = iUser.getUserType();
        this.password = iUser.getPassword();
        this.nationalId = iUser.getNationalId();
    }

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public void setUserName(String username) {
		this.userName = username;
	}

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
    	this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
	public String getUserType() {
		return userType;
	}

    @Override
	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public Long getId() {
		return null;
	}

	@Override
	public void setId(Long id) {

	}

	@Override
	public int getVersion() {
		return 0;
	}

	@Override
	public void setVersion(int version) {

	}

	@Override
	public String getLastName() {
		return null;
	}

	@Override
	public void setLastName(String lastName) {

	}

	@Override
	public String getFirstName() {
		return null;
	}

	@Override
	public void setFirstName(String firstName) {

	}

	@Override
	public Date getBirthDate() {
		return null;
	}

	@Override
	public void setBirthDate(Date birthDate) {

	}

	@Override
	public String getMiddleName() {
		return null;
	}

	@Override
	public void setMiddleName(String middleName) {

	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	@Override
	public void setEnabled(boolean enabled) {

	}

	@Override
	public String getSecurityQuestion() {
		return null;
	}

	@Override
	public void setSecurityQuestion(String securityQuestion) {

	}

	@Override
	public String getSecurityAnswer() {
		return null;
	}

	@Override
	public void setSecurityAnswer(String securityAnswer) {

	}

	@Override
	public Date getLastLoginDate() {
		return null;
	}

	@Override
	public void setLastLoginDate(Date lastLoginDate) {

	}

	@Override
	public Date getLastLogoutDate() {
		return null;
	}

	@Override
	public void setLastLogoutDate(Date lastLogoutDate) {

	}

	@Override
	public Date getStartDate() {
		return null;
	}

	@Override
	public void setStartDate(Date startDate) {

	}

	@Override
	public String getEmployeeId() {
		return null;
	}

	@Override
	public void setEmployeeId(String employeeId) {

	}

	@Override
	public String getBaseUrl() {
		return null;
	}

	@Override
	public void setBaseUrl(String url) {

	}

	@Override
	public String getGsmPhoneNumber() {
		return gsmPhoneNumber;
	}

	@Override
	public void setGsmPhoneNumber(String gsmPhoneNumber) {
		this.gsmPhoneNumber = gsmPhoneNumber;
	}

	@Override
	public String getNationalId() {
		return nationalId;
	}

	@Override
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	@Override
	public Collection getProfiles() {
		// TODO Auto-generated method stub
		return null;
	}
}
