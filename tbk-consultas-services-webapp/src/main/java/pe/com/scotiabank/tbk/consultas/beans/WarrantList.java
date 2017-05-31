
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBG1Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class WarrantList implements Serializable
{

    private static final long serialVersionUID = -1500628993220874750L;
    private String registerQuantities;
    private Warrant[] warrants;

    public WarrantList()
    {
    }

    public WarrantList(TBG1Output tbg3Output)
    {

        registerQuantities = tbg3Output.getRegisterQuantities();
        List<Warrant> mortgageDetail = new ArrayList<Warrant>();

        for (WarrantBean mortgageDetail2 : tbg3Output.getWarrantBeans())
        {
            mortgageDetail.add(new Warrant(mortgageDetail2));
        }
        this.warrants = mortgageDetail.toArray(new Warrant[0]);
    }

    public WarrantList(String registerQuantities, List<WarrantBean> mortgageDetail)
    {
        this.registerQuantities = registerQuantities;
        this.warrants = mortgageDetail.toArray(new Warrant[0]);
    }

    public String getRegisterQuantities()
    {
        return registerQuantities;
    }

    public void setRegisterQuantities(String registerQuantities)
    {
        this.registerQuantities = registerQuantities;
    }

    public Warrant[] getWarrants()
    {
        return warrants;
    }

    public void setWarrants(Warrant[] warrants)
    {
        this.warrants = warrants;
    }

    @Override
    public String toString()
    {
        return "WarrantList [registerQuantities=" + registerQuantities + ", warrants=" + Arrays.toString(warrants) + "]";
    }

}
