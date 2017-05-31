
package pe.com.scotiabank.tbk.consultas.beans;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;

@XmlElement(value = "DataPaymentReceived")
public class DataPaymentReceived implements Reportable
{
    private String namePayer;
    private String contract;
    private String numberOrder;
    private String numberSequence;
    private String datePayment;
    private String typePayment;
    private String status;
    private String money;
    private String accountARA;
    private String amount;
    private String signAmount;
    private String accountCodeInt;
    private String numberCheck;
    public String getNamePayer()
    {
        return namePayer;
    }

    public void setNamePayer(String namePayer)
    {
        this.namePayer = namePayer;
    }

    public String getContract()
    {
        return contract;
    }

    public void setContract(String contract)
    {
        this.contract = contract;
    }

    public String getNumberOrder()
    {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder)
    {
        this.numberOrder = numberOrder;
    }

    public String getNumberSequence()
    {
        return numberSequence;
    }

    public void setNumberSequence(String numberSequence)
    {
        this.numberSequence = numberSequence;
    }

    public String getDatePayment()
    {
        return datePayment;
    }

    public void setDatePayment(String datePayment)
    {
        this.datePayment = datePayment;
    }

    public String getTypePayment()
    {
        return typePayment;
    }

    public void setTypePayment(String typePayment)
    {
        this.typePayment = typePayment;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getMoney()
    {
        return money;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }

    public String getAccountARA()
    {
        return accountARA;
    }

    public void setAccountARA(String accountARA)
    {
        this.accountARA = accountARA;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getSignAmount()
    {
        return signAmount;
    }

    public void setSignAmount(String signAmount)
    {
        this.signAmount = signAmount;
    }

    public String getAccountCodeInt()
    {
        return accountCodeInt;
    }

    public void setAccountCodeInt(String accountCodeInt)
    {
        this.accountCodeInt = accountCodeInt;
    }

    public DataPaymentReceived(String namePayer, String contract, String numberOrder, String numberSequence,
            String datePayment, String typePayment, String status, String money, String accountARA, String amount,
            String signAmount, String accountCodeInt)
    {
        super();
        this.namePayer = namePayer;
        this.contract = contract;
        this.numberOrder = numberOrder;
        this.numberSequence = numberSequence;
        this.datePayment = datePayment;
        this.typePayment = typePayment;
        this.status = status;
        this.money = money;
        this.accountARA = accountARA;
        this.amount = amount;
        this.signAmount = signAmount;
        this.accountCodeInt = accountCodeInt;
    }

    public DataPaymentReceived()
    {
        super();
        this.accountCodeInt = String.valueOf(new char[20]).replace('\0', ' ');
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("QueryPaymentReceived [namePayer=");
        builder.append(namePayer);
        builder.append(", contract=");
        builder.append(contract);
        builder.append(", numberOrder=");
        builder.append(numberOrder);
        builder.append(", numberSequence=");
        builder.append(numberSequence);
        builder.append(", datePayment=");
        builder.append(datePayment);
        builder.append(", typePayment=");
        builder.append(typePayment);
        builder.append(", status=");
        builder.append(status);
        builder.append(", money=");
        builder.append(money);
        builder.append(", accountARA=");
        builder.append(accountARA);
        builder.append(", amount=");
        builder.append(amount);
        builder.append(", signAmount=");
        builder.append(signAmount);
        builder.append(", accountCodeInt=");
        builder.append(accountCodeInt);
        builder.append(", numberCheck=");
        builder.append(numberCheck);
        builder.append("]");
        return builder.toString();
    }

    public String getNumberCheck()
    {
        return numberCheck;
    }

    public void setNumberCheck(String numberCheck)
    {
        this.numberCheck = numberCheck;
    }

    @Override
    public String[] getRow()
    {
        return new String[]{accountARA,datePayment,namePayer,numberOrder,money,amount,numberCheck,typePayment,status};
    }

}
