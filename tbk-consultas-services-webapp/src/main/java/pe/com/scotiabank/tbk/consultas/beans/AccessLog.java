package pe.com.scotiabank.tbk.consultas.beans;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBNCOutput;

@XmlType(name = "", namespace = "http://response.notesandconstancyservices.jaxws.tbk.scotiabank.com.pe")
public class AccessLog implements Serializable
{

    private static final long serialVersionUID = 7590570340851819594L;
    private String returnCode;
    private String errorCode;
    private String outputMessage;

    public AccessLog()
    {

    }

    public AccessLog(TBNCOutput tbncOutput)
    {
        this.returnCode = tbncOutput.getReturnCode();
        this.errorCode = tbncOutput.getErrorCode();
        this.outputMessage = tbncOutput.getOutputMessage();
    }

    public String getReturnCode()
    {
        return returnCode;
    }

    public void setReturnCode(String returnCode)
    {
        this.returnCode = returnCode;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getOutputMessage()
    {
        return outputMessage;
    }

    public void setOutputMessage(String outputMessage)
    {
        this.outputMessage = outputMessage;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AccessLog [returnCode=");
        builder.append(returnCode);
        builder.append(", errorCode=");
        builder.append(errorCode);
        builder.append(", outputMessage=");
        builder.append(outputMessage);
        builder.append("]");
        return builder.toString();
    }

}
