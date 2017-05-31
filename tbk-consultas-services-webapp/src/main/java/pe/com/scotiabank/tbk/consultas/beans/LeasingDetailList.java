
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBW7Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class LeasingDetailList implements Serializable
{

    private static final long serialVersionUID = -1416495982877066158L;
    private LeasingDetail[] leasings;

    public LeasingDetailList()
    {

    }

    public LeasingDetailList(TBW7Output tbw7Output)
    {
        this.loadInquiryDetailLeasing(tbw7Output.getLeasings());
    }

    public void loadInquiryDetailLeasing(LeasingDetailBean[] detailLeasingBeans)
    {
        int tamanio = detailLeasingBeans.length;

        this.leasings = new LeasingDetail[tamanio];

        for (int i = 0; i < tamanio; i++)
        {

            leasings[i] = new LeasingDetail(detailLeasingBeans[i].getPgCod(), detailLeasingBeans[i].getModule(), detailLeasingBeans[i].getCoin(), detailLeasingBeans[i].getScPap(),
                    detailLeasingBeans[i].getCtaBt(), detailLeasingBeans[i].getSubsidiary(), detailLeasingBeans[i].getOperation(), detailLeasingBeans[i].getSubOperation(),
                    detailLeasingBeans[i].getTypeOperation(), detailLeasingBeans[i].getAmount(), detailLeasingBeans[i].getSign(), detailLeasingBeans[i].getExpDate(),
                    detailLeasingBeans[i].getDescription());
        }
    }

    @XmlElementWrapper(name="leasings")
    public LeasingDetail[] getLeasings()
    {
        return leasings;
    }

    public void setLeasings(LeasingDetail[] leasings)
    {
        this.leasings = leasings;
    }

    @Override
    public String toString()
    {
        return "ConsultaDetalleLeasing [leasings=" + Arrays.toString(leasings) + "]";
    }

}
