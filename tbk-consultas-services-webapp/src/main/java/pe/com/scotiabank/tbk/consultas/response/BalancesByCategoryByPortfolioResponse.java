
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.BalanceCategory;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesByCategoryByPortfolioResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesByCategoryByPortfolioResponse extends Response
{

    private static final long serialVersionUID = 8503337665413170690L;
    
    private BalanceCategory[] balanceCategories;

    public BalancesByCategoryByPortfolioResponse()
    {
    }

    public BalancesByCategoryByPortfolioResponse(Status status)
    {
        super(status);
    }

    public BalancesByCategoryByPortfolioResponse(String code, String message)
    {
        super(code, message);
    }
    
    @XmlElementWrapper(name = "balanceCategories")
    @XmlElement(name = "balanceCategory")
    public BalanceCategory[] getBalanceCategories()
    {
        return balanceCategories;
    }

    public void setBalanceCategories(BalanceCategory[] balanceCategories)
    {
        this.balanceCategories = balanceCategories;
    }

    @Override
    public String toString()
    {
        return "TBW1CategoryPortfolioBalance [balanceCategories=" + Arrays.toString(balanceCategories) + "]";
    }

}
