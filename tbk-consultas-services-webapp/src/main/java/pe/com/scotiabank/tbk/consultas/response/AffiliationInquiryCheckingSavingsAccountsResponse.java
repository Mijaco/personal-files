
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.AccountsMembershipDetail;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "AffiliationInquiryCheckingSavingsAccountsResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class AffiliationInquiryCheckingSavingsAccountsResponse extends Response
{

    private static final long serialVersionUID = 2946130128375772017L;

    private String totalSoles;
    private String signSoles;
    private String totalDolars;
    private String signDolars;
    private AccountsMembershipDetail[] accountsMembershipDetails;

    public AffiliationInquiryCheckingSavingsAccountsResponse()
    {
    }

    public AffiliationInquiryCheckingSavingsAccountsResponse(Status status)
    {
        super(status);
    }

    public AffiliationInquiryCheckingSavingsAccountsResponse(String code, String message)
    {
        super(code, message);
    }

    public String getTotalSoles()
    {
        return totalSoles;
    }

    public void setTotalSoles(String totalSoles)
    {
        this.totalSoles = totalSoles;
    }

    public String getSignSoles()
    {
        return signSoles;
    }

    public void setSignSoles(String signSoles)
    {
        this.signSoles = signSoles;
    }

    public String getTotalDolars()
    {
        return totalDolars;
    }

    public void setTotalDolars(String totalDolars)
    {
        this.totalDolars = totalDolars;
    }

    public String getSignDolars()
    {
        return signDolars;
    }

    public void setSignDolars(String signDolars)
    {
        this.signDolars = signDolars;
    }

    @XmlElementWrapper(name = "accountsMembershipDetails")
    @XmlElement(name = "accountsMembershipDetail")
    public AccountsMembershipDetail[] getAccountsMembershipDetails()
    {
        return accountsMembershipDetails;
    }

    public void setAccountsMembershipDetails(AccountsMembershipDetail[] accountsMembershipDetails)
    {
        this.accountsMembershipDetails = accountsMembershipDetails;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AffiliationInquiryCheckingSavingsAccountsResponse [totalSoles=");
        builder.append(totalSoles);
        builder.append(", signSoles=");
        builder.append(signSoles);
        builder.append(", totalDolars=");
        builder.append(totalDolars);
        builder.append(", signDolars=");
        builder.append(signDolars);
        builder.append(", accountsMembershipDetails=");
        builder.append(Arrays.toString(accountsMembershipDetails));
        builder.append("]");
        return builder.toString();
    }

}
