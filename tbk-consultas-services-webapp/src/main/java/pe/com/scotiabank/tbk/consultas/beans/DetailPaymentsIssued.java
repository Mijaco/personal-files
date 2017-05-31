
package pe.com.scotiabank.tbk.consultas.beans;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TB2LOutput;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;

@XmlType(namespace="http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class DetailPaymentsIssued
{
    private String nameBeneficiary;
    private String numberLog;
    private String hour;
    private DataDetailPaymentsIssued[] listDetailPaymentsIssued;

    public DetailPaymentsIssued()
    {
    }

    public DetailPaymentsIssued(TB2LOutput output)
    {
        super();
        this.nameBeneficiary = (output.getNameBeneficiary() != null) ? output.getNameBeneficiary() : null;
        this.numberLog = (output.getNumberLog() != null) ? output.getNumberLog() : null;
        this.hour = (output.getHour() != null) ? output.getHour() : null;
        this.listDetailPaymentsIssued = getDetailFromString(output.getStringDetail());
    }

    public DataDetailPaymentsIssued[] getDetailFromString(String detail){
        DataDetailPaymentsIssued[] listMove = new DataDetailPaymentsIssued[ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_NUMBER];
        int pos = 0;
        int i = 1;
        String datoArreglo;
        do
        {
            datoArreglo = detail.substring(pos, pos + ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA).trim();
            if (!datoArreglo.equals(""))
            {
                listMove[i - 1] = new DataDetailPaymentsIssued(
                        detail.substring((i - 1) * ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA,
                                i * ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA));
            }else{
                break;
            }
            pos = pos + ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA;
            i++;
        }
        while (i <= ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_NUMBER);
        return listMove;
    }
    public void setListDetailPaymentsIssued(DataDetailPaymentsIssued[] listDetailPaymentsIssued)
    {
        this.listDetailPaymentsIssued = listDetailPaymentsIssued;
    }

    public String getNameBeneficiary()
    {
        return nameBeneficiary;
    }

    public void setNamePayer(String nameBeneficiary)
    {
        this.nameBeneficiary = nameBeneficiary;
    }

    public String getNumberLog()
    {
        return numberLog;
    }

    public void setNumberLog(String numberLog)
    {
        this.numberLog = numberLog;
    }

    public String getHour()
    {
        return hour;
    }

    public void setHour(String hour)
    {
        this.hour = hour;
    }

    @XmlElementWrapper(name = "listDetailPaymentsIssued")
    @XmlElement(name="listDetailPaymentsIssued")
    public DataDetailPaymentsIssued[] getListDetailPaymentsIssued()
    {
        return listDetailPaymentsIssued;
    }

    public void setNameBeneficiary(String nameBeneficiary)
    {
        this.nameBeneficiary = nameBeneficiary;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DetailPaymentsIssuedDTO [nameBeneficiary=");
        builder.append(nameBeneficiary);
        builder.append(", numberLog=");
        builder.append(numberLog);
        builder.append(", hour=");
        builder.append(hour);
        builder.append(", listDetailPaymentsIssued=");
        builder.append(Arrays.toString(listDetailPaymentsIssued));
        builder.append("]");
        return builder.toString();
    }

}
