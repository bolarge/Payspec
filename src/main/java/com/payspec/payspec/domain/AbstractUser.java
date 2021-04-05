package com.payspec.payspec.domain;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.*;

import com.payspec.payspec.domain.model.Institution;
import com.payspec.payspec.domain.model.Organization;
import com.payspec.payspec.domain.model.Profile;
import com.payspec.payspec.domain.enums.Gender;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
public abstract class AbstractUser extends BaseEntity{

	@Column(name = "version")
	protected int version;

	@Column(name = "last_name")
	protected String lastName;

	@Column(name = "first_name")
	protected String firstName;

	@Column(name = "middle_name")
	protected String middleName;

	@Column(name = "birth_date")
	@Temporal(TemporalType.DATE)
	protected Date birthDate;

	@Column(name = "email")
	protected String email;

	@Column(name = "username")
	protected String userName;

	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	protected Gender gender;

	@Column(name = "password", length = 100)
	protected String password;

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
	@JoinColumn(name="institution_id")
	protected Institution institution;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="organization_id")
	protected Organization organization;

	@Column(name = "gsm_number")
	protected String gsmPhoneNumber;

	@Column(name = "u_type")
	protected String userType;

	@Column(name = "employeeId")
	protected String employeeId;

	@Column(name = "national_id")
	protected String nationalId;

	//Relationships

	@ManyToMany(fetch=FetchType.EAGER, targetEntity = Profile.class)
	@JoinTable(name = "user_profile",
			joinColumns = { @JoinColumn(name = "user_id") },
			inverseJoinColumns = { @JoinColumn(name = "profile_id") })
	protected Collection<Profile> profiles = new HashSet<Profile>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "buyer", fetch = FetchType.LAZY)
    protected Collection<AbstractPayment> userInvoices = new HashSet<>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "seller", fetch = FetchType.LAZY)
    protected Collection<AbstractPayment> userReceipts = new HashSet<AbstractPayment>();

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
	}
*/
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
