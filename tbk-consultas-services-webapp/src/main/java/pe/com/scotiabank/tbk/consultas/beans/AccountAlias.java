
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.StringUtils;

import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.trama.Body;

/**
 * TRAMAS: <b>[TRLC]</b>
 * 
 * @author jventura
 *
 */
// @XmlRootElement(name = "AccountAlias", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAlias", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class AccountAlias implements Body, Serializable
{

    private static final long serialVersionUID = 5766657322028223052L;

    public static final int TBK_OUPUT_ATTR_LENGTH_DATE_ACCOUNT = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_ALIAS_ACCOUNT = 30;

    private String accountNumber;
    private String accountAlias;

    public AccountAlias()
    {
    }

    public AccountAlias(String output)
    {
        setStringBody(output);
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountAlias()
    {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias)
    {
        this.accountAlias = accountAlias;
    }

    @Override
    public void setStringBody(String output)
    {
        output = StringUtils.rightPad(output, TBK_OUPUT_ATTR_LENGTH_DATE_ACCOUNT + TBK_OUPUT_ATTR_LENGTH_ALIAS_ACCOUNT,
                ConsultasWsConstants.CONSTANT_SPACE_CHAR);
        int it = 0;
        setAccountNumber(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DATE_ACCOUNT));
        setAccountAlias(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_ALIAS_ACCOUNT));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(accountNumber);
        builder.append(accountAlias);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AccountAlias [accountNumber=");
        builder.append(accountNumber);
        builder.append(", accountAlias=");
        builder.append(accountAlias);
        builder.append("]");
        return builder.toString();
    }

}
