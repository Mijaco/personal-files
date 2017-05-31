
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class Guarantee implements Serializable
{

    private static final long serialVersionUID = -142474831045291529L;
    private String ctaBt;
    private String operation;
    private String dateInit;
    private String expiration;
    private String balance;
    private String sign;
    private String coin;
    private String numberOperation;
    private String nameGuarantor;
    private String filler;

    public Guarantee()
    {

    }

    public Guarantee(GuaranteeBean guaranteeBean)
    {
        if (guaranteeBean != null)
        {
            ctaBt = guaranteeBean.getCtaBt();
            operation = guaranteeBean.getOperation();
            dateInit = guaranteeBean.getDateInit();
            expiration = guaranteeBean.getExpiration();
            balance = guaranteeBean.getBalance();
            sign = guaranteeBean.getSign();
            coin = guaranteeBean.getCoin();
            numberOperation = guaranteeBean.getNumberOperation();
            nameGuarantor = guaranteeBean.getNameGuarantor();
            filler = guaranteeBean.getFiller();
        }
    }

    public Guarantee(String ctaBt, String operation, String dateInit, String expiration, String balance, String sign, String coin, String numberOperation, String nameGuarantor, String filler)
    {
        super();
        this.ctaBt = ctaBt;
        this.operation = operation;
        this.dateInit = dateInit;
        this.expiration = expiration;
        this.balance = balance;
        this.sign = sign;
        this.coin = coin;
        this.numberOperation = numberOperation;
        this.nameGuarantor = nameGuarantor;
        this.filler = filler;
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

    public String getNameGuarantor()
    {
        return nameGuarantor;
    }

    public void setNameGuarantor(String nameGuarantor)
    {
        this.nameGuarantor = nameGuarantor;
    }

    public String getFiller()
    {
        return filler;
    }

    public void setFiller(String filler)
    {
        this.filler = filler;
    }

    @Override
    public String toString()
    {
        return "Guarantee [ctaBt=" + ctaBt + ", operation=" + operation + ", dateInit=" + dateInit + ", expiration=" + expiration + ", balance=" + balance + ", sign=" + sign + ", coin=" + coin
                + ", numberOperation=" + numberOperation + ", nameGuarantor=" + nameGuarantor + ", filler=" + filler + "]";
    }

    
}
