
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBG2Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class GuaranteeList implements Serializable
{

    private static final long serialVersionUID = 957596951653975796L;
    private String registerQuantities;
    private Guarantee[] mortgageDetail;

    public GuaranteeList()
    {
    }

    public GuaranteeList(TBG2Output tbg3Output)
    {
        registerQuantities = tbg3Output.getRegisterQuantities();
        List<Guarantee> mortgageDetail = new ArrayList<Guarantee>();

        for (GuaranteeBean mortgageDetail2 : tbg3Output.getGuaranteeBeans())
        {
            mortgageDetail.add(new Guarantee(mortgageDetail2));
        }
        this.mortgageDetail = mortgageDetail.toArray(new Guarantee[0]);
    }

    public GuaranteeList(String registerQuantities, List<GuaranteeBean> mortgageDetail)
    {
        this.registerQuantities = registerQuantities;
        this.mortgageDetail = mortgageDetail.toArray(new Guarantee[0]);
    }

    public String getRegisterQuantities()
    {
        return registerQuantities;
    }

    public void setRegisterQuantities(String registerQuantities)
    {
        this.registerQuantities = registerQuantities;
    }

    public Guarantee[] getGuaranteeBean()
    {
        return mortgageDetail;
    }

    public void setGuaranteeBean(Guarantee[] mortgageDetail)
    {
        this.mortgageDetail = mortgageDetail;
    }

    @Override
    public String toString()
    {
        return "GuaranteeList [registerQuantities=" + registerQuantities + ", mortgageDetail=" + Arrays.toString(mortgageDetail) + "]";
    }

}
