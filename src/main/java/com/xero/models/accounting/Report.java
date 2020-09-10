/*
 * Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.2.13
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/** Report */
public class Report {
  StringUtil util = new StringUtil();

  @JsonProperty("ReportID")
  private String reportID;

  @JsonProperty("ReportName")
  private String reportName;
  /** See Prepayment Types */
  public enum ReportTypeEnum {
    AGEDPAYABLESBYCONTACT("AgedPayablesByContact");

    private String value;

    ReportTypeEnum(String value) {
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
    public static ReportTypeEnum fromValue(String value) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ReportType")
  private ReportTypeEnum reportType;

  @JsonProperty("ReportTitle")
  private String reportTitle;

  @JsonProperty("ReportDate")
  private String reportDate;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("Contacts")
  private List<TenNinetyNineContact> contacts = new ArrayList<TenNinetyNineContact>();

  public Report reportID(String reportID) {
    this.reportID = reportID;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return reportID
   */
  @ApiModelProperty(value = "See Prepayment Types")
  public String getReportID() {
    return reportID;
  }

  public void setReportID(String reportID) {
    this.reportID = reportID;
  }

  public Report reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return reportName
   */
  @ApiModelProperty(value = "See Prepayment Types")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public Report reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return reportType
   */
  @ApiModelProperty(value = "See Prepayment Types")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public Report reportTitle(String reportTitle) {
    this.reportTitle = reportTitle;
    return this;
  }

  /**
   * See Prepayment Types
   *
   * @return reportTitle
   */
  @ApiModelProperty(value = "See Prepayment Types")
  public String getReportTitle() {
    return reportTitle;
  }

  public void setReportTitle(String reportTitle) {
    this.reportTitle = reportTitle;
  }

  public Report reportDate(String reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * Date of report
   *
   * @return reportDate
   */
  @ApiModelProperty(value = "Date of report")
  public String getReportDate() {
    return reportDate;
  }

  public void setReportDate(String reportDate) {
    this.reportDate = reportDate;
  }

  /**
   * Updated Date
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1573755038314)/", value = "Updated Date")
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  public Report contacts(List<TenNinetyNineContact> contacts) {
    this.contacts = contacts;
    return this;
  }

  public Report addContactsItem(TenNinetyNineContact contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<TenNinetyNineContact>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

  /**
   * Get contacts
   *
   * @return contacts
   */
  @ApiModelProperty(value = "")
  public List<TenNinetyNineContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<TenNinetyNineContact> contacts) {
    this.contacts = contacts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.reportID, report.reportID)
        && Objects.equals(this.reportName, report.reportName)
        && Objects.equals(this.reportType, report.reportType)
        && Objects.equals(this.reportTitle, report.reportTitle)
        && Objects.equals(this.reportDate, report.reportDate)
        && Objects.equals(this.updatedDateUTC, report.updatedDateUTC)
        && Objects.equals(this.contacts, report.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        reportID, reportName, reportType, reportTitle, reportDate, updatedDateUTC, contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    reportID: ").append(toIndentedString(reportID)).append("\n");
    sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    reportTitle: ").append(toIndentedString(reportTitle)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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
