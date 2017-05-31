package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class ProductTransaction implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String operation;
	private String payer;
	private String currency;
	private String amount;
	private String balance;
	private String account;
	private String sequence;
	private String exporterName;
	private String dateEntry;
	private String dateExpire;
	private String chargeOf;
	private String actualAmount;
	private String amountCollection;
	private String country;
	private String descriptionType;
	private String stateAffaire;
	private String consignmentDate;// fecha de remesa
	private String collectionNumber;// numero de cobranza

	public ProductTransaction(){
	    
	}
	
	public ProductTransaction(ProductTransactionBean productTransaction) {

		if (productTransaction != null) {
			operation = productTransaction.getOperation();
			payer = productTransaction.getPayer();
			currency = productTransaction.getCurrency();
			amount = productTransaction.getAmount();
			balance = productTransaction.getBalance();
			account = productTransaction.getAccount();
			sequence = productTransaction.getSequence();
			exporterName = productTransaction.getExporterName();
			dateEntry = productTransaction.getDateEntry();
			dateExpire = productTransaction.getDateExpire();
			chargeOf = productTransaction.getChargeOf();
			actualAmount = productTransaction.getAmountActual();
			amountCollection = productTransaction.getAmountCollection();
			country = String.valueOf(productTransaction.getCountry());
			descriptionType = productTransaction.getDescriptionType();
			stateAffaire = productTransaction.getStateAffaire();
			consignmentDate = productTransaction.getConsignmentDate();
			collectionNumber = productTransaction.getCollectionNumber();
		}
	}

	public ProductTransaction(String operation, String payer, String currency, String amount, String balance,
			String account, String sequence, String exporterName, String dateEntry, String dateExpire, String chargeOf,
			String actualAmount, String amountCollection, String country, String descriptionType, String stateAffaire,
			String consignmentDate, String collectionNumber) {
		
		this.operation = operation;
		this.payer = payer;
		this.currency = currency;
		this.amount = amount;
		this.balance = balance;
		this.account = account;
		this.sequence = sequence;
		this.exporterName = exporterName;
		this.dateEntry = dateEntry;
		this.dateExpire = dateExpire;
		this.chargeOf = chargeOf;
		this.actualAmount = actualAmount;
		this.amountCollection = amountCollection;
		this.country = country;
		this.descriptionType = descriptionType;
		this.stateAffaire = stateAffaire;
		this.consignmentDate = consignmentDate;
		this.collectionNumber = collectionNumber;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
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

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getExporterName() {
		return exporterName;
	}

	public void setExporterName(String exporterName) {
		this.exporterName = exporterName;
	}

	public String getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(String dateEntry) {
		this.dateEntry = dateEntry;
	}

	public String getDateExpire() {
		return dateExpire;
	}

	public void setDateExpire(String dateExpire) {
		this.dateExpire = dateExpire;
	}

	public String getChargeOf() {
		return chargeOf;
	}

	public void setChargeOf(String chargeOf) {
		this.chargeOf = chargeOf;
	}

	public String getActualAmount() {
		return actualAmount;
	}

	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getAmountCollection() {
		return amountCollection;
	}

	public void setAmountCollection(String amountCollection) {
		this.amountCollection = amountCollection;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDescriptionType() {
		return descriptionType;
	}

	public void setDescriptionType(String descriptionType) {
		this.descriptionType = descriptionType;
	}

	public String getStateAffaire() {
		return stateAffaire;
	}

	public void setStateAffaire(String stateAffaire) {
		this.stateAffaire = stateAffaire;
	}

	public String getConsignmentDate() {
		return consignmentDate;
	}

	public void setConsignmentDate(String consignmentDate) {
		this.consignmentDate = consignmentDate;
	}

	public String getCollectionNumber() {
		return collectionNumber;
	}

	public void setCollectionNumber(String collectionNumber) {
		this.collectionNumber = collectionNumber;
	}

	@Override
	public String toString() {
		return "ProductTransaction [operation=" + operation + ", payer=" + payer + ", currency=" + currency
				+ ", amount=" + amount + ", balance=" + balance + ", account=" + account + ", sequence=" + sequence
				+ ", exporterName=" + exporterName + ", dateEntry=" + dateEntry + ", dateExpire=" + dateExpire
				+ ", chargeOf=" + chargeOf + ", actualAmount=" + actualAmount + ", amountCollection=" + amountCollection
				+ ", country=" + country + ", descriptionType=" + descriptionType + ", stateAffaire=" + stateAffaire
				+ ", consignmentDate=" + consignmentDate + ", collectionNumber=" + collectionNumber + "]";
	}
	
	

}