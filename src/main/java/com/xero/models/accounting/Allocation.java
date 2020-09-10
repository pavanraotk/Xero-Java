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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.ZoneId;

/** Allocation */
public class Allocation {
  StringUtil util = new StringUtil();

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

  @JsonProperty("StatusAttributeString")
  private String statusAttributeString;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();

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
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

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
  public Overpayment getOverpayment() {
    return overpayment;
  }

  public void setOverpayment(Overpayment overpayment) {
    this.overpayment = overpayment;
  }

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
  public Prepayment getPrepayment() {
    return prepayment;
  }

  public void setPrepayment(Prepayment prepayment) {
    this.prepayment = prepayment;
  }

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
  public CreditNote getCreditNote() {
    return creditNote;
  }

  public void setCreditNote(CreditNote creditNote) {
    this.creditNote = creditNote;
  }

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
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

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
  public String getDate() {
    return date;
  }

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

  public void setDate(String date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = date.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.date = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

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
  public String getStatusAttributeString() {
    return statusAttributeString;
  }

  public void setStatusAttributeString(String statusAttributeString) {
    this.statusAttributeString = statusAttributeString;
  }

  public Allocation validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

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
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

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
    return Objects.equals(this.invoice, allocation.invoice)
        && Objects.equals(this.overpayment, allocation.overpayment)
        && Objects.equals(this.prepayment, allocation.prepayment)
        && Objects.equals(this.creditNote, allocation.creditNote)
        && Objects.equals(this.amount, allocation.amount)
        && Objects.equals(this.date, allocation.date)
        && Objects.equals(this.statusAttributeString, allocation.statusAttributeString)
        && Objects.equals(this.validationErrors, allocation.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        invoice,
        overpayment,
        prepayment,
        creditNote,
        amount,
        date,
        statusAttributeString,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Allocation {\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    overpayment: ").append(toIndentedString(overpayment)).append("\n");
    sb.append("    prepayment: ").append(toIndentedString(prepayment)).append("\n");
    sb.append("    creditNote: ").append(toIndentedString(creditNote)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
