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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * LeaveType
 */

public class LeaveType {
  
  @JsonProperty("Name")
  private String name;

  
  @JsonProperty("TypeOfUnits")
  private String typeOfUnits;

  
  @JsonProperty("IsPaidLeave")
  private Boolean isPaidLeave;

  
  @JsonProperty("ShowOnPayslip")
  private Boolean showOnPayslip;

  
  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  
  @JsonProperty("NormalEntitlement")
  private Float normalEntitlement;

  
  @JsonProperty("LeaveLoadingRate")
  private Float leaveLoadingRate;

  
  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  public LeaveType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the earnings rate (max length &#x3D; 100)
   * @return name
  **/
  @ApiModelProperty(example = "PTO", value = "Name of the earnings rate (max length = 100)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeaveType typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

   /**
   * The type of units by which leave entitlements are normally tracked. These are typically the same as the type of units used for the employee’s ordinary earnings rate
   * @return typeOfUnits
  **/
  @ApiModelProperty(example = "Hours", value = "The type of units by which leave entitlements are normally tracked. These are typically the same as the type of units used for the employee’s ordinary earnings rate")
  public String getTypeOfUnits() {
    return typeOfUnits;
  }

  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }

  public LeaveType isPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
    return this;
  }

   /**
   * Set this to indicate that an employee will be paid when taking this type of leave
   * @return isPaidLeave
  **/
  @ApiModelProperty(example = "true", value = "Set this to indicate that an employee will be paid when taking this type of leave")
  public Boolean getIsPaidLeave() {
    return isPaidLeave;
  }

  public void setIsPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
  }

  public LeaveType showOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
    return this;
  }

   /**
   * Set this if you want a balance for this leave type to be shown on your employee’s payslips
   * @return showOnPayslip
  **/
  @ApiModelProperty(example = "true", value = "Set this if you want a balance for this leave type to be shown on your employee’s payslips")
  public Boolean getShowOnPayslip() {
    return showOnPayslip;
  }

  public void setShowOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
  }

  public LeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

   /**
   * Xero identifier
   * @return leaveTypeID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  public LeaveType normalEntitlement(Float normalEntitlement) {
    this.normalEntitlement = normalEntitlement;
    return this;
  }

   /**
   * The number of units the employee is entitled to each year
   * @return normalEntitlement
  **/
  @ApiModelProperty(example = "152.0", value = "The number of units the employee is entitled to each year")
  public Float getNormalEntitlement() {
    return normalEntitlement;
  }

  public void setNormalEntitlement(Float normalEntitlement) {
    this.normalEntitlement = normalEntitlement;
  }

  public LeaveType leaveLoadingRate(Float leaveLoadingRate) {
    this.leaveLoadingRate = leaveLoadingRate;
    return this;
  }

   /**
   * Enter an amount here if your organisation pays an additional percentage on top of ordinary earnings when your employees take leave (typically 17.5%)
   * @return leaveLoadingRate
  **/
  @ApiModelProperty(example = "12.0", value = "Enter an amount here if your organisation pays an additional percentage on top of ordinary earnings when your employees take leave (typically 17.5%)")
  public Float getLeaveLoadingRate() {
    return leaveLoadingRate;
  }

  public void setLeaveLoadingRate(Float leaveLoadingRate) {
    this.leaveLoadingRate = leaveLoadingRate;
  }

   /**
   * Last modified timestamp
   * @return updatedDateUTC
  **/
  @ApiModelProperty(example = "2018-04-01T23:02:36", value = "Last modified timestamp")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveType leaveType = (LeaveType) o;
    return Objects.equals(this.name, leaveType.name) &&
        Objects.equals(this.typeOfUnits, leaveType.typeOfUnits) &&
        Objects.equals(this.isPaidLeave, leaveType.isPaidLeave) &&
        Objects.equals(this.showOnPayslip, leaveType.showOnPayslip) &&
        Objects.equals(this.leaveTypeID, leaveType.leaveTypeID) &&
        Objects.equals(this.normalEntitlement, leaveType.normalEntitlement) &&
        Objects.equals(this.leaveLoadingRate, leaveType.leaveLoadingRate) &&
        Objects.equals(this.updatedDateUTC, leaveType.updatedDateUTC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeOfUnits, isPaidLeave, showOnPayslip, leaveTypeID, normalEntitlement, leaveLoadingRate, updatedDateUTC);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    isPaidLeave: ").append(toIndentedString(isPaidLeave)).append("\n");
    sb.append("    showOnPayslip: ").append(toIndentedString(showOnPayslip)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    normalEntitlement: ").append(toIndentedString(normalEntitlement)).append("\n");
    sb.append("    leaveLoadingRate: ").append(toIndentedString(leaveLoadingRate)).append("\n");
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

