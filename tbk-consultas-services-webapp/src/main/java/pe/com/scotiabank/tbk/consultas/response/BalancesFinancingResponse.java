
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.Financing;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesFinancingResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesFinancingResponse extends Response
{
    private static final long serialVersionUID = -2026775255583693852L;

    private Financing[] financings;

    public BalancesFinancingResponse()
    {
    }

    public BalancesFinancingResponse(Status status)
    {
        super(status);
    }

    public BalancesFinancingResponse(String code, String message)
    {
        super(code, message);
    }

    @XmlElementWrapper(name = "financings")
    @XmlElement(name = "financing")
    public Financing[] getFinancings()
    {
        return financings;
    }

    public void setFinancings(Financing[] financings)
    {
        this.financings = financings;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalancesFinancingResponse [financings=");
        builder.append(Arrays.toString(financings));
        builder.append("]");
        return builder.toString();
    }

}
