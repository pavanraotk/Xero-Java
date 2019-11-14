/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.BankAccount;
import com.xero.models.payrollau.EmployeeStatus;
import com.xero.models.payrollau.HomeAddress;
import com.xero.models.payrollau.LeaveBalance;
import com.xero.models.payrollau.OpeningBalances;
import com.xero.models.payrollau.PayTemplate;
import com.xero.models.payrollau.SuperMembership;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Employee
 */

public class Employee {
  
  @JsonProperty("FirstName")
  private String firstName;

  
  @JsonProperty("LastName")
  private String lastName;

  
  @JsonProperty("DateOfBirth")
  private String dateOfBirth;

  
  @JsonProperty("HomeAddress")
  private HomeAddress homeAddress = null;

  
  @JsonProperty("StartDate")
  private String startDate;

  
  @JsonProperty("Title")
  private String title;

  
  @JsonProperty("MiddleNames")
  private String middleNames;

  
  @JsonProperty("Email")
  private String email;

  /**
   * The employee’s gender. See Employee Gender
   */
  public enum GenderEnum {
    N("N"),
    
    M("M"),
    
    F("F"),
    
    I("I");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  
  @JsonProperty("Gender")
  private GenderEnum gender;

  
  @JsonProperty("Phone")
  private String phone;

  
  @JsonProperty("Mobile")
  private String mobile;

  
  @JsonProperty("TwitterUserName")
  private String twitterUserName;

  
  @JsonProperty("IsAuthorisedToApproveLeave")
  private Boolean isAuthorisedToApproveLeave;

  
  @JsonProperty("IsAuthorisedToApproveTimesheets")
  private Boolean isAuthorisedToApproveTimesheets;

  
  @JsonProperty("JobTitle")
  private String jobTitle;

  
  @JsonProperty("Classification")
  private String classification;

  
  @JsonProperty("OrdinaryEarningsRateID")
  private UUID ordinaryEarningsRateID;

  
  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;

  
  @JsonProperty("EmployeeGroupName")
  private String employeeGroupName;

  
  @JsonProperty("EmployeeID")
  private UUID employeeID;

  
  @JsonProperty("TerminationDate")
  private String terminationDate;

  
  @JsonProperty("BankAccounts")
  private List<BankAccount> bankAccounts = new ArrayList<BankAccount>();

  
  @JsonProperty("PayTemplate")
  private PayTemplate payTemplate = null;

  
  @JsonProperty("OpeningBalances")
  private OpeningBalances openingBalances = null;

  
  @JsonProperty("LeaveBalances")
  private List<LeaveBalance> leaveBalances = new ArrayList<LeaveBalance>();

  
  @JsonProperty("SuperMemberships")
  private List<SuperMembership> superMemberships = new ArrayList<SuperMembership>();

  
  @JsonProperty("Status")
  private EmployeeStatus status;

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of employee
   * @return firstName
  **/
  @ApiModelProperty(example = "Karen", required = true, value = "First name of employee")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of employee
   * @return lastName
  **/
  @ApiModelProperty(example = "Jones", required = true, value = "Last name of employee")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Date of birth of the employee (YYYY-MM-DD)
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "/Date(322560000000+0000)/", required = true, value = "Date of birth of the employee (YYYY-MM-DD)")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Employee homeAddress(HomeAddress homeAddress) {
    this.homeAddress = homeAddress;
    return this;
  }

   /**
   * Get homeAddress
   * @return homeAddress
  **/
  @ApiModelProperty(required = true, value = "")
  public HomeAddress getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(HomeAddress homeAddress) {
    this.homeAddress = homeAddress;
  }

  public Employee startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date for an employee (YYYY-MM-DD)
   * @return startDate
  **/
  @ApiModelProperty(example = "/Date(320284900000+0000)/", value = "Start date for an employee (YYYY-MM-DD)")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Employee title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the employee
   * @return title
  **/
  @ApiModelProperty(example = "Mrs", value = "Title of the employee")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Employee middleNames(String middleNames) {
    this.middleNames = middleNames;
    return this;
  }

   /**
   * Middle name(s) of the employee
   * @return middleNames
  **/
  @ApiModelProperty(example = "Adena", value = "Middle name(s) of the employee")
  public String getMiddleNames() {
    return middleNames;
  }

  public void setMiddleNames(String middleNames) {
    this.middleNames = middleNames;
  }

  public Employee email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address for the employee
   * @return email
  **/
  @ApiModelProperty(example = "developer@me.com", value = "The email address for the employee")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Employee gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The employee’s gender. See Employee Gender
   * @return gender
  **/
  @ApiModelProperty(example = "F", value = "The employee’s gender. See Employee Gender")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Employee phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Employee phone number
   * @return phone
  **/
  @ApiModelProperty(example = "415-555-1212", value = "Employee phone number")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Employee mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Employee mobile number
   * @return mobile
  **/
  @ApiModelProperty(example = "415-234-5678", value = "Employee mobile number")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Employee twitterUserName(String twitterUserName) {
    this.twitterUserName = twitterUserName;
    return this;
  }

   /**
   * Employee’s twitter name
   * @return twitterUserName
  **/
  @ApiModelProperty(example = "xeroapi", value = "Employee’s twitter name")
  public String getTwitterUserName() {
    return twitterUserName;
  }

  public void setTwitterUserName(String twitterUserName) {
    this.twitterUserName = twitterUserName;
  }

  public Employee isAuthorisedToApproveLeave(Boolean isAuthorisedToApproveLeave) {
    this.isAuthorisedToApproveLeave = isAuthorisedToApproveLeave;
    return this;
  }

   /**
   * Authorised to approve other employees&#39; leave requests
   * @return isAuthorisedToApproveLeave
  **/
  @ApiModelProperty(example = "false", value = "Authorised to approve other employees' leave requests")
  public Boolean getIsAuthorisedToApproveLeave() {
    return isAuthorisedToApproveLeave;
  }

  public void setIsAuthorisedToApproveLeave(Boolean isAuthorisedToApproveLeave) {
    this.isAuthorisedToApproveLeave = isAuthorisedToApproveLeave;
  }

  public Employee isAuthorisedToApproveTimesheets(Boolean isAuthorisedToApproveTimesheets) {
    this.isAuthorisedToApproveTimesheets = isAuthorisedToApproveTimesheets;
    return this;
  }

   /**
   * Authorised to approve timesheets
   * @return isAuthorisedToApproveTimesheets
  **/
  @ApiModelProperty(example = "true", value = "Authorised to approve timesheets")
  public Boolean getIsAuthorisedToApproveTimesheets() {
    return isAuthorisedToApproveTimesheets;
  }

  public void setIsAuthorisedToApproveTimesheets(Boolean isAuthorisedToApproveTimesheets) {
    this.isAuthorisedToApproveTimesheets = isAuthorisedToApproveTimesheets;
  }

  public Employee jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * JobTitle of the employee
   * @return jobTitle
  **/
  @ApiModelProperty(example = "Manager", value = "JobTitle of the employee")
  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Employee classification(String classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Employees classification
   * @return classification
  **/
  @ApiModelProperty(example = "99383", value = "Employees classification")
  public String getClassification() {
    return classification;
  }

  public void setClassification(String classification) {
    this.classification = classification;
  }

  public Employee ordinaryEarningsRateID(UUID ordinaryEarningsRateID) {
    this.ordinaryEarningsRateID = ordinaryEarningsRateID;
    return this;
  }

   /**
   * Xero unique identifier for earnings rate
   * @return ordinaryEarningsRateID
  **/
  @ApiModelProperty(value = "Xero unique identifier for earnings rate")
  public UUID getOrdinaryEarningsRateID() {
    return ordinaryEarningsRateID;
  }

  public void setOrdinaryEarningsRateID(UUID ordinaryEarningsRateID) {
    this.ordinaryEarningsRateID = ordinaryEarningsRateID;
  }

  public Employee payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

   /**
   * Xero unique identifier for payroll calendar for the employee
   * @return payrollCalendarID
  **/
  @ApiModelProperty(example = "2ee8e5cc-9835-40d5-bb18-09fdb118db9c", value = "Xero unique identifier for payroll calendar for the employee")
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
  }

  public Employee employeeGroupName(String employeeGroupName) {
    this.employeeGroupName = employeeGroupName;
    return this;
  }

   /**
   * The Employee Group allows you to report on payroll expenses and liabilities for each group of employees
   * @return employeeGroupName
  **/
  @ApiModelProperty(example = "marketing", value = "The Employee Group allows you to report on payroll expenses and liabilities for each group of employees")
  public String getEmployeeGroupName() {
    return employeeGroupName;
  }

  public void setEmployeeGroupName(String employeeGroupName) {
    this.employeeGroupName = employeeGroupName;
  }

  public Employee employeeID(UUID employeeID) {
    this.employeeID = employeeID;
    return this;
  }

   /**
   * Xero unique identifier for an Employee
   * @return employeeID
  **/
  @ApiModelProperty(example = "4ff1e5cc-9835-40d5-bb18-09fdb118db9c", value = "Xero unique identifier for an Employee")
  public UUID getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(UUID employeeID) {
    this.employeeID = employeeID;
  }

  public Employee terminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Employee Termination Date (YYYY-MM-DD)
   * @return terminationDate
  **/
  @ApiModelProperty(example = "2019-01-01", value = "Employee Termination Date (YYYY-MM-DD)")
  public String getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
  }

  public Employee bankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
    return this;
  }

  public Employee addBankAccountsItem(BankAccount bankAccountsItem) {
    if (this.bankAccounts == null) {
      this.bankAccounts = new ArrayList<BankAccount>();
    }
    this.bankAccounts.add(bankAccountsItem);
    return this;
  }

   /**
   * Get bankAccounts
   * @return bankAccounts
  **/
  @ApiModelProperty(value = "")
  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  public Employee payTemplate(PayTemplate payTemplate) {
    this.payTemplate = payTemplate;
    return this;
  }

   /**
   * Get payTemplate
   * @return payTemplate
  **/
  @ApiModelProperty(value = "")
  public PayTemplate getPayTemplate() {
    return payTemplate;
  }

  public void setPayTemplate(PayTemplate payTemplate) {
    this.payTemplate = payTemplate;
  }

  public Employee openingBalances(OpeningBalances openingBalances) {
    this.openingBalances = openingBalances;
    return this;
  }

   /**
   * Get openingBalances
   * @return openingBalances
  **/
  @ApiModelProperty(value = "")
  public OpeningBalances getOpeningBalances() {
    return openingBalances;
  }

  public void setOpeningBalances(OpeningBalances openingBalances) {
    this.openingBalances = openingBalances;
  }

  public Employee leaveBalances(List<LeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
    return this;
  }

  public Employee addLeaveBalancesItem(LeaveBalance leaveBalancesItem) {
    if (this.leaveBalances == null) {
      this.leaveBalances = new ArrayList<LeaveBalance>();
    }
    this.leaveBalances.add(leaveBalancesItem);
    return this;
  }

   /**
   * Get leaveBalances
   * @return leaveBalances
  **/
  @ApiModelProperty(value = "")
  public List<LeaveBalance> getLeaveBalances() {
    return leaveBalances;
  }

  public void setLeaveBalances(List<LeaveBalance> leaveBalances) {
    this.leaveBalances = leaveBalances;
  }

  public Employee superMemberships(List<SuperMembership> superMemberships) {
    this.superMemberships = superMemberships;
    return this;
  }

  public Employee addSuperMembershipsItem(SuperMembership superMembershipsItem) {
    if (this.superMemberships == null) {
      this.superMemberships = new ArrayList<SuperMembership>();
    }
    this.superMemberships.add(superMembershipsItem);
    return this;
  }

   /**
   * Get superMemberships
   * @return superMemberships
  **/
  @ApiModelProperty(value = "")
  public List<SuperMembership> getSuperMemberships() {
    return superMemberships;
  }

  public void setSuperMemberships(List<SuperMembership> superMemberships) {
    this.superMemberships = superMemberships;
  }

  public Employee status(EmployeeStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EmployeeStatus getStatus() {
    return status;
  }

  public void setStatus(EmployeeStatus status) {
    this.status = status;
  }

  public Employee updatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "2018-04-01T23:02:36", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public void setUpdatedDateUTC(String updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.dateOfBirth, employee.dateOfBirth) &&
        Objects.equals(this.homeAddress, employee.homeAddress) &&
        Objects.equals(this.startDate, employee.startDate) &&
        Objects.equals(this.title, employee.title) &&
        Objects.equals(this.middleNames, employee.middleNames) &&
        Objects.equals(this.email, employee.email) &&
        Objects.equals(this.gender, employee.gender) &&
        Objects.equals(this.phone, employee.phone) &&
        Objects.equals(this.mobile, employee.mobile) &&
        Objects.equals(this.twitterUserName, employee.twitterUserName) &&
        Objects.equals(this.isAuthorisedToApproveLeave, employee.isAuthorisedToApproveLeave) &&
        Objects.equals(this.isAuthorisedToApproveTimesheets, employee.isAuthorisedToApproveTimesheets) &&
        Objects.equals(this.jobTitle, employee.jobTitle) &&
        Objects.equals(this.classification, employee.classification) &&
        Objects.equals(this.ordinaryEarningsRateID, employee.ordinaryEarningsRateID) &&
        Objects.equals(this.payrollCalendarID, employee.payrollCalendarID) &&
        Objects.equals(this.employeeGroupName, employee.employeeGroupName) &&
        Objects.equals(this.employeeID, employee.employeeID) &&
        Objects.equals(this.terminationDate, employee.terminationDate) &&
        Objects.equals(this.bankAccounts, employee.bankAccounts) &&
        Objects.equals(this.payTemplate, employee.payTemplate) &&
        Objects.equals(this.openingBalances, employee.openingBalances) &&
        Objects.equals(this.leaveBalances, employee.leaveBalances) &&
        Objects.equals(this.superMemberships, employee.superMemberships) &&
        Objects.equals(this.status, employee.status) &&
        Objects.equals(this.updatedDateUTC, employee.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, dateOfBirth, homeAddress, startDate, title, middleNames, email, gender, phone, mobile, twitterUserName, isAuthorisedToApproveLeave, isAuthorisedToApproveTimesheets, jobTitle, classification, ordinaryEarningsRateID, payrollCalendarID, employeeGroupName, employeeID, terminationDate, bankAccounts, payTemplate, openingBalances, leaveBalances, superMemberships, status, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    homeAddress: ").append(toIndentedString(homeAddress)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    middleNames: ").append(toIndentedString(middleNames)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    twitterUserName: ").append(toIndentedString(twitterUserName)).append("\n");
    sb.append("    isAuthorisedToApproveLeave: ").append(toIndentedString(isAuthorisedToApproveLeave)).append("\n");
    sb.append("    isAuthorisedToApproveTimesheets: ").append(toIndentedString(isAuthorisedToApproveTimesheets)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    ordinaryEarningsRateID: ").append(toIndentedString(ordinaryEarningsRateID)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    employeeGroupName: ").append(toIndentedString(employeeGroupName)).append("\n");
    sb.append("    employeeID: ").append(toIndentedString(employeeID)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    bankAccounts: ").append(toIndentedString(bankAccounts)).append("\n");
    sb.append("    payTemplate: ").append(toIndentedString(payTemplate)).append("\n");
    sb.append("    openingBalances: ").append(toIndentedString(openingBalances)).append("\n");
    sb.append("    leaveBalances: ").append(toIndentedString(leaveBalances)).append("\n");
    sb.append("    superMemberships: ").append(toIndentedString(superMemberships)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

