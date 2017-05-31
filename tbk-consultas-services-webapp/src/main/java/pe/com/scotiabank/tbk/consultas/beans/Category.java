
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Category", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class Category implements Body, Serializable
{

    private static final long serialVersionUID = -6292758528275664666L;

    public static final int TBK_OUPUT_ATTR_LENGTH_CATEGORY = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_CATEGORY_NAME = 30;
    public static final int TBK_OUPUT_ATTR_LENGTH_CATEGORY_SHOW_DEPLOY = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_CATEGORY_TRANSACTION_CALL = 4;

    private String category;
    private String categoryName;
    private String categoryShowDeploy;
    private String categoryTransactionCall;
    private ProductAccountsDetail[] productAccountDetails;

    public Category()
    {
    }

    public Category(String output)
    {
        setStringBody(output);
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCategoryShowDeploy()
    {
        return categoryShowDeploy;
    }

    public void setCategoryShowDeploy(String categoryShowDeploy)
    {
        this.categoryShowDeploy = categoryShowDeploy;
    }

    public String getCategoryTransactionCall()
    {
        return categoryTransactionCall;
    }

    public void setCategoryTransactionCall(String categoryTransactionCall)
    {
        this.categoryTransactionCall = categoryTransactionCall;
    }

    public Category(String category, String categoryName, String categoryShowDeploy, String categoryTransactionCall)
    {
        super();
        this.category = category;
        this.categoryName = categoryName;
        this.categoryShowDeploy = categoryShowDeploy;
        this.categoryTransactionCall = categoryTransactionCall;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setCategory(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CATEGORY));
        setCategoryName(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CATEGORY_NAME));
        setCategoryShowDeploy(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CATEGORY_SHOW_DEPLOY));
        setCategoryTransactionCall(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CATEGORY_TRANSACTION_CALL));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(category);
        builder.append(categoryName);
        builder.append(categoryShowDeploy);
        builder.append(categoryTransactionCall);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Category [category=");
        builder.append(category);
        builder.append(", categoryName=");
        builder.append(categoryName);
        builder.append(", categoryShowDeploy=");
        builder.append(categoryShowDeploy);
        builder.append(", categoryTransactionCall=");
        builder.append(categoryTransactionCall);
        builder.append("]");
        return builder.toString();
    }

    public ProductAccountsDetail[] getProductAccountDetails()
    {
        return productAccountDetails;
    }

    public void setProductAccountDetails(ProductAccountsDetail[] productAccountDetails)
    {
        this.productAccountDetails = productAccountDetails;
    }

}
