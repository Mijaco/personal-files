
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.Category;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "AccountsAndProductsResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class AccountsAndProductsResponse extends Response
{

    private static final long serialVersionUID = -8274060115763912362L;

    private String bussinessFunctionary;
    private String nroCategories;
    private Category[] categories;
    private BalancesByCategoryResponse balances;

    public AccountsAndProductsResponse()
    {
    }

    public AccountsAndProductsResponse(Status status)
    {
        super(status);
    }

    public AccountsAndProductsResponse(String code, String message)
    {
        super(code, message);
    }

    public String getBussinessFunctionary()
    {
        return bussinessFunctionary;
    }

    public void setBussinessFunctionary(String bussinessFunctionary)
    {
        this.bussinessFunctionary = bussinessFunctionary;
    }

    public String getNroCategories()
    {
        return nroCategories;
    }

    public void setNroCategories(String nroCategories)
    {
        this.nroCategories = nroCategories;
    }

    @XmlElementWrapper(name = "categories")
    @XmlElement(name="Category")
    public Category[] getCategories()
    {
        return categories;
    }

    public void setCategories(Category[] categories)
    {
        this.categories = categories;
    }
    
    @XmlElement(name="balancesByCategoryResponse")
    public BalancesByCategoryResponse getBalances() {
		return balances;
	}

	public void setBalances(BalancesByCategoryResponse balances) {
		this.balances = balances;
	}

	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountsAndProductsResponse [bussinessFunctionary=");
        builder.append(bussinessFunctionary);
        builder.append(", nroCategories=");
        builder.append(nroCategories);
        builder.append(", categories=");
        builder.append(Arrays.toString(categories));
        builder.append("]");
        return builder.toString();
    }

}
