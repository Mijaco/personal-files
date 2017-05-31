
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class ProductTransactionBean implements Serializable
{

    private static final long serialVersionUID = -6322047842613661763L;

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
    private String amountActual;
    private String amountCollection;
    private char country;
    private String descriptionType;
    private String stateAffaire;
    private String consignmentDate;// fecha de remesa
    private String collectionNumber;// numero de cobranza
    private String amountSign;
    private String balanceSign;

    public ProductTransactionBean()
    {

    }

    public ProductTransactionBean(String trama)
    {

        setOperation(trama.substring(0, 9));
        setPayer(trama.substring(9, 24));
        setCurrency(trama.substring(24, 28));

        setAmount(trama.substring(28, 42));
        setAmountSign(trama.substring(42, 43));

        setBalanceSign(trama.substring(57, 58));
        setBalance(trama.substring(43, 57));

        setAccount(trama.substring(58, 67));
        setSequence(trama.substring(67, 70));
        setExporterName(trama.substring(70, 100));
        setDateEntry(trama.substring(100, 108));
        setDateExpire(trama.substring(108, 116));
        setAmountActual(trama.substring(116, 126));
        setAmountCollection(trama.substring(126, 136));
        setChargeOf(trama.substring(136, 146));
        setCountry(trama.charAt(146));
        setDescriptionType(trama.substring(147, 177));
        setStateAffaire(trama.substring(177, 199));
        setConsignmentDate(trama.substring(199, 207));
        setCollectionNumber(trama.substring(207, 216));

    }

    public ProductTransactionBean(String operation, String payer, String currency, String amount, String balance,
            String account, String sequence, String exporterName, String dateEntry, String dateExpire, String chargeOf,
            String amountActual, String amountCollection, char country, String descriptionType, String stateAffaire,
            String consignmentDate, String collectionNumber)
    {
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
        this.amountActual = amountActual;
        this.amountCollection = amountCollection;
        this.chargeOf = chargeOf;
        this.country = country;
        this.descriptionType = descriptionType;
        this.stateAffaire = stateAffaire;
        this.consignmentDate = consignmentDate;
        this.collectionNumber = collectionNumber;
    }

    public String getAmountSign()
    {
        return amountSign;
    }

    public void setAmountSign(String amountSign)
    {
        this.amountSign = amountSign;
    }

    public String getBalanceSign()
    {
        return balanceSign;
    }

    public void setBalanceSign(String balanceSign)
    {
        this.balanceSign = balanceSign;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getPayer()
    {
        return payer;
    }

    public void setPayer(String payer)
    {
        this.payer = payer;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getBalance()
    {
        return balance;
    }

    public void setBalance(String balance)
    {
        this.balance = balance;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getSequence()
    {
        return sequence;
    }

    public void setSequence(String sequence)
    {
        this.sequence = sequence;
    }

    public String getExporterName()
    {
        return exporterName;
    }

    public void setExporterName(String exporterName)
    {
        this.exporterName = exporterName;
    }

    public String getDateEntry()
    {
        return dateEntry;
    }

    public void setDateEntry(String dateEntry)
    {
        this.dateEntry = dateEntry;
    }

    public String getDateExpire()
    {
        return dateExpire;
    }

    public void setDateExpire(String dateExpire)
    {
        this.dateExpire = dateExpire;
    }

    public String getChargeOf()
    {
        return chargeOf;
    }

    public void setChargeOf(String chargeOf)
    {
        this.chargeOf = chargeOf;
    }

    public String getAmountActual()
    {
        return amountActual;
    }

    public void setAmountActual(String amountActual)
    {
        this.amountActual = amountActual;
    }

    public String getAmountCollection()
    {
        return amountCollection;
    }

    public void setAmountCollection(String amountCollection)
    {
        this.amountCollection = amountCollection;
    }

    public char getCountry()
    {
        return country;
    }

    public void setCountry(char country)
    {
        this.country = country;
    }

    public String getDescriptionType()
    {
        return descriptionType;
    }

    public void setDescriptionType(String descriptionType)
    {
        this.descriptionType = descriptionType;
    }

    public String getStateAffaire()
    {
        return stateAffaire;
    }

    public void setStateAffaire(String stateAffaire)
    {
        this.stateAffaire = stateAffaire;
    }

    public String getConsignmentDate()
    {
        return consignmentDate;
    }

    public void setConsignmentDate(String consignmentDate)
    {
        this.consignmentDate = consignmentDate;
    }

    public String getCollectionNumber()
    {
        return collectionNumber;
    }

    public void setCollectionNumber(String collectionNumber)
    {
        this.collectionNumber = collectionNumber;
    }

}
