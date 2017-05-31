package pe.com.scotiabank.tbk.consultas.beans;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;
@XmlElement(value = "DataPaymentsIssued")
public class DataPaymentsIssued implements Reportable{
    private String namePayer;
    private String contract;
    private String numberOrden;
    private String numberSequence;
    private String datePayment;
    private String typePayment;
    private String status;
    private String money;
    private String accountARA;
    private String amount;
    private String signAmount;
    private String typeDocumentBeneficiaryID;
    private String numberDocumentBeneficiaryID;
    private String literalTypeOrder;
    private String acronymTypePayment;
    private String codeCCI;
    private String numberCheck;
    public String getNamePayer() {
        return namePayer;
    }
    public void setNamePayer(String namePayer) {
        this.namePayer = namePayer;
    }
    public String getContract() {
        return contract;
    }
    public void setContract(String contract) {
        this.contract = contract;
    }
    public String getNumberOrden() {
        return numberOrden;
    }
    public void setNumberOrden(String numberOrden) {
        this.numberOrden = numberOrden;
    }
    public String getNumberSequence() {
        return numberSequence;
    }
    public void setNumberSequence(String numberSequence) {
        this.numberSequence = numberSequence;
    }
    public String getDatePayment() {
        return datePayment;
    }
    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }
    public String getTypePayment() {
        return typePayment;
    }
    public void setTypePayment(String typePayment) {
        this.typePayment = typePayment;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    public String getAccountARA() {
        return accountARA;
    }
    public void setAccountARA(String accountARA) {
        this.accountARA = accountARA;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getSignAmount() {
        return signAmount;
    }
    public void setSignAmount(String signAmount) {
        this.signAmount = signAmount;
    }
    public String getTypeDocumentBeneficiaryID() {
        return typeDocumentBeneficiaryID;
    }
    public void setTypeDocumentBeneficiaryID(String typeDocumentBeneficiaryID) {
        this.typeDocumentBeneficiaryID = typeDocumentBeneficiaryID;
    }
    public String getNumberDocumentBeneficiaryID() {
        return numberDocumentBeneficiaryID;
    }
    public void setNumberDocumentBeneficiaryID(String numberDocumentBeneficiaryID) {
        this.numberDocumentBeneficiaryID = numberDocumentBeneficiaryID;
    }
    public String getLiteralTypeOrder() {
        return literalTypeOrder;
    }
    public void setLiteralTypeOrder(String literalTypeOrder) {
        this.literalTypeOrder = literalTypeOrder;
    }
    public String getAcronymTypePayment() {
        return acronymTypePayment;
    }
    public void setAcronymTypePayment(String acronymTypePayment) {
        this.acronymTypePayment = acronymTypePayment;
    }
    public String getCodeCCI() {
        return codeCCI;
    }
    public void setCodeCCI(String codeCCI) {
        this.codeCCI = codeCCI;
    }
    public DataPaymentsIssued(String namePayer, String contract, String numberOrden, String numberSequence,
            String datePayment, String typePayment, String status, String money, String accountARA, String amount,
            String signAmount, String typeDocumentBeneficiaryID, String numberDocumentBeneficiaryID,
            String literalTypeOrder, String acronymTypePayment, String codeCCI) {
        super();
        this.namePayer = namePayer;
        this.contract = contract;
        this.numberOrden = numberOrden;
        this.numberSequence = numberSequence;
        this.datePayment = datePayment;
        this.typePayment = typePayment;
        this.status = status;
        this.money = money;
        this.accountARA = accountARA;
        this.amount = amount;
        this.signAmount = signAmount;
        this.typeDocumentBeneficiaryID = typeDocumentBeneficiaryID;
        this.numberDocumentBeneficiaryID = numberDocumentBeneficiaryID;
        this.literalTypeOrder = literalTypeOrder;
        this.acronymTypePayment = acronymTypePayment;
        this.codeCCI = codeCCI;
    }
    public DataPaymentsIssued() {
        super();
    }
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("QueryPaymentsIssued [namePayer=");
        builder.append(namePayer);
        builder.append(", contract=");
        builder.append(contract);
        builder.append(", numberOrden=");
        builder.append(numberOrden);
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
        builder.append(", typeDocumentBeneficiaryID=");
        builder.append(typeDocumentBeneficiaryID);
        builder.append(", numberDocumentBeneficiaryID=");
        builder.append(numberDocumentBeneficiaryID);
        builder.append(", literalTypeOrder=");
        builder.append(literalTypeOrder);
        builder.append(", acronymTypePayment=");
        builder.append(acronymTypePayment);
        builder.append(", codeCCI=");
        builder.append(codeCCI);
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
        return new String[]{accountARA,datePayment,numberOrden,numberCheck,numberDocumentBeneficiaryID,namePayer,money,amount,status};
    }
    
}
