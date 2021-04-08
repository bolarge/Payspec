package com.payspec.domain.api;

import java.util.Collection;
import java.util.Date;

public interface IUser {

    String getMiddleName();

    void setMiddleName(String middleName);

	Date getBirthDate();

	void setBirthDate(Date birthDate);

	boolean isEnabled();

	void setEnabled(boolean enabled);

	String getSecurityQuestion();

	void setSecurityQuestion(String securityQuestion);

	String getSecurityAnswer();

	void setSecurityAnswer(String securityAnswer);

	Date getLastLoginDate();

	void setLastLoginDate(Date lastLoginDate);

	Date getLastLogoutDate();

	void setLastLogoutDate(Date lastLogoutDate);

	Date getStartDate();

	void setStartDate(Date startDate);

	String getEmployeeId();

	void setEmployeeId(String employeeId);

	String getBaseUrl();

	void setBaseUrl(String url);

	String getGsmPhoneNumber();

	void setGsmPhoneNumber(String gsmPhoneNumber) ;

	String getUserType();

	void setUserType(String userType);

	Collection getProfiles();

	String getNationalId();

	void setNationalId(String nationalId);

}
