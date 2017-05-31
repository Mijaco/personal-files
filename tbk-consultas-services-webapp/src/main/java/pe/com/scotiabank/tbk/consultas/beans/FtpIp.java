
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBY7Output;

@XmlType(name = "", namespace = "http://response.notesandconstancyservices.jaxws.tbk.scotiabank.com.pe")
public class FtpIp implements Serializable
{

    private static final long serialVersionUID = -7738720602806249112L;
    private String ipAddress;
    private String datum1;
    private String datum2;

    public FtpIp()
    {

    }

    public FtpIp(TBY7Output tby7output)
    {
        this.ipAddress = tby7output.getIpAddress();
        this.datum1 = tby7output.getDatum1();
        this.datum2 = tby7output.getDatum2();
    }

    public String getIpAddress()
    {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress)
    {
        this.ipAddress = ipAddress;
    }

    public String getDatum1()
    {
        return datum1;
    }

    public void setDatum1(String datum1)
    {
        this.datum1 = datum1;
    }

    public String getDatum2()
    {
        return datum2;
    }

    public void setDatum2(String datum2)
    {
        this.datum2 = datum2;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("FtpIp [ipAddress=");
        builder.append(ipAddress);
        builder.append(", datum1=");
        builder.append(datum1);
        builder.append(", datum2=");
        builder.append(datum2);
        builder.append("]");
        return builder.toString();
    }

    
}
