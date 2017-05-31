
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceCategory", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalanceCategory implements Body, Serializable
{
    private static final long serialVersionUID = 1L;

    public static final int TBK_OUPUT_ATTR_LENGTH_COD_SUBCATEGORY = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_DESC_SUBCATEGORY = 30;
    public static final int TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_BALANCE_SIGN = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_CURRENCY = 4;

    private String subCategoryCode;
    private String subCategoryDescription;
    private String balanceProduct;
    private String balanceSymbol;
    private String balanceMoney;

    public BalanceCategory()
    {
    }

    public BalanceCategory(String output)
    {
        setStringBody(output);
    }

    public BalanceCategory(String subCategoryCode, String subCategoryDescription, String balanceProduct, String balanceSymbol, String balanceMoney)
    {
        super();
        this.subCategoryCode = subCategoryCode;
        this.subCategoryDescription = subCategoryDescription;
        this.balanceProduct = balanceProduct;
        this.balanceSymbol = balanceSymbol;
        this.balanceMoney = balanceMoney;
    }

    public String getSubCategoryCode()
    {
        return subCategoryCode;
    }

    public void setSubCategoryCode(String subCategoryCode)
    {
        this.subCategoryCode = subCategoryCode;
    }

    public String getSubCategoryDescription()
    {
        return subCategoryDescription;
    }

    public void setSubCategoryDescription(String subCategoryDescription)
    {
        this.subCategoryDescription = subCategoryDescription;
    }

    public String getBalanceProduct()
    {
        return balanceProduct;
    }

    public void setBalanceProduct(String balanceProduct)
    {
        this.balanceProduct = balanceProduct;
    }

    public String getBalanceSymbol()
    {
        return balanceSymbol;
    }

    public void setBalanceSymbol(String balanceSymbol)
    {
        this.balanceSymbol = balanceSymbol;
    }

    public String getBalanceMoney()
    {
        return balanceMoney;
    }

    public void setBalanceMoney(String balanceMoney)
    {
        this.balanceMoney = balanceMoney;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setSubCategoryCode(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_COD_SUBCATEGORY));
        setSubCategoryDescription(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DESC_SUBCATEGORY));
        setBalanceProduct(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT));
        setBalanceSymbol(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BALANCE_SIGN));
        setBalanceMoney(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CURRENCY));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(subCategoryCode);
        builder.append(subCategoryDescription);
        builder.append(balanceProduct);
        builder.append(balanceSymbol);
        builder.append(balanceMoney);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalanceCategory [subCategoryCode=");
        builder.append(subCategoryCode);
        builder.append(", subCategoryDescription=");
        builder.append(subCategoryDescription);
        builder.append(", balanceProduct=");
        builder.append(balanceProduct);
        builder.append(", balanceSymbol=");
        builder.append(balanceSymbol);
        builder.append(", balanceMoney=");
        builder.append(balanceMoney);
        builder.append("]");
        return builder.toString();
    }

}
