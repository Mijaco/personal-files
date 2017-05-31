
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.beans.AccountData;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "AccountDataResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlType(name = "")
public class AccountDataResponse extends Response
{
    private static final long serialVersionUID = 1L;
    AccountData accountData;

    public AccountDataResponse()
    {

    }

    public AccountDataResponse(Status status)
    {
        super(status);
    }

    public AccountDataResponse(String code, String message)
    {
        super(code, message);
    }

    public AccountData getAccountData()
    {
        return accountData;
    }

    public void setAccountData(AccountData accountData)
    {
        this.accountData = accountData;
    }

    @Override
    public String toString()
    {
        return "AccountDataResponse [accountData=" + accountData + "]";
    }

}
