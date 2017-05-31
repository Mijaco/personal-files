
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", namespace = "http://response.sessionservices.jaxws.tbk.scotiabank.com.pe")
public class Deposit implements Serializable
{

    private static final long serialVersionUID = 9050366897648639953L;
    private String sessionName;
    private Integer quantityRegister;
    private boolean hasNextPage;
    private DepositBean[] depositBean;

    public Deposit()
    {
    }

    public String getSessionName()
    {
        return sessionName;
    }

    public void setSessionName(String sessionName)
    {
        this.sessionName = sessionName;
    }

    public Integer getQuantityRegister()
    {
        return quantityRegister;
    }

    public void setQuantityRegister(Integer quantityRegister)
    {
        this.quantityRegister = quantityRegister;
    }

    public DepositBean[] getDepositBean()
    {
        return depositBean;
    }

    public void setDepositBean(DepositBean[] depositBean)
    {
        this.depositBean = depositBean;
    }

    public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	@Override
    public String toString()
    {
        return "Deposit [sessionName=" + sessionName + ", quantityRegister=" + quantityRegister + ", depositBean=" + Arrays.toString(depositBean) + "]";
    }

}
