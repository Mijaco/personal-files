
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "", namespace = "http://response.sessionservices.jaxws.tbk.scotiabank.com.pe")
public class Bail implements Serializable
{

    private static final long serialVersionUID = 8686299159320927212L;
    private String sessionName;
    private Integer quantityRegister;
    private BailBean[] bailBean;
    private boolean hasNextPage;

    public Bail()
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

    public BailBean[] getBailBean()
    {
        return bailBean;
    }

    public void setBailBean(BailBean[] bailBean)
    {
        this.bailBean = bailBean;
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
        StringBuilder builder = new StringBuilder();
        builder.append("Bail [sessionName=");
        builder.append(sessionName);
        builder.append(", quantityRegister=");
        builder.append(quantityRegister);
        builder.append(", hasNextPage=");
        builder.append(hasNextPage);
        builder.append(", bailBean=");
        builder.append(Arrays.toString(bailBean));
        builder.append("]");
        return builder.toString();
    }

}
