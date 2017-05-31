
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class DepositReportBean implements Reportable
{

    private String retornCode;
    private String clientCode;
    private String account;
    private String situation;
    private String classType;
    private String numberDays;
    private String date;
    private String money;
    private String balance;
    private String sign;
    private String expirationDate;
    private String rate;
    private String interestDaily;
    private String interest;
    private String interestPrevious;
    private String type;
    private String previousAmount;
    private String previousNumberDays;

    public DepositReportBean()
    {

    }

    public String getRetornCode()
    {
        return retornCode;
    }

    public void setRetornCode(String retornCode)
    {
        this.retornCode = retornCode;
    }

    public String getClientCode()
    {
        return clientCode;
    }

    public void setClientCode(String clientCode)
    {
        this.clientCode = clientCode;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getSituation()
    {
        return situation;
    }

    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public String getClassType()
    {
        return classType;
    }

    public void setClassType(String classType)
    {
        this.classType = classType;
    }

    public String getNumberDays()
    {
        return numberDays;
    }

    public void setNumberDays(String numberDays)
    {
        this.numberDays = numberDays;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getMoney()
    {
        return money;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }

    public String getBalance()
    {
        return balance;
    }

    public void setBalance(String balance)
    {
        this.balance = balance;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public String getRate()
    {
        return rate;
    }

    public void setRate(String rate)
    {
        this.rate = rate;
    }

    public String getInterestDaily()
    {
        return interestDaily;
    }

    public void setInterestDaily(String interestDaily)
    {
        this.interestDaily = interestDaily;
    }

    public String getInterest()
    {
        return interest;
    }

    public void setInterest(String interest)
    {
        this.interest = interest;
    }

    public String getInterestPrevious()
    {
        return interestPrevious;
    }

    public void setInterestPrevious(String interestPrevious)
    {
        this.interestPrevious = interestPrevious;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getPreviousAmount()
    {
        return previousAmount;
    }

    public void setPreviousAmount(String previousAmount)
    {
        this.previousAmount = previousAmount;
    }

    public String getPreviousNumberDays()
    {
        return previousNumberDays;
    }

    public void setPreviousNumberDays(String previousNumberDays)
    {
        this.previousNumberDays = previousNumberDays;
    }

    @Override
    public String[] getRow()

    {
        return new String[] { clientCode, account, situation, classType, String.valueOf(Integer.parseInt(numberDays)), date, money, balance, expirationDate, rate, interest, type, classType };
    }

}
