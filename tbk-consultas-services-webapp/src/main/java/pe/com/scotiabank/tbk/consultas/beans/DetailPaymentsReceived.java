
package pe.com.scotiabank.tbk.consultas.beans;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TB29Output;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;

@XmlType(namespace="http://response.jaxws.tbk.scotiabank.com.pe")
public class DetailPaymentsReceived
{

    private String namePayer;
    private String numberLog;
    private String hour;
    private DataDetailPaymentsReceived[] listDetailPaymentsReceived;

    
    public DetailPaymentsReceived()
    {
    }

    
    public DetailPaymentsReceived(TB29Output output)
    {
        super();
        this.namePayer = (output.getNamePayer() != null) ? output.getNamePayer() : null;
        this.numberLog = (output.getNumberLog() != null) ? output.getNumberLog() : null;
        this.hour = (output.getHour() != null) ? output.getHour() : null;
        this.listDetailPaymentsReceived = getDetailFromString(output.getStringDetail());
    }
    public DataDetailPaymentsReceived[] getDetailFromString(String detail)
    {
        DataDetailPaymentsReceived[] listMove = new DataDetailPaymentsReceived[ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_NUMBER];
        int pos = 0;
        int i = 1;
        String datoArreglo;
        do
        {
            datoArreglo = detail.substring(pos, pos + ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA).trim();
            if (!datoArreglo.equals(""))
            {
                listMove[i - 1] = new DataDetailPaymentsReceived(
                        detail.substring((i - 1) * ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA,
                                i * ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA));
            }
            else
            {
                break;
            }
            pos = pos + ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_LENGTH_TRAMA;
            i++;
        }
        while (i <= ConsultasWsConstants.TBK_TB_OUTPUT_DETAIL_NUMBER);
        return listMove;
    }
    
    public String getNamePayer()
    {
        return namePayer;
    }

    public void setNamePayer(String namePayer)
    {
        this.namePayer = namePayer;
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

    @XmlElementWrapper(name = "listDetailPaymentsReceived")
    @XmlElement(name="listDetailPaymentsReceived")
    public DataDetailPaymentsReceived[] getListDetailPaymentsReceived()
    {
        return listDetailPaymentsReceived;
    }

   
    
    public void setListDetailPaymentsReceived(DataDetailPaymentsReceived[] listDetailPaymentsReceived)
    {
        this.listDetailPaymentsReceived = listDetailPaymentsReceived;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("DetailPaymentsReceived [namePayer=");
        builder.append(namePayer);
        builder.append(", numberLog=");
        builder.append(numberLog);
        builder.append(", hour=");
        builder.append(hour);
        builder.append(", listDetailPaymentsReceived=");
        builder.append(Arrays.toString(listDetailPaymentsReceived));
        builder.append("]");
        return builder.toString();
    }

}
