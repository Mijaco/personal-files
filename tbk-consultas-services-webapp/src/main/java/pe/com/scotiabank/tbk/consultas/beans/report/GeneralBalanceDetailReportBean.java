
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class GeneralBalanceDetailReportBean implements Reportable
{

    private String number;
    private String advance;
    private String situation;
    private String place;
    private String dateExpiration;
    private String money;
    private String montImport;
    private String dateValor;
    private String dateInit;
    private String dateAmortization;
    private String dateFund;
    private String pay;
    private String endorsement;
    private String commission;
    private String importAmortized;
    private String sign;
    private String type;
    
    public GeneralBalanceDetailReportBean()
    {
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

    public String getDateExpiration()
    {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration)
    {
        this.dateExpiration = dateExpiration;
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

    public String getDateValor()
    {
        return dateValor;
    }

    public void setDateValor(String dateValor)
    {
        this.dateValor = dateValor;
    }

    public String getDateInit()
    {
        return dateInit;
    }

    public void setDateInit(String dateInit)
    {
        this.dateInit = dateInit;
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


    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    @Override
    public String[] getRow()
    {
        return new String[] { number, advance, situation, place, dateExpiration, money, montImport, dateValor, dateInit, dateAmortization, dateFund, pay, endorsement, commission, importAmortized, sign, type};
    }
}
