package com.payspec.payspec.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.payspec.payspec.domain.base.User;
import com.payspec.payspec.service.api.model.IOrganization;
import com.payspec.payspec.service.api.model.IUser;
import com.payspec.payspec.service.api.enums.*;

@Entity(name = "Customer")
@DiscriminatorValue(value = "1")
public class Person extends User implements IUser<IOrganization>{
	
	private String userType;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Gender getGender() {
		return gender;
	}

	/*public void setGender(Gender gender) {
		this.gender = gender;
	}*/

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Date getLastLogoutDate() {
		return lastLogoutDate;
	}

	public void setLastLogoutDate(Date lastLogoutDate) {
		this.lastLogoutDate = lastLogoutDate;
	}

	public Collection<Profile> getProfiles() {
		return profiles;
	}
	
	public void setProfiles(Collection<Profile> profiles) {
		this.profiles = profiles;
	}

	public String getGsmPhoneNumber() {
		return gsmPhoneNumber;
	}

	public void setGsmPhoneNumber(String gsmPhoneNumber) {
		this.gsmPhoneNumber = gsmPhoneNumber;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public Organization getOrganization() {
		return organization;
	}

	@Override
	public void setOrganization(IOrganization organization) { }

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String getEmployeeId() {
		return employeeId;
	}

	@Override
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;	
	}	
}
