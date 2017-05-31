
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class AdvanceAccountBean implements Serializable
{
    private static final long serialVersionUID = 3656180809330556636L;

    private String operation;
    private String money;
    private String montImport;
    private String sign;
    private String dateInit;
    private String dateExpiration;
    private String type;
    private String number;
    private String advance;
    private String situation;
    private String place;
    private String dateAmortization;
    private String dateFund;
    private String pay;
    private String endorsement;
    private String commission;
    private String importAmortized;
    private String dateValor;

    public AdvanceAccountBean()
    {

    }

    public AdvanceAccountBean(String trama)
    {
        setOperation(trama.substring(0, 9));
        setMoney(trama.substring(9, 13));
        setMontImport(trama.substring(13, 27));
        setSign(trama.substring(27, 28));
        setDateInit(trama.substring(28, 36));
        setDateExpiration(trama.substring(36, 44));
        setType(trama.substring(44, 59));
        setNumber(trama.substring(59, 64));
        setAdvance(trama.substring(64, 68));
        setSituation(trama.substring(68, 80));
        setPlace(trama.substring(80, 83));
        setDateAmortization(trama.substring(83, 91));
        setDateFund(trama.substring(91, 99));
        setPay(trama.substring(99, 103));
        setEndorsement(trama.substring(103, 116));
        setCommission(trama.substring(116, 121));
        setImportAmortized(trama.substring(121, 136));
        setDateValor(trama.substring(136, 144));
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getMoney()
    {
        return money;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }

    public String getMontImport()
    {
        return montImport;
    }

    public void setMontImport(String montImport)
    {
        this.montImport = montImport;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getDateInit()
    {
        return dateInit;
    }

    public void setDateInit(String dateInit)
    {
        this.dateInit = dateInit;
    }

    public String getDateExpiration()
    {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration)
    {
        this.dateExpiration = dateExpiration;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getAdvance()
    {
        return advance;
    }

    public void setAdvance(String advance)
    {
        this.advance = advance;
    }

    public String getSituation()
    {
        return situation;
    }

    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public String getPlace()
    {
        return place;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

    public String getDateAmortization()
    {
        return dateAmortization;
    }

    public void setDateAmortization(String dateAmortization)
    {
        this.dateAmortization = dateAmortization;
    }

    public String getDateFund()
    {
        return dateFund;
    }

    public void setDateFund(String dateFund)
    {
        this.dateFund = dateFund;
    }

    public String getPay()
    {
        return pay;
    }

    public void setPay(String pay)
    {
        this.pay = pay;
    }

    public String getEndorsement()
    {
        return endorsement;
    }

    public void setEndorsement(String endorsement)
    {
        this.endorsement = endorsement;
    }

    public String getCommission()
    {
        return commission;
    }

    public void setCommission(String commission)
    {
        this.commission = commission;
    }

    public String getImportAmortized()
    {
        return importAmortized;
    }

    public void setImportAmortized(String importAmortized)
    {
        this.importAmortized = importAmortized;
    }

    public String getDateValor()
    {
        return dateValor;
    }

    public void setDateValor(String dateValor)
    {
        this.dateValor = dateValor;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(operation).append(money).append(montImport).append(sign).append(dateInit).append(dateExpiration).append(type).append(number).append(advance).append(situation)
                .append(place).append(dateAmortization).append(dateFund).append(pay).append(endorsement).append(commission).append(importAmortized).append(dateValor).toString();
    }

}
