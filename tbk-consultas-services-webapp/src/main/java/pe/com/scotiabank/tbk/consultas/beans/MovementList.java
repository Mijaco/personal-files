
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TRCMFileOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TRCMOutput;

//@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
public class MovementList implements Serializable
{

    private static final long serialVersionUID = 4704265133758741337L;
    private String sessionName;
    private String ctaBt;
    private String accBalanceAmount;
    private String accBalanceSign;
    private String accAvailableAmount;
    private String accAvailableSign;
    private Movement[] dataFileStructure;

    public MovementList()
    {

    }

    public MovementList(String sessionName, String ctaBt, String accBalanceAmount, String accBalanceSign, String accAvailableAmount, String accAvailableSign, List<TRCMFileOutput> dataFileStructure)
    {
        this.sessionName = sessionName;
        this.ctaBt = ctaBt;
        this.accBalanceAmount = accBalanceAmount;
        this.accBalanceSign = accBalanceSign;
        this.accAvailableAmount = accAvailableAmount;
        this.accAvailableSign = accAvailableSign;
        this.dataFileStructure = loadQueryMovements(dataFileStructure).toArray(new Movement[0]);
    }

    public MovementList(TRCMOutput output)
    {
        sessionName = output.getSessionName();
        ctaBt = output.getCtaBt();
        accBalanceAmount = output.getAmountAccBalance();
        accBalanceSign = output.getSignAccBalance();
        accAvailableAmount = output.getAmountAccAvailable();
        accAvailableSign = output.getSignAccAvailable();

        dataFileStructure = loadQueryMovements(output.getDataFileStructure()).toArray(new Movement[output.getDataFileStructure().size()]);

    }

    public List<Movement> loadQueryMovements(List<TRCMFileOutput> dataFileStructureTRCMFileOutput)
    {

        List<Movement> queryMovements = new ArrayList<Movement>();

        if (!dataFileStructureTRCMFileOutput.isEmpty())
        {
            queryMovements = new ArrayList<Movement>();
            for (TRCMFileOutput trcmFileOutput : dataFileStructureTRCMFileOutput)
            {
                queryMovements.add(new Movement(trcmFileOutput));
            }
        }

        return queryMovements;
    }

    public String getSessionName()
    {
        return sessionName;
    }

    public void setSessionName(String sessionName)
    {
        this.sessionName = sessionName;
    }

    public String getCtaBt()
    {
        return ctaBt;
    }

    public void setCtaBt(String ctaBt)
    {
        this.ctaBt = ctaBt;
    }

    public String getAccBalanceAmount()
    {
        return accBalanceAmount;
    }

    public void setAccBalanceAmount(String accBalanceAmount)
    {
        this.accBalanceAmount = accBalanceAmount;
    }

    public String getAccBalanceSign()
    {
        return accBalanceSign;
    }

    public void setAccBalanceSign(String accBalanceSign)
    {
        this.accBalanceSign = accBalanceSign;
    }

    public String getAccAvailableAmount()
    {
        return accAvailableAmount;
    }

    public void setAccAvailableAmount(String accAvailableAmount)
    {
        this.accAvailableAmount = accAvailableAmount;
    }

    public String getAccAvailableSign()
    {
        return accAvailableSign;
    }

    public void setAccAvailableSign(String accAvailableSign)
    {
        this.accAvailableSign = accAvailableSign;
    }

    public Movement[] getDataFileStructure()
    {
        return dataFileStructure;
    }

    public void setDataFileStructure(Movement[] dataFileStructure)
    {
        this.dataFileStructure = dataFileStructure;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MovementList [sessionName=");
        builder.append(sessionName);
        builder.append(", ctaBt=");
        builder.append(ctaBt);
        builder.append(", accBalanceAmount=");
        builder.append(accBalanceAmount);
        builder.append(", accBalanceSign=");
        builder.append(accBalanceSign);
        builder.append(", accAvailableAmount=");
        builder.append(accAvailableAmount);
        builder.append(", accAvailableSign=");
        builder.append(accAvailableSign);
        builder.append(", dataFileStructure=");
        builder.append(Arrays.toString(dataFileStructure));
        builder.append("]");
        return builder.toString();
    }

}
