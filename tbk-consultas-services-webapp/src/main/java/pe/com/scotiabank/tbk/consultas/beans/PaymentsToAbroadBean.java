package pe.com.scotiabank.tbk.consultas.beans;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;

@XmlElement(value = "PaymentsToAbroadBean")
public class PaymentsToAbroadBean implements Reportable {

	private String agreement;
	private String numberOrder;
	private String dateOrder;
	private String currency;
	private String amount;
	private String referenceNumber;
	private String beneficiary;
	private String document;

	public PaymentsToAbroadBean() {

	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public String getNumberOrder() {
		return numberOrder;
	}

	public void setNumberOrder(String numberOrder) {
		this.numberOrder = numberOrder;
	}

	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		//builder.append("[agreement=");
		builder.append(agreement);
		builder.append(",");
		//builder.append(", numberOrder=");
		builder.append(numberOrder);
		builder.append(",");
		//builder.append(", dateOrder=");
		builder.append(dateOrder);
		builder.append(",");
		//builder.append(", currency=");
		builder.append(currency);
		builder.append(",");
		//builder.append(", amount=");
		builder.append(amount);
		builder.append(",");
		//builder.append(", referenceNumber=");
		builder.append(referenceNumber);
		builder.append(",");
		//builder.append(", beneficiary=");
		builder.append(beneficiary);
		builder.append(",");
		//builder.append(", document=");
		builder.append(document);
		//builder.append("]");
		return builder.toString();
	}

	@Override
	public String[] getRow() {
		
		return new String[] { referenceNumber, numberOrder, dateOrder, beneficiary, currency, amount, document};
		
	}

}
