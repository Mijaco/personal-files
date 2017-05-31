
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import pe.com.scotiabank.tbk.consultas.trama.output.TBEDOutput;

public class ProductOperationDetail implements Serializable
{

    private static final long serialVersionUID = 1300631953903636806L;
    private String operation;
    private String operationType;
    private String transmitterBank;
    private String transmitterBankName;
    private String emissionDate1;
    private String referenceTransmitter;
    private String expireDate1;
    private String lceciuneg;
    private String payer;
    private String benefited;
    private String currency;
    private String amountCommitted;
    private String balanceUtilization;
    private String balanceCommitted;
    private String lcenatmon;
    private String maxPayment;
    private String minPayment;
    private String nomree;
    private String lcebcree;
    private String correspondentName;
    private String language;
    private String languageName;
    private String entryDate;

    public ProductOperationDetail()
    {

    }

    public ProductOperationDetail(TBEDOutput tbedOutput)
    {

        operation = tbedOutput.getOperation();
        operationType = tbedOutput.getOperationType();
        transmitterBank = tbedOutput.getTransmitterBank();
        transmitterBankName = tbedOutput.getTransmitterBankName();
        emissionDate1 = tbedOutput.getEmissionDate1();
        referenceTransmitter = tbedOutput.getReferenceTransmitter();
        expireDate1 = tbedOutput.getExpireDate1();
        lceciuneg = tbedOutput.getLceciuneg();
        payer = tbedOutput.getPayer();
        benefited = tbedOutput.getBenefited();
        currency = tbedOutput.getCurrency();
        amountCommitted = tbedOutput.getAmountCommitted();
        balanceUtilization = tbedOutput.getBalanceUtilization();
        balanceCommitted = tbedOutput.getBalanceCommitted();
        lcenatmon = tbedOutput.getLcenatmon();
        maxPayment = tbedOutput.getMaxPayment();
        minPayment = tbedOutput.getMinPayment();
        nomree = tbedOutput.getNomree();
        lcebcree = tbedOutput.getLcebcree();
        correspondentName = tbedOutput.getCorrespondentName();
        language = tbedOutput.getLanguage();
        languageName = tbedOutput.getLanguage();
        entryDate = tbedOutput.getEntryDate();

    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getOperationType()
    {
        return operationType;
    }

    public void setOperationType(String operationType)
    {
        this.operationType = operationType;
    }

    public String getTransmitterBank()
    {
        return transmitterBank;
    }

    public void setTransmitterBank(String transmitterBank)
    {
        this.transmitterBank = transmitterBank;
    }

    public String getTransmitterBankName()
    {
        return transmitterBankName;
    }

    public void setTransmitterBankName(String transmitterBankName)
    {
        this.transmitterBankName = transmitterBankName;
    }

    public String getEmissionDate1()
    {
        return emissionDate1;
    }

    public void setEmissionDate1(String emissionDate1)
    {
        this.emissionDate1 = emissionDate1;
    }

    public String getReferenceTransmitter()
    {
        return referenceTransmitter;
    }

    public void setReferenceTransmitter(String referenceTransmitter)
    {
        this.referenceTransmitter = referenceTransmitter;
    }

    public String getExpireDate1()
    {
        return expireDate1;
    }

    public void setExpireDate1(String expireDate1)
    {
        this.expireDate1 = expireDate1;
    }

    public String getLceciuneg()
    {
        return lceciuneg;
    }

    public void setLceciuneg(String lceciuneg)
    {
        this.lceciuneg = lceciuneg;
    }

    public String getPayer()
    {
        return payer;
    }

    public void setPayer(String payer)
    {
        this.payer = payer;
    }

    public String getBenefited()
    {
        return benefited;
    }

    public void setBenefited(String benefited)
    {
        this.benefited = benefited;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getAmountCommitted()
    {
        return amountCommitted;
    }

    public void setAmountCommitted(String amountCommitted)
    {
        this.amountCommitted = amountCommitted;
    }

    public String getBalanceUtilization()
    {
        return balanceUtilization;
    }

    public void setBalanceUtilization(String balanceUtilization)
    {
        this.balanceUtilization = balanceUtilization;
    }

    public String getBalanceCommitted()
    {
        return balanceCommitted;
    }

    public void setBalanceCommitted(String balanceCommitted)
    {
        this.balanceCommitted = balanceCommitted;
    }

    public String getLcenatmon()
    {
        return lcenatmon;
    }

    public void setLcenatmon(String lcenatmon)
    {
        this.lcenatmon = lcenatmon;
    }

    public String getMaxPayment()
    {
        return maxPayment;
    }

    public void setMaxPayment(String maxPayment)
    {
        this.maxPayment = maxPayment;
    }

    public String getMinPayment()
    {
        return minPayment;
    }

    public void setMinPayment(String minPayment)
    {
        this.minPayment = minPayment;
    }

    public String getNomree()
    {
        return nomree;
    }

    public void setNomree(String nomree)
    {
        this.nomree = nomree;
    }

    public String getLcebcree()
    {
        return lcebcree;
    }

    public void setLcebcree(String lcebcree)
    {
        this.lcebcree = lcebcree;
    }

    public String getCorrespondentName()
    {
        return correspondentName;
    }

    public void setCorrespondentName(String correspondentName)
    {
        this.correspondentName = correspondentName;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public String getLanguageName()
    {
        return languageName;
    }

    public void setLanguageName(String languageName)
    {
        this.languageName = languageName;
    }

    public String getEntryDate()
    {
        return entryDate;
    }

    public void setEntryDate(String entryDate)
    {
        this.entryDate = entryDate;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ProductOperationDetail [operation=");
        builder.append(operation);
        builder.append(", operationType=");
        builder.append(operationType);
        builder.append(", transmitterBank=");
        builder.append(transmitterBank);
        builder.append(", transmitterBankName=");
        builder.append(transmitterBankName);
        builder.append(", emissionDate1=");
        builder.append(emissionDate1);
        builder.append(", referenceTransmitter=");
        builder.append(referenceTransmitter);
        builder.append(", expireDate1=");
        builder.append(expireDate1);
        builder.append(", lceciuneg=");
        builder.append(lceciuneg);
        builder.append(", payer=");
        builder.append(payer);
        builder.append(", benefited=");
        builder.append(benefited);
        builder.append(", currency=");
        builder.append(currency);
        builder.append(", amountCommitted=");
        builder.append(amountCommitted);
        builder.append(", balanceUtilization=");
        builder.append(balanceUtilization);
        builder.append(", balanceCommitted=");
        builder.append(balanceCommitted);
        builder.append(", lcenatmon=");
        builder.append(lcenatmon);
        builder.append(", maxPayment=");
        builder.append(maxPayment);
        builder.append(", minPayment=");
        builder.append(minPayment);
        builder.append(", nomree=");
        builder.append(nomree);
        builder.append(", lcebcree=");
        builder.append(lcebcree);
        builder.append(", correspondentName=");
        builder.append(correspondentName);
        builder.append(", language=");
        builder.append(language);
        builder.append(", languageName=");
        builder.append(languageName);
        builder.append(", entryDate=");
        builder.append(entryDate);
        builder.append("]");
        return builder.toString();
    }

}
