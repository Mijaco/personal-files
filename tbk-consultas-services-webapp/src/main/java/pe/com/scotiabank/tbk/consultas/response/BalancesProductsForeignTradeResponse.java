
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.BalanceComexProduct;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesProductsForeignTradeResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesProductsForeignTradeResponse extends Response
{

    private static final long serialVersionUID = 4905016634260733925L;

    private String productName;
    private BalanceComexProduct[] balancesComexProduct;

    public BalancesProductsForeignTradeResponse()
    {
    }

    public BalancesProductsForeignTradeResponse(Status status)
    {
        super(status);
    }

    public BalancesProductsForeignTradeResponse(String code, String message)
    {
        super(code, message);
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    @XmlElementWrapper(name = "balancesComexProducts")
    @XmlElement(name = "balancesComexProduct")
    public BalanceComexProduct[] getBalancesComexProduct()
    {
        return balancesComexProduct;
    }

    public void setBalancesComexProduct(BalanceComexProduct[] balancesComexProduct)
    {
        this.balancesComexProduct = balancesComexProduct;
    }

    @Override
    public String toString()
    {
        return "TBESForeignTradesBalanceProducts [productName=" + productName + ", balancesComexProduct=" + Arrays.toString(balancesComexProduct) + "]";
    }

}
