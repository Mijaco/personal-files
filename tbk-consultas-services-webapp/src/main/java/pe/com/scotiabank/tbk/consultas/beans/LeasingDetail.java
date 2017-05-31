
package pe.com.scotiabank.tbk.consultas.beans;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LeasingDetail implements Serializable
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

    public LeasingDetail()
    {

    }

    public LeasingDetail(LeasingDetailBean detalleLeasingBeans)
    {
        pgCod = detalleLeasingBeans.getPgCod();
        module = detalleLeasingBeans.getModule();
        coin = detalleLeasingBeans.getCoin();
        scPap = detalleLeasingBeans.getScPap();
        ctaBt = detalleLeasingBeans.getCtaBt();
        subsidiary = detalleLeasingBeans.getSubsidiary();
        operation = detalleLeasingBeans.getOperation();
        subOperation = detalleLeasingBeans.getSubOperation();
        typeOperation = detalleLeasingBeans.getTypeOperation();
        amount = detalleLeasingBeans.getAmount();
        sign = detalleLeasingBeans.getSign();
        expDate = detalleLeasingBeans.getExpDate();
        description = detalleLeasingBeans.getDescription();
    }

    public LeasingDetail(String pgCod, String module, String coin, String scPap, String ctaBt, String subsidiary,
            String operation, String subOperation, String typeOperation, String amount, String sign, String expDate,
            String description)
    {
        super();
        this.pgCod = pgCod;
        this.module = module;
        this.coin = coin;
        this.scPap = scPap;
        this.ctaBt = ctaBt;
        this.subsidiary = subsidiary;
        this.operation = operation;
        this.subOperation = subOperation;
        this.typeOperation = typeOperation;
        this.amount = amount;
        this.sign = sign;
        this.expDate = expDate;
        this.description = description;
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
        return "DetalleLeasing [pgCod=" + pgCod + ", module=" + module + ", coin=" + coin + ", scPap=" + scPap
                + ", ctaBt=" + ctaBt + ", subsidiary=" + subsidiary + ", operation=" + operation + ", subOperation="
                + subOperation + ", typeOperation=" + typeOperation + ", amount=" + amount + ", sign=" + sign
                + ", expDate=" + expDate + ", description=" + description + "]";
    }

}
