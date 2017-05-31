
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class AdvanceAccount implements Serializable
{

    private static final long serialVersionUID = -9210974244010763301L;
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

    public AdvanceAccount()
    {

    }

    public AdvanceAccount(AdvanceAccountBean advanceAccountBean)
    {
        operation = advanceAccountBean.getOperation();
        money = advanceAccountBean.getMoney();
        montImport = advanceAccountBean.getMontImport();
        sign = advanceAccountBean.getSign();
        dateInit = advanceAccountBean.getDateInit();
        dateExpiration = advanceAccountBean.getDateExpiration();
        type = advanceAccountBean.getType();
        number = advanceAccountBean.getNumber();
        advance = advanceAccountBean.getAdvance();
        situation = advanceAccountBean.getSituation();
        place = advanceAccountBean.getPlace();
        dateAmortization = advanceAccountBean.getDateAmortization();
        dateFund = advanceAccountBean.getDateFund();
        pay = advanceAccountBean.getPay();
        endorsement = advanceAccountBean.getEndorsement();
        commission = advanceAccountBean.getCommission();
        importAmortized = advanceAccountBean.getImportAmortized();
        dateValor = advanceAccountBean.getDateValor();

    }

    public AdvanceAccount(String operation, String money, String montImport, String sign, String dateInit, String dateExpiration, String type, String number, String advance, String situation,
            String place, String dateAmortization, String dateFund, String pay, String endorsement, String commission, String importAmortized, String dateValor)
    {
        this.operation = operation;
        this.money = money;
        this.montImport = montImport;
        this.sign = sign;
        this.dateInit = dateInit;
        this.dateExpiration = dateExpiration;
        this.type = type;
        this.number = number;
        this.advance = advance;
        this.situation = situation;
        this.place = place;
        this.dateAmortization = dateAmortization;
        this.dateFund = dateFund;
        this.pay = pay;
        this.endorsement = endorsement;
        this.commission = commission;
        this.importAmortized = importAmortized;
        this.dateValor = dateValor;
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

    @Override
    public String toString()
    {
        return "AdvanceAccount [operation=" + operation + ", money=" + money + ", montImport=" + montImport + ", sign=" + sign + ", dateInit=" + dateInit + ", dateExpiration=" + dateExpiration
                + ", type=" + type + ", number=" + number + ", advance=" + advance + ", situation=" + situation + ", place=" + place + ", dateAmortization=" + dateAmortization + ", dateFund="
                + dateFund + ", pay=" + pay + ", endorsement=" + endorsement + ", commission=" + commission + ", importAmortized=" + importAmortized + ", dateValor=" + dateValor + "]";
    }
}
