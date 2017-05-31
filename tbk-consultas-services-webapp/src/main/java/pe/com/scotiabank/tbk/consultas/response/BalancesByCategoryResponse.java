
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.ProductAccountsDetail;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesByCategoryResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesByCategoryResponse extends Response
{

    private static final long serialVersionUID = 3590438185600202473L;

    private String totalSoles;
    private String totalSignSoles;
    private String totalDolars;
    private String totalSignDolars;
    private ProductAccountsDetail[] productAccountsDetails;
    private String paginationInd;

    public BalancesByCategoryResponse()
    {
    }

    public BalancesByCategoryResponse(Status status)
    {
        super(status);
    }

    public BalancesByCategoryResponse(String code, String message)
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

    public String getTotalSignSoles()
    {
        return totalSignSoles;
    }

    public void setTotalSignSoles(String totalSignSoles)
    {
        this.totalSignSoles = totalSignSoles;
    }

    public String getTotalDolars()
    {
        return totalDolars;
    }

    public void setTotalDolars(String totalDolars)
    {
        this.totalDolars = totalDolars;
    }

    public String getTotalSignDolars()
    {
        return totalSignDolars;
    }

    public void setTotalSignDolars(String totalSignDolars)
    {
        this.totalSignDolars = totalSignDolars;
    }

    @XmlElementWrapper(name = "productAccountsDetails")
    @XmlElement(name = "productAccountsDetail")
    public ProductAccountsDetail[] getProductAccountsDetails()
    {
        return productAccountsDetails;
    }

    public void setProductAccountsDetails(ProductAccountsDetail[] productAccountsDetails)
    {
        this.productAccountsDetails = productAccountsDetails;
    }

    public String getPaginationInd()
    {
        return paginationInd;
    }

    public void setPaginationInd(String paginationInd)
    {
        this.paginationInd = paginationInd;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalancesByCategoryResponse [totalSoles=");
        builder.append(totalSoles);
        builder.append(", totalSignSoles=");
        builder.append(totalSignSoles);
        builder.append(", totalDolars=");
        builder.append(totalDolars);
        builder.append(", totalSignDolars=");
        builder.append(totalSignDolars);
        builder.append(", productAccountsDetails=");
        builder.append(Arrays.toString(productAccountsDetails));
        builder.append(", paginationInd=");
        builder.append(paginationInd);
        builder.append("]");
        return builder.toString();
    }

}
