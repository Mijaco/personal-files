package pe.com.scotiabank.tbk.consultas.beans;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;

//import pe.com.scotiabank.tbk.util.base.Reportable;

@XmlElement(value = "PaymentsFromAbroadBean")
public class PaymentsFromAbroadBean implements Reportable {

	/** Key for pagination */
	
	private String typeInquiry;
	private String dateProcessRegistry;
	private String accountBtReceivedPayment;
	private String operation;
	private String subOperation;
	private String correlative;
	
	/** ./ Key for pagination */
	
	private String currency;	
	private String documentAmount;
	private String amountSign;
	private String payer;
	private String beneficiary;
	private String transmitterBank;
	private String reference;
	private String accountOfPayment;
	
	
	//formaters Values
	private String dateProcessRegistryFormater;
	private String symbolCurrency;
	private String documentAmountFormat;
	
	public PaymentsFromAbroadBean(){
		
	}

	public PaymentsFromAbroadBean(String output) {
		
		this.typeInquiry = output.substring(0, 2);
		this.dateProcessRegistry = output.substring(2, 10);
		this.accountBtReceivedPayment = output.substring(10, 19);
		this.operation = output.substring(19, 28);
		this.subOperation = output.substring(28, 31);
		this.correlative = output.substring(31, 40);
		this.currency = output.substring(40, 44);
		this.documentAmount = output.substring(44, 58);
		this.amountSign = this.documentAmount.substring(13, 14); //output.substring(57, 58);
		this.payer = output.substring(58, 98);
		this.beneficiary = output.substring(98, 138);
		this.transmitterBank = output.substring(138, 147);
		this.reference = output.substring(147, 165);
		this.accountOfPayment = output.substring(165, 182);

	}

	public String getTypeInquiry() {
		return typeInquiry;
	}

	public void setTypeInquiry(String typeInquiry) {
		this.typeInquiry = typeInquiry;
	}

	public String getDateProcessRegistry() {
		return dateProcessRegistry;
	}

	public void setDateProcessRegistry(String dateProcessRegistry) {
		this.dateProcessRegistry = dateProcessRegistry;
	}

	public String getAccountBtReceivedPayment() {
		return accountBtReceivedPayment;
	}

	public void setAccountBtReceivedPayment(String accountBtReceivedPayment) {
		this.accountBtReceivedPayment = accountBtReceivedPayment;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getSubOperation() {
		return subOperation;
	}

	public void setSubOperation(String subOperation) {
		this.subOperation = subOperation;
	}

	public String getCorrelative() {
		return correlative;
	}

	public void setCorrelative(String correlative) {
		this.correlative = correlative;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDocumentAmount() {
		return documentAmount;
	}

	public void setDocumentAmount(String documentAmount) {
		this.documentAmount = documentAmount;
	}

	public String getAmountSign() {
		return amountSign;
	}

	public void setAmountSign(String amountSign) {
		this.amountSign = amountSign;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getTransmitterBank() {
		return transmitterBank;
	}

	public void setTransmitterBank(String transmitterBank) {
		this.transmitterBank = transmitterBank;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getAccountOfPayment() {
		return accountOfPayment;
	}

	public void setAccountOfPayment(String accountOfPayment) {
		this.accountOfPayment = accountOfPayment;
	}
	
	/* Formaters Values */
	
	public String getDateProcessRegistryFormater() {
		return dateProcessRegistryFormater;
	}

	public void setDateProcessRegistryFormater(String dateProcessRegistryFormater) {
		this.dateProcessRegistryFormater = dateProcessRegistryFormater;
	}

	public String getSymbolCurrency() {
		return symbolCurrency;
	}

	public void setSymbolCurrency(String symbolCurrency) {
		this.symbolCurrency = symbolCurrency;
	}

	public String getDocumentAmountFormat() {
		return documentAmountFormat;
	}

	public void setDocumentAmountFormat(String documentAmountFormat) {
		this.documentAmountFormat = documentAmountFormat;
	}

	@Override
	public String toString(){
		return new StringBuilder().append(typeInquiry)
				                  .append(",")	
				                  .append(dateProcessRegistry)
				                  .append(",")
				                  .append(accountBtReceivedPayment)
				                  .append(",")
				                  .append(operation)
				                  .append(",")
				                  .append(subOperation)
				                  .append(",")
				                  .append(correlative)
				                  .append(",")
				                  .append(currency)
				                  .append(",")
				                  .append(documentAmount)
				                  .append(",")
				                  .append(amountSign)
				                  .append(",")
				                  .append(payer)
				                  .append(",")
				                  .append(beneficiary)
				                  .append(",")
				                  .append(transmitterBank)
				                  .append(",")
				                  .append(reference)
				                  .append(",")
				                  .append(accountOfPayment)				                 
				                  .append(",")
				                  .append(dateProcessRegistryFormater)
				                  .append(",")
				                  .append(symbolCurrency)
				                  .append(",")
				                  .append(documentAmountFormat)
				                 
				                  .toString();
	}

	@Override
	public String[] getRow() {
		
		return new String[] {accountBtReceivedPayment, dateProcessRegistryFormater, payer, reference, symbolCurrency, documentAmountFormat};
		
	}

}
