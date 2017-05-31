
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.DepositsTerm;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesDepositsTermResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesDepositsTermResponse extends Response
{

    private static final long serialVersionUID = 6051658371011169430L;

    private DepositsTerm[] depositsTerm;

    public BalancesDepositsTermResponse()
    {
    }

    public BalancesDepositsTermResponse(Status status)
    {
        super(status);
    }

    public BalancesDepositsTermResponse(String code, String message)
    {
        super(code, message);
    }

    @XmlElementWrapper(name = "DepositsTerms")
    @XmlElement(name = "DepositsTerm")
    public DepositsTerm[] getDepositsTerm()
    {
        return depositsTerm;
    }

    public void setDepositsTerm(DepositsTerm[] depositsTerm)
    {
        this.depositsTerm = depositsTerm;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalancesDepositsTermResponse [depositsTerm=");
        builder.append(Arrays.toString(depositsTerm));
        builder.append("]");
        return builder.toString();
    }

}
