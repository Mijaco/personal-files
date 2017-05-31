
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBG3Output;

//@XmlRootElement(name = "MortGage", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
public class MortGage implements Serializable
{

    private static final long serialVersionUID = 2776540806119531074L;
    private String registerQuantities;
    private MortgageDetail[] mortgageDetail;

    public MortGage()
    {
    }

    public MortGage(TBG3Output tbg3Output)
    {

        registerQuantities = tbg3Output.getRegisterQuantities();
        List<MortgageDetail> mortgageDetail = new ArrayList<MortgageDetail>();

        for (MortgageDetailBean mortgageDetail2 : tbg3Output.getMortgageDetail())
        {
            mortgageDetail.add(new MortgageDetail(mortgageDetail2));
        }
        this.mortgageDetail = mortgageDetail.toArray(new MortgageDetail[0]);
    }

    public MortGage(String registerQuantities, List<MortgageDetail> mortgageDetail)
    {
        this.registerQuantities = registerQuantities;
        this.mortgageDetail = mortgageDetail.toArray(new MortgageDetail[0]);
    }

    public String getRegisterQuantities()
    {
        return registerQuantities;
    }

    public void setRegisterQuantities(String registerQuantities)
    {
        this.registerQuantities = registerQuantities;
    }
    
    public MortgageDetail[] getMortgageDetail()
    {
        return mortgageDetail;
    }

    public void setMortgageDetail(MortgageDetail[] mortgageDetail)
    {
        this.mortgageDetail = mortgageDetail;
    }

    @Override
    public String toString()
    {
        return "MortGage [registerQuantities=" + registerQuantities + ", mortgageDetail=" + Arrays.toString(mortgageDetail) + "]";
    }

}
