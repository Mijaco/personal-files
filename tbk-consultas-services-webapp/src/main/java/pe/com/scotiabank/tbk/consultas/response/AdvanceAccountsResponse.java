
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.beans.AdvanceAccountList;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "AdvanceAcountsResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlType(name = "")
public class AdvanceAccountsResponse extends Response
{
    private static final long serialVersionUID = 1L;
    AdvanceAccountList advanceAccountList;

    public AdvanceAccountsResponse()
    {

    }

    public AdvanceAccountsResponse(Status status)
    {
        super(status);
    }

    public AdvanceAccountsResponse(String code, String message)
    {
        super(code, message);
    }

    public AdvanceAccountList getAdvanceAccountList()
    {
        return advanceAccountList;
    }

    public void setAdvanceAccountList(AdvanceAccountList advanceAccountList)
    {
        this.advanceAccountList = advanceAccountList;
    }

    @Override
    public String toString()
    {
        return "AdvanceAccountsResponse [advanceAccountList=" + advanceAccountList + "]";
    }

}
