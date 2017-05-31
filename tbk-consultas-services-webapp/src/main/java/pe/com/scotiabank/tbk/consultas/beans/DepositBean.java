
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class DepositBean implements Serializable
{

    private static final long serialVersionUID = 7988405147604326613L;
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

    public DepositBean()
    {

    }

    public DepositBean(String trama)
    {

        setRetornCode(trama.substring(0, 1));
        setClientCode(trama.substring(0, 1));
        setAccount(trama.substring(0, 1));
        setSituation(trama.substring(0, 1));
        setClassType(trama.substring(0, 1));
        setNumberDays(trama.substring(0, 1));
        setDate(trama.substring(0, 1));
        setMoney(trama.substring(0, 1));
        setBalance(trama.substring(0, 1));
        setSign(trama.substring(0, 1));
        setExpirationDate(trama.substring(0, 1));
        setRate(trama.substring(0, 1));
        setInterestDaily(trama.substring(0, 1));
        setInterest(trama.substring(0, 1));
        setInterestPrevious(trama.substring(0, 1));
        setType(trama.substring(0, 1));
        setPreviousAmount(trama.substring(0, 1));
        setPreviousNumberDays(trama.substring(0, 1));
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
    public String toString()
    {
        return "DepositBean [retornCode=" + retornCode + ", clientCode=" + clientCode + ", account=" + account + ", situation=" + situation + ", classType=" + classType + ", numberDays=" + numberDays
                + ", date=" + date + ", money=" + money + ", balance=" + balance + ", sign=" + sign + ", expirationDate=" + expirationDate + ", rate=" + rate + ", interestDaily=" + interestDaily
                + ", interest=" + interest + ", interestPrevious=" + interestPrevious + ", type=" + type + ", previousAmount=" + previousAmount + ", previousNumberDays=" + previousNumberDays + "]";
    }

}
