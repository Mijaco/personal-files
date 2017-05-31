
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceComexProduct", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalanceComexProduct implements Body, Serializable
{

    private static final long serialVersionUID = -8389053127413038983L;

    // LENGHT ATTRIBUTES
    public static final int TBK_OUPUT_ATTR_LENGTH_CURRENCY_1 = 2;
    public static final int TBK_OUPUT_ATTR_LENGTH_LITERAL_CURRENCY_1 = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_DOCUMENT_NUMBER_1 = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT_1 = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_1 = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_CURRENCY_2 = 2;
    public static final int TBK_OUPUT_ATTR_LENGTH_LITERAL_CURRENCY_2 = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_NUMBER_DOCUMENTS_2 = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT_2 = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_2 = 1;

    private String balanceProducto1;
    private String balanceProducto2;
    private String documentNumber1;
    private String documentNumber2;
    private String literalMoney1;
    private String literalMoney2;
    private String money1;
    private String money2;
    private String symbol1;
    private String symbol2;

    public BalanceComexProduct()
    {
    }

    public BalanceComexProduct(String output)
    {
        setStringBody(output);
    }

    public BalanceComexProduct(String balanceProducto1, String balanceProducto2, String documentNumber1, String documentNumber2, String literalMoney1, String literalMoney2, String money1,
            String money2, String symbol1, String symbol2)
    {
        super();
        this.balanceProducto1 = balanceProducto1;
        this.balanceProducto2 = balanceProducto2;
        this.documentNumber1 = documentNumber1;
        this.documentNumber2 = documentNumber2;
        this.literalMoney1 = literalMoney1;
        this.literalMoney2 = literalMoney2;
        this.money1 = money1;
        this.money2 = money2;
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
    }

    public String getBalanceProducto1()
    {
        return balanceProducto1;
    }

    public void setBalanceProducto1(String balanceProducto1)
    {
        this.balanceProducto1 = balanceProducto1;
    }

    public String getBalanceProducto2()
    {
        return balanceProducto2;
    }

    public void setBalanceProducto2(String balanceProducto2)
    {
        this.balanceProducto2 = balanceProducto2;
    }

    public String getDocumentNumber1()
    {
        return documentNumber1;
    }

    public void setDocumentNumber1(String documentNumber1)
    {
        this.documentNumber1 = documentNumber1;
    }

    public String getDocumentNumber2()
    {
        return documentNumber2;
    }

    public void setDocumentNumber2(String documentNumber2)
    {
        this.documentNumber2 = documentNumber2;
    }

    public String getLiteralMoney1()
    {
        return literalMoney1;
    }

    public void setLiteralMoney1(String literalMoney1)
    {
        this.literalMoney1 = literalMoney1;
    }

    public String getLiteralMoney2()
    {
        return literalMoney2;
    }

    public void setLiteralMoney2(String literalMoney2)
    {
        this.literalMoney2 = literalMoney2;
    }

    public String getMoney1()
    {
        return money1;
    }

    public void setMoney1(String money1)
    {
        this.money1 = money1;
    }

    public String getMoney2()
    {
        return money2;
    }

    public void setMoney2(String money2)
    {
        this.money2 = money2;
    }

    public String getSymbol1()
    {
        return symbol1;
    }

    public void setSymbol1(String symbol1)
    {
        this.symbol1 = symbol1;
    }

    public String getSymbol2()
    {
        return symbol2;
    }

    public void setSymbol2(String symbol2)
    {
        this.symbol2 = symbol2;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;

        setMoney1(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CURRENCY_1));
        setLiteralMoney1(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_LITERAL_CURRENCY_1));
        setDocumentNumber1(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DOCUMENT_NUMBER_1));
        setBalanceProducto1(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT_1));
        setSymbol1(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_1));
        setMoney2(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CURRENCY_2));
        setLiteralMoney2(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_LITERAL_CURRENCY_2));
        setDocumentNumber2(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_NUMBER_DOCUMENTS_2));
        setBalanceProducto2(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_BALANCE_PRODUCT_2));
        setSymbol2(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_2));

    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(balanceProducto1);
        builder.append(balanceProducto2);
        builder.append(documentNumber1);
        builder.append(documentNumber2);
        builder.append(literalMoney1);
        builder.append(literalMoney2);
        builder.append(money1);
        builder.append(money2);
        builder.append(symbol1);
        builder.append(symbol2);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalanceComexProduct [balanceProducto1=");
        builder.append(balanceProducto1);
        builder.append(", balanceProducto2=");
        builder.append(balanceProducto2);
        builder.append(", documentNumber1=");
        builder.append(documentNumber1);
        builder.append(", documentNumber2=");
        builder.append(documentNumber2);
        builder.append(", literalMoney1=");
        builder.append(literalMoney1);
        builder.append(", literalMoney2=");
        builder.append(literalMoney2);
        builder.append(", money1=");
        builder.append(money1);
        builder.append(", money2=");
        builder.append(money2);
        builder.append(", symbol1=");
        builder.append(symbol1);
        builder.append(", symbol2=");
        builder.append(symbol2);
        builder.append("]");
        return builder.toString();
    }

}
