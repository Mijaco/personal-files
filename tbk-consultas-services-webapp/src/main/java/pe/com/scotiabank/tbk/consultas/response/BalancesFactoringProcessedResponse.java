
package pe.com.scotiabank.tbk.consultas.response;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.ProcessedBalancesDetail;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BalancesFactoringProcessedResponse", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class BalancesFactoringProcessedResponse extends Response
{

    private static final long serialVersionUID = 2856890442668359298L;

    private String cantTotDocSoles;
    private String impTotDocSoles;
    private String signTotDocSoles;
    private String cantTotDocDolars;
    private String impTotDocDolars;
    private String signTotDocDolars;
    private String acceptantAmounts;
    private ProcessedBalancesDetail[] processedBalancesDetail;

    public BalancesFactoringProcessedResponse()
    {
    }

    public BalancesFactoringProcessedResponse(Status status)
    {
        super(status);
    }

    public BalancesFactoringProcessedResponse(String code, String message)
    {
        super(code, message);
    }

    public String getCantTotDocSoles()
    {
        return cantTotDocSoles;
    }

    public void setCantTotDocSoles(String cantTotDocSoles)
    {
        this.cantTotDocSoles = cantTotDocSoles;
    }

    public String getImpTotDocSoles()
    {
        return impTotDocSoles;
    }

    public void setImpTotDocSoles(String impTotDocSoles)
    {
        this.impTotDocSoles = impTotDocSoles;
    }

    public String getSignTotDocSoles()
    {
        return signTotDocSoles;
    }

    public void setSignTotDocSoles(String signTotDocSoles)
    {
        this.signTotDocSoles = signTotDocSoles;
    }

    public String getCantTotDocDolars()
    {
        return cantTotDocDolars;
    }

    public void setCantTotDocDolars(String cantTotDocDolars)
    {
        this.cantTotDocDolars = cantTotDocDolars;
    }

    public String getImpTotDocDolars()
    {
        return impTotDocDolars;
    }

    public void setImpTotDocDolars(String impTotDocDolars)
    {
        this.impTotDocDolars = impTotDocDolars;
    }

    public String getSignTotDocDolars()
    {
        return signTotDocDolars;
    }

    public void setSignTotDocDolars(String signTotDocDolars)
    {
        this.signTotDocDolars = signTotDocDolars;
    }

    public String getAcceptantAmounts()
    {
        return acceptantAmounts;
    }

    public void setAcceptantAmounts(String acceptantAmounts)
    {
        this.acceptantAmounts = acceptantAmounts;
    }

    @XmlElementWrapper(name = "processedBalancesDetails")
    @XmlElement(name = "ProcessedBalancesDetail")
    public ProcessedBalancesDetail[] getProcessedBalancesDetail()
    {
        return processedBalancesDetail;
    }

    public void setProcessedBalancesDetail(ProcessedBalancesDetail[] processedBalancesDetail)
    {
        this.processedBalancesDetail = processedBalancesDetail;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BalancesFactoringProcessedResponse [cantTotDocSoles=");
        builder.append(cantTotDocSoles);
        builder.append(", impTotDocSoles=");
        builder.append(impTotDocSoles);
        builder.append(", signTotDocSoles=");
        builder.append(signTotDocSoles);
        builder.append(", cantTotDocDolars=");
        builder.append(cantTotDocDolars);
        builder.append(", impTotDocDolars=");
        builder.append(impTotDocDolars);
        builder.append(", signTotDocDolars=");
        builder.append(signTotDocDolars);
        builder.append(", acceptantAmounts=");
        builder.append(acceptantAmounts);
        builder.append(", processedBalancesDetail=");
        builder.append(Arrays.toString(processedBalancesDetail));
        builder.append("]");
        return builder.toString();
    }

}
