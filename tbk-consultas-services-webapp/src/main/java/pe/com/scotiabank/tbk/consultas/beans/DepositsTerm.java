
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


import pe.com.scotiabank.tbk.util.trama.Body;

/**
 * TRAMAS: <b>[TB03]</b>
 * 
 * @author jventura
 *
 */
//@XmlRootElement(name = "DepositsTerm", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositsTerm", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class DepositsTerm implements Body, Serializable
{
    private static final long serialVersionUID = -3572217912806612064L;

    public static final int TBK_OUPUT_ATTR_LENGTH_SUBCATEGORY_CODE = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_SUBCATEGORY_DESCRIPTION = 30;
    public static final int TBK_OUPUT_ATTR_LENGTH_PRODUCT_BALANCE_1 = 15;
    public static final int TBK_OUPUT_ATTR_LENGTH_CURRENCY_1 = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_PRODUCT_BALANCE_2 = 15;
    public static final int TBK_OUPUT_ATTR_LENGTH_CURRENCY_2 = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_FILLER = 3;

    private String subcategoryCode;
    private String subcategoryDescription;
    private String productBalance1;
    private String currency1;
    private String productBalance2;
    private String currency2;
    private String filler;

    public DepositsTerm()
    {
    }

    public DepositsTerm(String output)
    {
        setStringBody(output);
    }

    public String getSubcategoryCode()
    {
        return subcategoryCode;
    }

    public void setSubcategoryCode(String subcategoryCode)
    {
        this.subcategoryCode = subcategoryCode;
    }

    public String getSubcategoryDescription()
    {
        return subcategoryDescription;
    }

    public void setSubcategoryDescription(String subcategoryDescription)
    {
        this.subcategoryDescription = subcategoryDescription;
    }

    public String getProductBalance1()
    {
        return productBalance1;
    }

    public void setProductBalance1(String productBalance1)
    {
        this.productBalance1 = productBalance1;
    }

    public String getCurrency1()
    {
        return currency1;
    }

    public void setCurrency1(String currency1)
    {
        this.currency1 = currency1;
    }

    public String getProductBalance2()
    {
        return productBalance2;
    }

    public void setProductBalance2(String productBalance2)
    {
        this.productBalance2 = productBalance2;
    }

    public String getCurrency2()
    {
        return currency2;
    }

    public void setCurrency2(String currency2)
    {
        this.currency2 = currency2;
    }

    public String getFiller()
    {
        return filler;
    }

    public void setFiller(String filler)
    {
        this.filler = filler;
    }

    public DepositsTerm(String subcategoryCode, String subcategoryDescription, String productBalance1, String currency1, String productBalance2, String currency2, String filler)
    {
        super();
        this.subcategoryCode = subcategoryCode;
        this.subcategoryDescription = subcategoryDescription;
        this.productBalance1 = productBalance1;
        this.currency1 = currency1;
        this.productBalance2 = productBalance2;
        this.currency2 = currency2;
        this.filler = filler;
    }

    @Override
    public void setStringBody(String output)
    {
        int i = 0;
        subcategoryCode = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_SUBCATEGORY_CODE);
        subcategoryDescription = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_SUBCATEGORY_DESCRIPTION);
        productBalance1 = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_PRODUCT_BALANCE_1);
        currency1 = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_CURRENCY_1);
        productBalance2 = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_PRODUCT_BALANCE_2);
        currency2 = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_CURRENCY_2);
        filler = output.substring(i, i += TBK_OUPUT_ATTR_LENGTH_FILLER);
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(subcategoryCode);
        builder.append(subcategoryDescription);
        builder.append(productBalance1);
        builder.append(currency1);
        builder.append(productBalance2);
        builder.append(currency2);
        builder.append(filler);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DepositsTerm [subcategoryCode=");
        builder.append(subcategoryCode);
        builder.append(", subcategoryDescription=");
        builder.append(subcategoryDescription);
        builder.append(", productBalance1=");
        builder.append(productBalance1);
        builder.append(", currency1=");
        builder.append(currency1);
        builder.append(", productBalance2=");
        builder.append(productBalance2);
        builder.append(", currency2=");
        builder.append(currency2);
        builder.append(", filler=");
        builder.append(filler);
        builder.append("]");
        return builder.toString();
    }

}
