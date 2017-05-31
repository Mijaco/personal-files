
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAccountsDetail", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class ProductAccountsDetail implements Body, Serializable
{

    private static final long serialVersionUID = -6177313109659909349L;

    public static final int TBK_OUPUT_ATTR_LENGTH_ACCOUNT_TYPE = 2;
    public static final int TBK_OUPUT_ATTR_LENGTH_OFFICE_CODE = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_OFFICE_NAME = 30;
    public static final int TBK_OUPUT_ATTR_LENGTH_BT_COIN = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_PRODUCT_CODE = 12;
    public static final int TBK_OUPUT_ATTR_LENGTH_BANK_INDICATOR = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_COUNTABLE_BALANCE = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_COUNTABLE_BALANCE_SIGN = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_AVAILABLE_BALANCE = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_AVAILABLE_BALANCE_SIGN = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_INTEREST_RATE = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_INTEREST_RATE_SIGN = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_OPENING_DATE = 8;
    public static final int TBK_OUPUT_ATTR_LENGTH_STATUS = 25;
    public static final int TBK_OUPUT_ATTR_LENGTH_CCI_CODE = 20;
    public static final int TBK_OUPUT_ATTR_LENGTH_MEMBERSHIP_INDICATOR = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_CCE_PAYMENT_FLAG = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_FILLER = 3;

    private String accountType;
    private String branchOfficeCode;
    private String branchOfficeName;
    private String btCoin;
    private String productCode;
    private String bankIndicator;
    private String countableBalance;
    private String countableBalanceSign;
    private String availableBalance;
    private String availableBalanceSign;
    private String interestRate;
    private String interestRateSign;
    private String openingDate;
    private String status;
    private String cciCode;
    private String membershipIndicator;
    private String ccePaymentFlag;
    private String filler;
    private String productCodeConcetenated;
    private String productCodeEdited;
    private String productCodeConcetenatedName;

    public ProductAccountsDetail()
    {
    }

    public ProductAccountsDetail(String output)
    {
        setStringBody(output);
    }

    public String getAccountType()
    {
        return accountType;
    }

    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }

    public String getBranchOfficeCode()
    {
        return branchOfficeCode;
    }

    public void setBranchOfficeCode(String branchOfficeCode)
    {
        this.branchOfficeCode = branchOfficeCode;
    }

    public String getBranchOfficeName()
    {
        return branchOfficeName;
    }

    public void setBranchOfficeName(String branchOfficeName)
    {
        this.branchOfficeName = branchOfficeName;
    }

    public String getBtCoin()
    {
        return btCoin;
    }

    public void setBtCoin(String btCoin)
    {
        this.btCoin = btCoin;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getBankIndicator()
    {
        return bankIndicator;
    }

    public void setBankIndicator(String bankIndicator)
    {
        this.bankIndicator = bankIndicator;
    }

    public String getCountableBalance()
    {
        return countableBalance;
    }

    public void setCountableBalance(String countableBalance)
    {
        this.countableBalance = countableBalance;
    }

    public String getCountableBalanceSign()
    {
        return countableBalanceSign;
    }

    public void setCountableBalanceSign(String countableBalanceSign)
    {
        this.countableBalanceSign = countableBalanceSign;
    }

    public String getAvailableBalance()
    {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance)
    {
        this.availableBalance = availableBalance;
    }

    public String getAvailableBalanceSign()
    {
        return availableBalanceSign;
    }

    public void setAvailableBalanceSign(String availableBalanceSign)
    {
        this.availableBalanceSign = availableBalanceSign;
    }

    public String getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(String interestRate)
    {
        this.interestRate = interestRate;
    }

    public String getInterestRateSign()
    {
        return interestRateSign;
    }

    public void setInterestRateSign(String interestRateSign)
    {
        this.interestRateSign = interestRateSign;
    }

    public String getOpeningDate()
    {
        return openingDate;
    }

    public void setOpeningDate(String openingDate)
    {
        this.openingDate = openingDate;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getCciCode()
    {
        return cciCode;
    }

    public void setCciCode(String cciCode)
    {
        this.cciCode = cciCode;
    }

    public String getMembershipIndicator()
    {
        return membershipIndicator;
    }

    public void setMembershipIndicator(String membershipIndicator)
    {
        this.membershipIndicator = membershipIndicator;
    }

    public String getCcePaymentFlag()
    {
        return ccePaymentFlag;
    }

    public void setCcePaymentFlag(String ccePaymentFlag)
    {
        this.ccePaymentFlag = ccePaymentFlag;
    }

    public String getFiller()
    {
        return filler;
    }

    public void setFiller(String filler)
    {
        this.filler = filler;
    }

    public String getProductCodeConcetenated()
    {
        return productCodeConcetenated;
    }

    public void setProductCodeConcetenated(String productCodeConcetenated)
    {
        this.productCodeConcetenated = productCodeConcetenated;
    }

    public String getProductCodeEdited()
    {
        return productCodeEdited;
    }

    public void setProductCodeEdited(String productCodeEdited)
    {
        this.productCodeEdited = productCodeEdited;
    }

    public String getProductCodeConcetenatedName()
    {
        return productCodeConcetenatedName;
    }

    public void setProductCodeConcetenatedName(String productCodeConcetenatedName)
    {
        this.productCodeConcetenatedName = productCodeConcetenatedName;
    }

    public ProductAccountsDetail(String accountType, String branchOfficeCode, String branchOfficeName, String btCoin, String productCode, String bankIndicator, String countableBalance,
            String countableBalanceSign, String availableBalance, String availableBalanceSign, String interestRate, String interestRateSign, String openingDate, String status, String cciCode,
            String membershipIndicator, String ccePaymentFlag, String filler)
    {
        super();
        this.accountType = accountType;
        this.branchOfficeCode = branchOfficeCode;
        this.branchOfficeName = branchOfficeName;
        this.btCoin = btCoin;
        this.productCode = productCode;
        this.bankIndicator = bankIndicator;
        this.countableBalance = countableBalance;
        this.countableBalanceSign = countableBalanceSign;
        this.availableBalance = availableBalance;
        this.availableBalanceSign = availableBalanceSign;
        this.interestRate = interestRate;
        this.interestRateSign = interestRateSign;
        this.openingDate = openingDate;
        this.status = status;
        this.cciCode = cciCode;
        this.membershipIndicator = membershipIndicator;
        this.ccePaymentFlag = ccePaymentFlag;
        this.filler = filler;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setAccountType(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_ACCOUNT_TYPE));
        setBranchOfficeCode(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_OFFICE_CODE));
        setBranchOfficeName(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_OFFICE_NAME));
        setBtCoin(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BT_COIN));
        setProductCode(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_PRODUCT_CODE));
        setBankIndicator(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BANK_INDICATOR));
        setCountableBalance(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_COUNTABLE_BALANCE));
        setCountableBalanceSign(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_COUNTABLE_BALANCE_SIGN));
        setAvailableBalance(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_AVAILABLE_BALANCE));
        setAvailableBalanceSign(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_AVAILABLE_BALANCE_SIGN));
        setInterestRate(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_INTEREST_RATE));
        setInterestRateSign(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_INTEREST_RATE_SIGN));
        setOpeningDate(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_OPENING_DATE));
        setStatus(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_STATUS));
        setCciCode(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CCI_CODE));
        setMembershipIndicator(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_MEMBERSHIP_INDICATOR));
        setCcePaymentFlag(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CCE_PAYMENT_FLAG));
        setFiller(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FILLER));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(accountType);
        builder.append(branchOfficeCode);
        builder.append(branchOfficeName);
        builder.append(btCoin);
        builder.append(productCode);
        builder.append(bankIndicator);
        builder.append(countableBalance);
        builder.append(countableBalanceSign);
        builder.append(availableBalance);
        builder.append(availableBalanceSign);
        builder.append(interestRate);
        builder.append(interestRateSign);
        builder.append(openingDate);
        builder.append(status);
        builder.append(cciCode);
        builder.append(membershipIndicator);
        builder.append(ccePaymentFlag);
        builder.append(filler);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("ProductAccountsDetail [accountType=");
        builder.append(accountType);
        builder.append(", branchOfficeCode=");
        builder.append(branchOfficeCode);
        builder.append(", branchOfficeName=");
        builder.append(branchOfficeName);
        builder.append(", btCoin=");
        builder.append(btCoin);
        builder.append(", productCode=");
        builder.append(productCode);
        builder.append(", bankIndicator=");
        builder.append(bankIndicator);
        builder.append(", countableBalance=");
        builder.append(countableBalance);
        builder.append(", countableBalanceSign=");
        builder.append(countableBalanceSign);
        builder.append(", availableBalance=");
        builder.append(availableBalance);
        builder.append(", availableBalanceSign=");
        builder.append(availableBalanceSign);
        builder.append(", interestRate=");
        builder.append(interestRate);
        builder.append(", interestRateSign=");
        builder.append(interestRateSign);
        builder.append(", openingDate=");
        builder.append(openingDate);
        builder.append(", status=");
        builder.append(status);
        builder.append(", cciCode=");
        builder.append(cciCode);
        builder.append(", membershipIndicator=");
        builder.append(membershipIndicator);
        builder.append(", ccePaymentFlag=");
        builder.append(ccePaymentFlag);
        builder.append(", filler=");
        builder.append(filler);
        builder.append(", productCodeConcetenated=");
        builder.append(productCodeConcetenated);
        builder.append(", productCodeEdited=");
        builder.append(productCodeEdited);
        builder.append(", productCodeConcetenatedName=");
        builder.append(productCodeConcetenatedName);
        builder.append("]");
        return builder.toString();
    }
}
