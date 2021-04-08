package com.payspec.domain.model.user;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.*;

import com.payspec.domain.model.organization.BaseEntity;
import com.payspec.domain.model.payment.AbstractPayment;
import com.payspec.domain.model.authority.Profile;
import com.payspec.domain.model.organization.Institution;
import com.payspec.domain.model.organization.Organization;
import com.payspec.domain.enums.Gender;

@Entity(name = "AbstractUser")
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public abstract class AbstractUser extends BaseEntity {

	@OneToOne
	private UserIdentity userIdentity;

	@Column(name = "middle_name")
	protected String middleName;

	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	protected Date birthDate;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	protected Gender gender;

	@Column(name="profile_pic")
	protected String profilePicture = "/static/images/avatar.png";

	@Column(name = "enabled")
	protected boolean enabled = true;

	@Column(name = "question")
	protected String securityQuestion;

	@Column(name = "answer")
	protected String securityAnswer;

	@Column(name="base_url")
	protected String baseUrl;

	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	protected Date startDate;

	@Column(name="last_logon_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastLoginDate;

	@Column(name="last_logout_date")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastLogoutDate;

	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="institution_fk")
	protected Institution institution;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="organization_fk")
	protected Organization organization;

	@Column(name = "gsm_number")
	protected String gsmPhoneNumber;

	@Column(name = "u_type")
	protected String userType;

	@Column(name = "employeeId")
	protected String employeeId;

	@Column(name = "national_id")
	protected String nationalId;

	@ManyToMany(fetch=FetchType.EAGER, targetEntity = Profile.class)
	@JoinTable(name = "user_profile",
			joinColumns = { @JoinColumn(name = "user_id") },
			inverseJoinColumns = { @JoinColumn(name = "profile_id") })
	protected Collection<Profile> profiles = new HashSet<Profile>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "buyer", fetch = FetchType.LAZY)
    protected Collection<AbstractPayment> userInvoices = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seller", fetch = FetchType.LAZY)
    protected Collection<AbstractPayment> userReceipts = new HashSet<AbstractPayment>();

	public UserIdentity getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(UserIdentity userIdentity) {
		this.userIdentity = userIdentity;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Collection<AbstractPayment> getUserInvoices() {
		return userInvoices;
	}

	public void setUserInvoices(Collection<AbstractPayment> userInvoices) {
		this.userInvoices = userInvoices;
	}

	public Collection<AbstractPayment> getUserReceipts() {
		return userReceipts;
	}

	public void setUserReceipts(Collection<AbstractPayment> userReceipts) {
		this.userReceipts = userReceipts;
	}
}
