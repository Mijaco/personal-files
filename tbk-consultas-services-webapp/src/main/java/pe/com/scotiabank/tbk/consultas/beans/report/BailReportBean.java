package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class BailReportBean implements Reportable{

    private String retornCode;
    private String operation;
    private String type;
    private String beneficiary;
    private String broadcastDate;
    private String expirationDate;
    private String money;
    private String balance;
    private String sign;
    private String guarantee;
    private String operationName;
    private String quotas;
    
    public BailReportBean()
    {

    }

    public String getRetornCode() {
        return retornCode;
    }

    public void setRetornCode(String retornCode) {
        this.retornCode = retornCode;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getBroadcastDate() {
        return broadcastDate;
    }

    public void setBroadcastDate(String broadcastDate) {
        this.broadcastDate = broadcastDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getQuotas() {
        return quotas;
    }

    public void setQuotas(String quotas) {
        this.quotas = quotas;
    }


    @Override
    public String[] getRow()
    {
        return new String[] { operation, type, beneficiary, broadcastDate, expirationDate, money, balance, guarantee, operationName, quotas };
    }

    
    

}
