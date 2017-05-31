
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class MortgageDetailBean implements Serializable
{
    /**
     * 
     */
    private static final long serialVersionUID = 3656180809330556636L;
    
    private String ctaBt;
    private String operation;
    private String balance;
    private String sign;
    private String coin;
    private String lastRevision;
    private String expiration;
    private String filler;
    private String operationName;
    private String branchOffice;
    private String subOperation;
    private String module;
    private String typeOperation;

    public MortgageDetailBean()
    {

    }

    public MortgageDetailBean(String trama)
    {
        setCtaBt(trama.substring(0, 9));
        setOperation(trama.substring(9, 18));
        setBalance(trama.substring(18, 32));
        setSign(trama.substring(32, 33));
        setCoin(trama.substring(33, 37));
        setLastRevision(trama.substring(37, 45));
        setExpiration(trama.substring(45, 53));
        setFiller(trama.substring(53, 73));
        setOperationName(trama.substring(73, 123));
        setBranchOffice(trama.substring(123, 126));
        setSubOperation(trama.substring(126, 129));
        setModule(trama.substring(129, 132));
        setTypeOperation(trama.substring(132, 135));
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

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
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

    public String getSubOperation()
    {
        return subOperation;
    }

    public void setSubOperation(String subOperation)
    {
        this.subOperation = subOperation;
    }

    public String getCoin()
    {
        return coin;
    }

    public void setCoin(String coin)
    {
        this.coin = coin;
    }

    public String getBalance()
    {
        return balance;
    }

    public void setBalance(String balance)
    {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(ctaBt).append(operation).append(balance).append(sign).append(coin)
                .append(lastRevision).append(expiration).append(filler).append(operationName).append(branchOffice)
                .append(subOperation).append(module).append(typeOperation).toString();
    }
}
