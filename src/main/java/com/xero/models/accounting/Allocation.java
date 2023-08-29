/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** Allocation */
public class Allocation {
  StringUtil util = new StringUtil();

  @JsonProperty("AllocationID")
  private UUID allocationID;

  @JsonProperty("Invoice")
  private Invoice invoice;

  @JsonProperty("Overpayment")
  private Overpayment overpayment;

  @JsonProperty("Prepayment")
  private Prepayment prepayment;

  @JsonProperty("CreditNote")
  private CreditNote creditNote;

  @JsonProperty("Amount")
  private Double amount;

  @JsonProperty("Date")
  private String date;

  @JsonProperty("IsDeleted")
  private Boolean isDeleted;

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * Xero generated unique identifier
   *
   * @param allocationID UUID
   * @return Allocation
   */
  public Allocation allocationID(UUID allocationID) {
    this.allocationID = allocationID;
    return this;
  }

  /**
   * Xero generated unique identifier
   *
   * @return allocationID
   */
  @ApiModelProperty(value = "Xero generated unique identifier")
  /**
   * Xero generated unique identifier
   *
   * @return allocationID UUID
   */
  public UUID getAllocationID() {
    return allocationID;
  }

  /**
   * Xero generated unique identifier
   *
   * @param allocationID UUID
   */
  public void setAllocationID(UUID allocationID) {
    this.allocationID = allocationID;
  }

  /**
   * invoice
   *
   * @param invoice Invoice
   * @return Allocation
   */
  public Allocation invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

  /**
   * Get invoice
   *
   * @return invoice
   */
  @ApiModelProperty(required = true, value = "")
  /**
   * invoice
   *
   * @return invoice Invoice
   */
  public Invoice getInvoice() {
    return invoice;
  }

  /**
   * invoice
   *
   * @param invoice Invoice
   */
  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  /**
   * overpayment
   *
   * @param overpayment Overpayment
   * @return Allocation
   */
  public Allocation overpayment(Overpayment overpayment) {
    this.overpayment = overpayment;
    return this;
  }

  /**
   * Get overpayment
   *
   * @return overpayment
   */
  @ApiModelProperty(value = "")
  /**
   * overpayment
   *
   * @return overpayment Overpayment
   */
  public Overpayment getOverpayment() {
    return overpayment;
  }

  /**
   * overpayment
   *
   * @param overpayment Overpayment
   */
  public void setOverpayment(Overpayment overpayment) {
    this.overpayment = overpayment;
  }

  /**
   * prepayment
   *
   * @param prepayment Prepayment
   * @return Allocation
   */
  public Allocation prepayment(Prepayment prepayment) {
    this.prepayment = prepayment;
    return this;
  }

  /**
   * Get prepayment
   *
   * @return prepayment
   */
  @ApiModelProperty(value = "")
  /**
   * prepayment
   *
   * @return prepayment Prepayment
   */
  public Prepayment getPrepayment() {
    return prepayment;
  }

  /**
   * prepayment
   *
   * @param prepayment Prepayment
   */
  public void setPrepayment(Prepayment prepayment) {
    this.prepayment = prepayment;
  }

  /**
   * creditNote
   *
   * @param creditNote CreditNote
   * @return Allocation
   */
  public Allocation creditNote(CreditNote creditNote) {
    this.creditNote = creditNote;
    return this;
  }

  /**
   * Get creditNote
   *
   * @return creditNote
   */
  @ApiModelProperty(value = "")
  /**
   * creditNote
   *
   * @return creditNote CreditNote
   */
  public CreditNote getCreditNote() {
    return creditNote;
  }

  /**
   * creditNote
   *
   * @param creditNote CreditNote
   */
  public void setCreditNote(CreditNote creditNote) {
    this.creditNote = creditNote;
  }

  /**
   * the amount being applied to the invoice
   *
   * @param amount Double
   * @return Allocation
   */
  public Allocation amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * the amount being applied to the invoice
   *
   * @return amount
   */
  @ApiModelProperty(required = true, value = "the amount being applied to the invoice")
  /**
   * the amount being applied to the invoice
   *
   * @return amount Double
   */
  public Double getAmount() {
    return amount;
  }

  /**
   * the amount being applied to the invoice
   *
   * @param amount Double
   */
  public void setAmount(Double amount) {
    this.amount = amount;
  }

  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @param date String
   * @return Allocation
   */
  public Allocation date(String date) {
    this.date = date;
    return this;
  }

  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @return date
   */
  @ApiModelProperty(required = true, value = "the date the allocation is applied YYYY-MM-DD.")
  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @return date String
   */
  public String getDate() {
    return date;
  }
  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @return LocalDate
   */
  public LocalDate getDateAsDate() {
    if (this.date != null) {
      try {
        return util.convertStringToDate(this.date);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @param date String
   */
  public void setDate(String date) {
    this.date = date;
  }

  /**
   * the date the allocation is applied YYYY-MM-DD.
   *
   * @param date LocalDateTime
   */
  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * A flag that returns true when the allocation is succesfully deleted
   *
   * @return isDeleted
   */
  @ApiModelProperty(value = "A flag that returns true when the allocation is succesfully deleted")
  /**
   * A flag that returns true when the allocation is succesfully deleted
   *
   * @return isDeleted Boolean
   */
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @param statusAttributeString String
   * @return Allocation
   */
  public Allocation statusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
    return this;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString
   */
  @ApiModelProperty(value = "A string to indicate if a invoice status")
  /**
   * A string to indicate if a invoice status
   *
   * @return statusAttributeString String
   */
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  /**
   * A string to indicate if a invoice status
   *
   * @param statusAttributeString String
   */
  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   * @return Allocation
   */
  public Allocation validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return Allocation
   */
  public Allocation addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors List<ValidationError>
   */
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   */
  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Allocation allocation = (Allocation) o;
    return Objects.equals(this.allocationID, allocation.allocationID)
        && Objects.equals(this.invoice, allocation.invoice)
        && Objects.equals(this.overpayment, allocation.overpayment)
        && Objects.equals(this.prepayment, allocation.prepayment)
        && Objects.equals(this.creditNote, allocation.creditNote)
        && Objects.equals(this.amount, allocation.amount)
        && Objects.equals(this.date, allocation.date)
        && Objects.equals(this.isDeleted, allocation.isDeleted)
        && Objects.equals(this.statusAttributeString, allocation.statusAttributeString)
        && Objects.equals(this.validationErrors, allocation.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allocationID,
        invoice,
        overpayment,
        prepayment,
        creditNote,
        amount,
        date,
        isDeleted,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    sb.append("    allocationID: ").append(toIndentedString(allocationID)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    overpayment: ").append(toIndentedString(overpayment)).append("\n");
    sb.append("    prepayment: ").append(toIndentedString(prepayment)).append("\n");
    sb.append("    creditNote: ").append(toIndentedString(creditNote)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    statusAttributeString: ")
        .append(toIndentedString(statusAttributeString))
        .append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
