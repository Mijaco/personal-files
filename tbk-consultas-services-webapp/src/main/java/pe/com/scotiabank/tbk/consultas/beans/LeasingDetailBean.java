
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class LeasingDetailBean implements Serializable
{

    private static final long serialVersionUID = 1L;

    private String pgCod;
    private String module;
    private String coin;
    private String scPap;
    private String ctaBt;
    private String subsidiary;
    private String operation;
    private String subOperation;
    private String typeOperation;
    private String amount;
    private String sign;
    private String expDate;
    private String description;

    public LeasingDetailBean()
    {

    }

    public LeasingDetailBean(String trama)
    {
        setPgCod(trama.substring(0, 3));
        setModule(trama.substring(3, 6));
        setCoin(trama.substring(6, 10));
        setScPap(trama.substring(10, 13));
        setCtaBt(trama.substring(13, 22));
        setSubsidiary(trama.substring(22, 25));
        setOperation(trama.substring(25, 34));
        setSubOperation(trama.substring(34, 37));
        setTypeOperation(trama.substring(37, 40));
        setAmount(trama.substring(40, 54));
        setSign(trama.substring(54, 55));
        setExpDate(trama.substring(55, 63));
        setDescription(trama.substring(63, 93));
    }

    public String getPgCod()
    {
        return pgCod;
    }

    public void setPgCod(String pgCod)
    {
        this.pgCod = pgCod;
    }

    public String getModule()
    {
        return module;
    }

    public void setModule(String module)
    {
        this.module = module;
    }

    public String getCoin()
    {
        return coin;
    }

    public void setCoin(String coin)
    {
        this.coin = coin;
    }

    public String getScPap()
    {
        return scPap;
    }

    public void setScPap(String scPap)
    {
        this.scPap = scPap;
    }

    public String getCtaBt()
    {
        return ctaBt;
    }

    public void setCtaBt(String ctaBt)
    {
        this.ctaBt = ctaBt;
    }

    public String getSubsidiary()
    {
        return subsidiary;
    }

    public void setSubsidiary(String subsidiary)
    {
        this.subsidiary = subsidiary;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public String getSubOperation()
    {
        return subOperation;
    }

    public void setSubOperation(String subOperation)
    {
        this.subOperation = subOperation;
    }

    public String getTypeOperation()
    {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation)
    {
        this.typeOperation = typeOperation;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getExpDate()
    {
        return expDate;
    }

    public void setExpDate(String expDate)
    {
        this.expDate = expDate;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DetalleLeasingBean [pgCod=");
        builder.append(pgCod);
        builder.append(", module=");
        builder.append(module);
        builder.append(", coin=");
        builder.append(coin);
        builder.append(", scPap=");
        builder.append(scPap);
        builder.append(", ctaBt=");
        builder.append(ctaBt);
        builder.append(", subsidiary=");
        builder.append(subsidiary);
        builder.append(", operation=");
        builder.append(operation);
        builder.append(", subOperation=");
        builder.append(subOperation);
        builder.append(", typeOperation=");
        builder.append(typeOperation);
        builder.append(", amount=");
        builder.append(amount);
        builder.append(", sign=");
        builder.append(sign);
        builder.append(", expDate=");
        builder.append(expDate);
        builder.append(", description=");
        builder.append(description);
        builder.append("]");
        return builder.toString();
    }

}
