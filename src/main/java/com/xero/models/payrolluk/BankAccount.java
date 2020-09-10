/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BankAccount */
public class BankAccount {
  StringUtil util = new StringUtil();

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("accountNumber")
  private String accountNumber;

  @JsonProperty("sortCode")
  private String sortCode;

  public BankAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Bank account name (max length &#x3D; 32)
   *
   * @return accountName
   */
  @ApiModelProperty(required = true, value = "Bank account name (max length = 32)")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BankAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Bank account number (digits only; max length &#x3D; 8)
   *
   * @return accountNumber
   */
  @ApiModelProperty(required = true, value = "Bank account number (digits only; max length = 8)")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BankAccount sortCode(String sortCode) {
    this.sortCode = sortCode;
    return this;
  }

  /**
   * Bank account sort code (6 digits)
   *
   * @return sortCode
   */
  @ApiModelProperty(required = true, value = "Bank account sort code (6 digits)")
  public String getSortCode() {
    return sortCode;
  }

  public void setSortCode(String sortCode) {
    this.sortCode = sortCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.accountName, bankAccount.accountName)
        && Objects.equals(this.accountNumber, bankAccount.accountNumber)
        && Objects.equals(this.sortCode, bankAccount.sortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountNumber, sortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccount {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    sortCode: ").append(toIndentedString(sortCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
