
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Warrant implements Serializable
{

    private static final long serialVersionUID = 2672458192250754985L;
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

    public Warrant()
    {

    }

    public Warrant(WarrantBean mortgageDetail)
    {
        if (mortgageDetail != null)
        {
            ctaBt = mortgageDetail.getCtaBt();
            operation = mortgageDetail.getOperation();
            dateInit = mortgageDetail.getDateInit();
            expiration = mortgageDetail.getExpiration();
            balance = mortgageDetail.getBalance();
            sign = mortgageDetail.getSign();
            coin = mortgageDetail.getCoin();
            numberOperation = mortgageDetail.getNumberOperation();
            branchOffice = mortgageDetail.getBranchOffice();
            warrantNumber = mortgageDetail.getWarrantNumber();
            situation = mortgageDetail.getSituation();
        }
    }

    public Warrant(String ctaBt, String operation, String dateInit, String expiration, String balance, String sign, String coin, String numberOperation, String branchOffice, String warrantNumber,
            String situation)
    {

        this.ctaBt = ctaBt;
        this.operation = operation;
        this.dateInit = dateInit;
        this.expiration = expiration;
        this.balance = balance;
        this.sign = sign;
        this.coin = coin;
        this.numberOperation = numberOperation;
        this.branchOffice = branchOffice;
        this.warrantNumber = warrantNumber;
        this.situation = situation;
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

    @Override
    public String toString()
    {
        return "Warrant [ctaBt=" + ctaBt + ", operation=" + operation + ", dateInit=" + dateInit + ", expiration=" + expiration + ", balance=" + balance + ", sign=" + sign + ", coin=" + coin
                + ", numberOperation=" + numberOperation + ", branchOffice=" + branchOffice + ", warrantNumber=" + warrantNumber + ", situation=" + situation + "]";
    }

}
