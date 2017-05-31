
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBACOutput;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class AdvanceAccountList implements Serializable
{
    private static final long serialVersionUID = -7360680604642597931L;
    private AdvanceAccount[] advanceAccounts;

    public AdvanceAccountList()
    {
    }

    public AdvanceAccountList(TBACOutput tbg3Output)
    {
        List<AdvanceAccount> advanceAccountsList = new ArrayList<AdvanceAccount>();

        for (AdvanceAccountBean mortgageDetail2 : tbg3Output.getAdvanceAccountBeans())
        {
            advanceAccountsList.add(new AdvanceAccount(mortgageDetail2));
        }
        this.advanceAccounts = advanceAccountsList.toArray(new AdvanceAccount[0]);
    }

    public AdvanceAccountList(String registerQuantities, List<AdvanceAccount> mortgageDetail)
    {
        this.advanceAccounts = mortgageDetail.toArray(new AdvanceAccount[0]);
    }

    @XmlElementWrapper(name="")
    public AdvanceAccount[] getAdvanceAccounts()
    {
        return advanceAccounts;
    }

    public void setAdvanceAccounts(AdvanceAccount[] advanceAccounts)
    {
        this.advanceAccounts = advanceAccounts;
    }

    @Override
    public String toString()
    {
        return "AdvanceAccountList [advanceAccounts=" + Arrays.toString(advanceAccounts) + "]";
    }

}
