
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


import pe.com.scotiabank.tbk.util.trama.Body;

//@XmlRootElement(name = "Financing", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Financing", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")

public class Financing implements Body, Serializable
{

    private static final long serialVersionUID = 3832806884576768583L;

    // LENGHT ATTRIBUTES
    public static final int TBK_OUPUT_ATTR_LENGTH_FINANCING_TYPE = 16;
    public static final int TBK_OUPUT_ATTR_LENGTH_FINANCING_NAME = 40;
    public static final int TBK_OUPUT_ATTR_LENGTH_FINANCING_MONEY = 4;
    public static final int TBK_OUPUT_ATTR_LENGTH_FINANCING_IMPORT = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_FINANCING_SIGN = 1;

    private String financingType;
    private String financingName;
    private String financingMoney;
    private String financingImport;
    private String financingSign;

    public Financing()
    {
    }

    public Financing(String output)
    {
        setStringBody(output);
    }

    public String getFinancingType()
    {
        return financingType;
    }

    public void setFinancingType(String financingType)
    {
        this.financingType = financingType;
    }

    public String getFinancingName()
    {
        return financingName;
    }

    public void setFinancingName(String financingName)
    {
        this.financingName = financingName;
    }

    public String getFinancingMoney()
    {
        return financingMoney;
    }

    public void setFinancingMoney(String financingMoney)
    {
        this.financingMoney = financingMoney;
    }

    public String getFinancingImport()
    {
        return financingImport;
    }

    public void setFinancingImport(String financingImport)
    {
        this.financingImport = financingImport;
    }

    public String getFinancingSign()
    {
        return financingSign;
    }

    public void setFinancingSign(String financingSign)
    {
        this.financingSign = financingSign;
    }

    public Financing(String financingType, String financingName, String financingMoney, String financingImport, String financingSign)
    {
        super();
        this.financingType = financingType;
        this.financingName = financingName;
        this.financingMoney = financingMoney;
        this.financingImport = financingImport;
        this.financingSign = financingSign;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setFinancingType(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FINANCING_TYPE));
        setFinancingName(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FINANCING_NAME));
        setFinancingMoney(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FINANCING_MONEY));
        setFinancingImport(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FINANCING_IMPORT));
        setFinancingSign(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_FINANCING_SIGN));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(financingType);
        builder.append(financingName);
        builder.append(financingMoney);
        builder.append(financingImport);
        builder.append(financingSign);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Financing [financingType=");
        builder.append(financingType);
        builder.append(", financingName=");
        builder.append(financingName);
        builder.append(", financingMoney=");
        builder.append(financingMoney);
        builder.append(", financingImport=");
        builder.append(financingImport);
        builder.append(", financingSign=");
        builder.append(financingSign);
        builder.append("]");
        return builder.toString();
    }

}
