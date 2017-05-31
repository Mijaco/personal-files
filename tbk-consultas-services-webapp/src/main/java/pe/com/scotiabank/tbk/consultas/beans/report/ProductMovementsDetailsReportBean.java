
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class ProductMovementsDetailsReportBean implements Reportable
{

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
    private String consignmentDate;
    private String collectionNumber;

    public ProductMovementsDetailsReportBean()
    {

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

    public String getActualAmount()
    {
        return actualAmount;
    }

    public void setActualAmount(String actualAmount)
    {
        this.actualAmount = actualAmount;
    }

    public String getAmountCollection()
    {
        return amountCollection;
    }

    public void setAmountCollection(String amountCollection)
    {
        this.amountCollection = amountCollection;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
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

    @Override
    public String[] getRow()
    {
        return new String[] { amount, collectionNumber, sequence, exporterName, dateEntry, dateExpire, operation, payer, currency, actualAmount, amountCollection,
                chargeOf, balance, account, country, descriptionType, stateAffaire, consignmentDate };
    }

}
