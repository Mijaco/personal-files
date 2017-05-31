
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

//@XmlRootElement(name = "MortgageDetail", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
public class MortgageDetail implements Serializable
{

    private static final long serialVersionUID = -1938125650989930600L;
    String ctaBt;
    String operation;
    String balance;
    String sign;
    String coin;
    String lastRevision;
    String expiration;
    String filler;
    String operationName;
    String branchOffice;
    String subOperation;
    String module;
    String typeOperation;

    public MortgageDetail()
    {

    }

    public MortgageDetail(MortgageDetailBean mortgageDetail)
    {

        if (mortgageDetail != null)
        {
            ctaBt = mortgageDetail.getCtaBt();
            operation = mortgageDetail.getOperation();
            balance = mortgageDetail.getBalance();
            sign = mortgageDetail.getSign();
            coin = mortgageDetail.getCoin();
            lastRevision = mortgageDetail.getLastRevision();
            expiration = mortgageDetail.getExpiration();
            filler = mortgageDetail.getFiller();
            operationName = mortgageDetail.getOperationName();
            branchOffice = mortgageDetail.getBranchOffice();
            subOperation = mortgageDetail.getSubOperation();
            module = mortgageDetail.getModule();
            typeOperation = mortgageDetail.getTypeOperation();
        }

    }

    public MortgageDetail(String ctaBt, String operation, String balance, String sign, String coin, String lastRevision, String expiration, String filler, String operationName, String branchOffice,
            String subOperation, String module, String typeOperation)
    {

        this.ctaBt = ctaBt;
        this.operation = operation;
        this.balance = balance;
        this.sign = sign;
        this.coin = coin;
        this.lastRevision = lastRevision;
        this.expiration = expiration;
        this.filler = filler;
        this.operationName = operationName;
        this.branchOffice = branchOffice;
        this.subOperation = subOperation;
        this.module = module;
        this.typeOperation = typeOperation;
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

    public String getLastRevision()
    {
        return lastRevision;
    }

    public void setLastRevision(String lastRevision)
    {
        this.lastRevision = lastRevision;
    }

    public String getExpiration()
    {
        return expiration;
    }

    public void setExpiration(String expiration)
    {
        this.expiration = expiration;
    }

    public String getFiller()
    {
        return filler;
    }

    public void setFiller(String filler)
    {
        this.filler = filler;
    }

    public String getOperationName()
    {
        return operationName;
    }

    public void setOperationName(String operationName)
    {
        this.operationName = operationName;
    }

    public String getBranchOffice()
    {
        return branchOffice;
    }

    public void setBranchOffice(String branchOffice)
    {
        this.branchOffice = branchOffice;
    }

    public String getSubOperation()
    {
        return subOperation;
    }

    public void setSubOperation(String subOperation)
    {
        this.subOperation = subOperation;
    }

    public String getModule()
    {
        return module;
    }

    public void setModule(String module)
    {
        this.module = module;
    }

    public String getTypeOperation()
    {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation)
    {
        this.typeOperation = typeOperation;
    }

    @Override
    public String toString()
    {
        return "MortgageDetail [ctaBt=" + ctaBt + ", operation=" + operation + ", balance=" + balance + ", sign=" + sign + ", coin=" + coin + ", lastRevision=" + lastRevision + ", expiration="
                + expiration + ", filler=" + filler + ", operationName=" + operationName + ", branchOffice=" + branchOffice + ", subOperation=" + subOperation + ", module=" + module
                + ", typeOperation=" + typeOperation + "]";
    }

}
