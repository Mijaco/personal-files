
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.beans.AccessLog;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "AccessLogResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlType(name = "")
public class AccessLogResponse extends Response
{

    private static final long serialVersionUID = -7297539674531063488L;
    AccessLog accessLog;

    public AccessLogResponse()
    {
    }

    public AccessLogResponse(Status status)
    {
        super(status);
    }

    public AccessLogResponse(String code, String message)
    {
        super(code, message);
    }

    public AccessLog getAccessLog()
    {
        return accessLog;
    }

    public void setAccessLog(AccessLog accessLog)
    {
        this.accessLog = accessLog;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("AccessLogResponse [accessLog=");
        builder.append(accessLog);
        builder.append("]");
        return builder.toString();
    }

}
