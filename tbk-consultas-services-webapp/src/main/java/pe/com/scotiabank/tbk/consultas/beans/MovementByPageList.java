
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TRCPFileOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TRCPOutput;

@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class MovementByPageList implements Serializable
{

    private static final long serialVersionUID = -9097420492588470327L;
    private String sessionName;
    private MovementByPage[] dataFileStructure;

    public MovementByPageList()
    {
    }

    public MovementByPageList(TRCPOutput output)
    {
        sessionName = output.getSessionName();
        dataFileStructure = loadListMovementsQueryByPage(output.getDataFileStructure()).toArray(new MovementByPage[output.getDataFileStructure().size()]);
    }

    private List<MovementByPage> loadListMovementsQueryByPage(List<TRCPFileOutput> dataFileStructureTRCPFileOutput)
    {

        List<MovementByPage> queryMovementsByPage = new ArrayList<MovementByPage>();

        if (!dataFileStructureTRCPFileOutput.isEmpty())
        {
            queryMovementsByPage = new ArrayList<MovementByPage>();

            for (TRCPFileOutput trcpFileOutput : dataFileStructureTRCPFileOutput)
            {
                queryMovementsByPage.add(new MovementByPage(trcpFileOutput));
            }
        }

        return queryMovementsByPage;

    }

    public String getSessionName()
    {
        return sessionName;
    }

    public void setSessionName(String sessionName)
    {
        this.sessionName = sessionName;
    }

    public MovementByPage[] getDataFileStructure()
    {
        return dataFileStructure;
    }

    public void setDataFileStructure(MovementByPage[] dataFileStructure)
    {
        this.dataFileStructure = dataFileStructure;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MovementByPageList [sessionName=");
        builder.append(sessionName);
        builder.append(", dataFileStructure=");
        builder.append(Arrays.toString(dataFileStructure));
        builder.append("]");
        return builder.toString();
    }

}
