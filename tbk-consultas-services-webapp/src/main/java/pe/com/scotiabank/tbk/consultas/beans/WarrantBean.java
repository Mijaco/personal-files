
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class WarrantBean implements Serializable
{

    /**
    * 
    */
    private static final long serialVersionUID = 3656180809330556636L;

    private String ctaBt;
    private String operation;
    private String dateInit;
    private String expiration;
    private String balance;
    private String sign;
    private String coin;
    private String numberOperation;
    private String branchOffice;
    private String warrantNumber;
    private String situation;

    public WarrantBean()
    {

    }

    public WarrantBean(String trama)
    {
        setCtaBt(trama.substring(0, 9));
        setOperation(trama.substring(9, 18));
        setDateInit(trama.substring(18, 26));
        setExpiration(trama.substring(26, 34));
        setBalance(trama.substring(34, 48));
        setSign(trama.substring(48, 49));
        setCoin(trama.substring(49, 53));
        setNumberOperation(trama.substring(53, 103));
        setBranchOffice(trama.substring(103, 122));
        setWarrantNumber(trama.substring(122, 139));
        setSituation(trama.substring(139, 147));
    }

    public String getCtaBt()
    {
        return ctaBt;
    }

    public void setCtaBt(String ctaBt)
    {
        this.ctaBt = ctaBt;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getDateInit()
    {
        return dateInit;
    }

    public void setDateInit(String dateInit)
    {
        this.dateInit = dateInit;
    }

    public String getExpiration()
    {
        return expiration;
    }

    public void setExpiration(String expiration)
    {
        this.expiration = expiration;
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

    public String getCoin()
    {
        return coin;
    }

    public void setCoin(String coin)
    {
        this.coin = coin;
    }

    public String getNumberOperation()
    {
        return numberOperation;
    }

    public void setNumberOperation(String numberOperation)
    {
        this.numberOperation = numberOperation;
    }

    public String getBranchOffice()
    {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice)
    {
        this.branchOffice = branchOffice;
    }

    public String getWarrantNumber()
    {
        return warrantNumber;
    }

    public void setWarrantNumber(String warrantNumber)
    {
        this.warrantNumber = warrantNumber;
    }

    public String getSituation()
    {
        return situation;
    }

    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(ctaBt).append(operation).append(dateInit).append(expiration).append(balance).append(sign).append(coin).append(numberOperation).append(branchOffice)
                .append(warrantNumber).append(situation).toString();
    }

}
