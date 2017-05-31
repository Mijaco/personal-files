
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TB15Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class MovementDetail implements Serializable
{

    private static final long serialVersionUID = 656075938110101455L;
    private String movementTime;
    private String branchoffice;
    private String checkNumber;
    private String atmTerminal;
    private String transactionNumber;
    private String detailOperation;
    private String typeChange;
    private String amountConverted;
    private String signAmountConverted;
    private String chargeAccount;
    private String mortgageAccount;
    private String ruc;
    private String institution;
    private String establishment;
    private String exchangeRate;
    private String receipt;
    private String emailPagum;
    private String signCurrencyCargo;
    private String cashDeposit;
    private String cashDepositSign;
    private String bankDeposit;
    private String SignDepositoBanco;
    private String bankDepositOther;
    private String bankDepositSign;
    private String NameDrawer;
    private String nameBank;
    private String Reason;
    private String Amount;
    private String supply;
    private String reference;
    private String studentCode;
    private String studentName;
    private String payer;
    private String beneficiary;
    private String typeService;
    private String customerService;
    private String creditCardNumber;
    private String PhoneNumberRefill;
    private String VirtualOrderNumber;
    private String Tribute;
    private String resolution;
    private String prepaidCardKey;
    private String accountTypePosition;
    private String AccountType;
    private String signCurrencyCompost;
    private String destinationAccount;
    private String literalSubscription;
    private String concept;
    private String dateActualOperation;
    private String keyCheckBank;
    private String keyCheckDate;
    private String keyCheckAccount;
    private String keyCheckCheck;
    private String keyCorrelativeLetter;
    private String keyAccountBtCorrelative;
    private String NumberLetter;
    private String transferStatus;
    private String transferStatus2;

    public MovementDetail()
    {

    }

    public String getMovementTime()
    {
        return movementTime;
    }

    public void setMovementTime(String movementTime)
    {
        this.movementTime = movementTime;
    }

    public String getBranchoffice()
    {
        return branchoffice;
    }

    public void setBranchoffice(String branchoffice)
    {
        this.branchoffice = branchoffice;
    }

    public String getCheckNumber()
    {
        return checkNumber;
    }

    public void setCheckNumber(String checkNumber)
    {
        this.checkNumber = checkNumber;
    }

    public String getAtmTerminal()
    {
        return atmTerminal;
    }

    public void setAtmTerminal(String atmTerminal)
    {
        this.atmTerminal = atmTerminal;
    }

    public String getTransactionNumber()
    {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber)
    {
        this.transactionNumber = transactionNumber;
    }

    public String getDetailOperation()
    {
        return detailOperation;
    }

    public void setDetailOperation(String detailOperation)
    {
        this.detailOperation = detailOperation;
    }

    public String getTypeChange()
    {
        return typeChange;
    }

    public void setTypeChange(String typeChange)
    {
        this.typeChange = typeChange;
    }

    public String getAmountConverted()
    {
        return amountConverted;
    }

    public void setAmountConverted(String amountConverted)
    {
        this.amountConverted = amountConverted;
    }

    public String getSignAmountConverted()
    {
        return signAmountConverted;
    }

    public void setSignAmountConverted(String signAmountConverted)
    {
        this.signAmountConverted = signAmountConverted;
    }

    public String getChargeAccount()
    {
        return chargeAccount;
    }

    public void setChargeAccount(String chargeAccount)
    {
        this.chargeAccount = chargeAccount;
    }

    public String getMortgageAccount()
    {
        return mortgageAccount;
    }

    public void setMortgageAccount(String mortgageAccount)
    {
        this.mortgageAccount = mortgageAccount;
    }

    public String getRuc()
    {
        return ruc;
    }

    public void setRuc(String ruc)
    {
        this.ruc = ruc;
    }

    public String getInstitution()
    {
        return institution;
    }

    public void setInstitution(String institution)
    {
        this.institution = institution;
    }

    public String getEstablishment()
    {
        return establishment;
    }

    public void setEstablishment(String establishment)
    {
        this.establishment = establishment;
    }

    public String getExchangeRate()
    {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    public String getReceipt()
    {
        return receipt;
    }

    public void setReceipt(String receipt)
    {
        this.receipt = receipt;
    }

    public String getEmailPagum()
    {
        return emailPagum;
    }

    public void setEmailPagum(String emailPagum)
    {
        this.emailPagum = emailPagum;
    }

    public String getSignCurrencyCargo()
    {
        return signCurrencyCargo;
    }

    public void setSignCurrencyCargo(String signCurrencyCargo)
    {
        this.signCurrencyCargo = signCurrencyCargo;
    }

    public String getCashDeposit()
    {
        return cashDeposit;
    }

    public void setCashDeposit(String cashDeposit)
    {
        this.cashDeposit = cashDeposit;
    }

    public String getCashDepositSign()
    {
        return cashDepositSign;
    }

    public void setCashDepositSign(String cashDepositSign)
    {
        this.cashDepositSign = cashDepositSign;
    }

    public String getBankDeposit()
    {
        return bankDeposit;
    }

    public void setBankDeposit(String bankDeposit)
    {
        this.bankDeposit = bankDeposit;
    }

    public String getSignDepositoBanco()
    {
        return SignDepositoBanco;
    }

    public void setSignDepositoBanco(String signDepositoBanco)
    {
        SignDepositoBanco = signDepositoBanco;
    }

    public String getBankDepositOther()
    {
        return bankDepositOther;
    }

    public void setBankDepositOther(String bankDepositOther)
    {
        this.bankDepositOther = bankDepositOther;
    }

    public String getBankDepositSign()
    {
        return bankDepositSign;
    }

    public void setBankDepositSign(String bankDepositSign)
    {
        this.bankDepositSign = bankDepositSign;
    }

    public String getNameDrawer()
    {
        return NameDrawer;
    }

    public void setNameDrawer(String nameDrawer)
    {
        NameDrawer = nameDrawer;
    }

    public String getNameBank()
    {
        return nameBank;
    }

    public void setNameBank(String nameBank)
    {
        this.nameBank = nameBank;
    }

    public String getReason()
    {
        return Reason;
    }

    public void setReason(String reason)
    {
        Reason = reason;
    }

    public String getAmount()
    {
        return Amount;
    }

    public void setAmount(String amount)
    {
        Amount = amount;
    }

    public String getSupply()
    {
        return supply;
    }

    public void setSupply(String supply)
    {
        this.supply = supply;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getStudentCode()
    {
        return studentCode;
    }

    public void setStudentCode(String studentCode)
    {
        this.studentCode = studentCode;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getPayer()
    {
        return payer;
    }

    public void setPayer(String payer)
    {
        this.payer = payer;
    }

    public String getBeneficiary()
    {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary)
    {
        this.beneficiary = beneficiary;
    }

    public String getTypeService()
    {
        return typeService;
    }

    public void setTypeService(String typeService)
    {
        this.typeService = typeService;
    }

    public String getCustomerService()
    {
        return customerService;
    }

    public void setCustomerService(String customerService)
    {
        this.customerService = customerService;
    }

    public String getCreditCardNumber()
    {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }

    public String getPhoneNumberRefill()
    {
        return PhoneNumberRefill;
    }

    public void setPhoneNumberRefill(String phoneNumberRefill)
    {
        PhoneNumberRefill = phoneNumberRefill;
    }

    public String getVirtualOrderNumber()
    {
        return VirtualOrderNumber;
    }

    public void setVirtualOrderNumber(String virtualOrderNumber)
    {
        VirtualOrderNumber = virtualOrderNumber;
    }

    public String getTribute()
    {
        return Tribute;
    }

    public void setTribute(String tribute)
    {
        Tribute = tribute;
    }

    public String getResolution()
    {
        return resolution;
    }

    public void setResolution(String resolution)
    {
        this.resolution = resolution;
    }

    public String getPrepaidCardKey()
    {
        return prepaidCardKey;
    }

    public void setPrepaidCardKey(String prepaidCardKey)
    {
        this.prepaidCardKey = prepaidCardKey;
    }

    public String getAccountTypePosition()
    {
        return accountTypePosition;
    }

    public void setAccountTypePosition(String accountTypePosition)
    {
        this.accountTypePosition = accountTypePosition;
    }

    public String getAccountType()
    {
        return AccountType;
    }

    public void setAccountType(String accountType)
    {
        AccountType = accountType;
    }

    public String getSignCurrencyCompost()
    {
        return signCurrencyCompost;
    }

    public void setSignCurrencyCompost(String signCurrencyCompost)
    {
        this.signCurrencyCompost = signCurrencyCompost;
    }

    public String getDestinationAccount()
    {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount)
    {
        this.destinationAccount = destinationAccount;
    }

    public String getLiteralSubscription()
    {
        return literalSubscription;
    }

    public void setLiteralSubscription(String literalSubscription)
    {
        this.literalSubscription = literalSubscription;
    }

    public String getConcept()
    {
        return concept;
    }

    public void setConcept(String concept)
    {
        this.concept = concept;
    }

    public String getDateActualOperation()
    {
        return dateActualOperation;
    }

    public void setDateActualOperation(String dateActualOperation)
    {
        this.dateActualOperation = dateActualOperation;
    }

    public String getKeyCheckBank()
    {
        return keyCheckBank;
    }

    public void setKeyCheckBank(String keyCheckBank)
    {
        this.keyCheckBank = keyCheckBank;
    }

    public String getKeyCheckDate()
    {
        return keyCheckDate;
    }

    public void setKeyCheckDate(String keyCheckDate)
    {
        this.keyCheckDate = keyCheckDate;
    }

    public String getKeyCheckAccount()
    {
        return keyCheckAccount;
    }

    public void setKeyCheckAccount(String keyCheckAccount)
    {
        this.keyCheckAccount = keyCheckAccount;
    }

    public String getKeyCheckCheck()
    {
        return keyCheckCheck;
    }

    public void setKeyCheckCheck(String keyCheckCheck)
    {
        this.keyCheckCheck = keyCheckCheck;
    }

    public String getKeyCorrelativeLetter()
    {
        return keyCorrelativeLetter;
    }

    public void setKeyCorrelativeLetter(String keyCorrelativeLetter)
    {
        this.keyCorrelativeLetter = keyCorrelativeLetter;
    }

    public String getKeyAccountBtCorrelative()
    {
        return keyAccountBtCorrelative;
    }

    public void setKeyAccountBtCorrelative(String keyAccountBtCorrelative)
    {
        this.keyAccountBtCorrelative = keyAccountBtCorrelative;
    }

    public String getNumberLetter()
    {
        return NumberLetter;
    }

    public void setNumberLetter(String numberLetter)
    {
        NumberLetter = numberLetter;
    }

    public String getTransferStatus()
    {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus)
    {
        this.transferStatus = transferStatus;
    }

    public String getTransferStatus2()
    {
        return transferStatus2;
    }

    public void setTransferStatus2(String transferStatus2)
    {
        this.transferStatus2 = transferStatus2;
    }

    public MovementDetail(TB15Output tb15Output)
    {
        this.setMovementTime(tb15Output.getMovementTime());
        this.setBranchoffice(tb15Output.getBranchoffice());
        this.setCheckNumber(tb15Output.getCheckNumber());
        this.setAtmTerminal(tb15Output.getAtmTerminal());
        this.setDetailOperation(tb15Output.getDetailOperation());
        this.setTypeChange(tb15Output.getTypeChange());
        this.setAmountConverted(tb15Output.getAmountConverted());
        this.setSignAmountConverted(tb15Output.getAmountConverted());
        this.setChargeAccount(tb15Output.getChargeAccount());
        this.setMortgageAccount(tb15Output.getMortgageAccount());
        this.setRuc(tb15Output.getRuc());
        this.setInstitution(tb15Output.getInstitution());
        this.setEstablishment(tb15Output.getEstablishment());
        this.setExchangeRate(tb15Output.getExchangeRate());
        this.setReceipt(tb15Output.getReceipt());
        this.setEmailPagum(tb15Output.getEmailPagum());
        this.setSignCurrencyCargo(tb15Output.getSignCurrencyCargo());
        this.setCashDeposit(tb15Output.getCashDeposit());
        this.setCashDepositSign(tb15Output.getCashDepositSign());
        this.setBankDeposit(tb15Output.getBankDeposit());
        this.setSignDepositoBanco(tb15Output.getSignDepositoBanco());
        this.setBankDepositOther(tb15Output.getBankDepositOther());
        this.setBankDepositSign(tb15Output.getBankDepositSign());
        this.setNameDrawer(tb15Output.getNameDrawer());
        this.setNameBank(tb15Output.getNameBank());
        this.setReason(tb15Output.getReason());
        this.setAmount(tb15Output.getAccountType());
        this.setSupply(tb15Output.getSupply());
        this.setReference(tb15Output.getReference());
        this.setStudentCode(tb15Output.getStudentCode());
        this.setStudentName(tb15Output.getStudentName());
        this.setPayer(tb15Output.getPayer());
        this.setBeneficiary(tb15Output.getBeneficiary());
        this.setTypeService(tb15Output.getTypeService());
        this.setCustomerService(tb15Output.getCustomerService());
        this.setCreditCardNumber(tb15Output.getCreditCardNumber());
        this.setPhoneNumberRefill(tb15Output.getPhoneNumberRefill());
        this.setVirtualOrderNumber(tb15Output.getVirtualOrderNumber());
        this.setTribute(tb15Output.getTribute());
        this.setResolution(tb15Output.getResolution());
        this.setPrepaidCardKey(tb15Output.getPrepaidCardKey());
        this.setAccountTypePosition(tb15Output.getAccountTypePosition());
        this.setAccountType(tb15Output.getAccountType());
        this.setSignCurrencyCompost(tb15Output.getSignCurrencyCompost());
        this.setDestinationAccount(tb15Output.getDestinationAccount());
        this.setLiteralSubscription(tb15Output.getLiteralSubscription());
        this.setConcept(tb15Output.getConcept());
        this.setDateActualOperation(tb15Output.getDateActualOperation());
        this.setKeyCheckBank(tb15Output.getKeyCheckBank());
        this.setKeyCheckDate(tb15Output.getKeyCheckDate());
        this.setKeyCheckAccount(tb15Output.getKeyCheckAccount());
        this.setKeyCheckCheck(tb15Output.getKeyCheckCheck());
        this.setKeyCorrelativeLetter(tb15Output.getKeyCorrelativeLetter());
        this.setKeyAccountBtCorrelative(tb15Output.getKeyAccountBtCorrelative());
        this.setNumberLetter(tb15Output.getNumberLetter());
        this.setTransferStatus(tb15Output.getTransferStatus());
        this.setTransferStatus2(tb15Output.getTransferStatus2());
    }

    @Override
    public String toString()
    {
        return "MovementDetail [movementTime=" + movementTime + ", branchoffice=" + branchoffice + ", checkNumber=" + checkNumber + ", atmTerminal=" + atmTerminal + ", transactionNumber="
                + transactionNumber + ", detailOperation=" + detailOperation + ", typeChange=" + typeChange + ", amountConverted=" + amountConverted + ", signAmountConverted=" + signAmountConverted
                + ", chargeAccount=" + chargeAccount + ", mortgageAccount=" + mortgageAccount + ", ruc=" + ruc + ", institution=" + institution + ", establishment=" + establishment + ", exchangeRate="
                + exchangeRate + ", receipt=" + receipt + ", emailPagum=" + emailPagum + ", signCurrencyCargo=" + signCurrencyCargo + ", cashDeposit=" + cashDeposit + ", cashDepositSign="
                + cashDepositSign + ", bankDeposit=" + bankDeposit + ", SignDepositoBanco=" + SignDepositoBanco + ", bankDepositOther=" + bankDepositOther + ", bankDepositSign=" + bankDepositSign
                + ", NameDrawer=" + NameDrawer + ", nameBank=" + nameBank + ", Reason=" + Reason + ", Amount=" + Amount + ", supply=" + supply + ", reference=" + reference + ", studentCode="
                + studentCode + ", studentName=" + studentName + ", payer=" + payer + ", beneficiary=" + beneficiary + ", typeService=" + typeService + ", customerService=" + customerService
                + ", creditCardNumber=" + creditCardNumber + ", PhoneNumberRefill=" + PhoneNumberRefill + ", VirtualOrderNumber=" + VirtualOrderNumber + ", Tribute=" + Tribute + ", resolution="
                + resolution + ", prepaidCardKey=" + prepaidCardKey + ", accountTypePosition=" + accountTypePosition + ", AccountType=" + AccountType + ", signCurrencyCompost=" + signCurrencyCompost
                + ", destinationAccount=" + destinationAccount + ", literalSubscription=" + literalSubscription + ", concept=" + concept + ", dateActualOperation=" + dateActualOperation
                + ", keyCheckBank=" + keyCheckBank + ", keyCheckDate=" + keyCheckDate + ", keyCheckAccount=" + keyCheckAccount + ", keyCheckCheck=" + keyCheckCheck + ", keyCorrelativeLetter="
                + keyCorrelativeLetter + ", keyAccountBtCorrelative=" + keyAccountBtCorrelative + ", NumberLetter=" + NumberLetter + ", transferStatus=" + transferStatus + ", transferStatus2="
                + transferStatus2 + "]";
    }

    
}
