
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.beans.NotesUrl;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "CallUrlResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlType(name = "")
public class CallUrlResponse extends Response
{

    private static final long serialVersionUID = 8681614948699468614L;
    
    NotesUrl notesUrl;

    public CallUrlResponse()
    {
    }

    public CallUrlResponse(Status status)
    {
        super(status);
    }

    public CallUrlResponse(String code, String message)
    {
        super(code, message);
    }

    public NotesUrl getNotesUrl()
    {
        return notesUrl;
    }

    public void setNotesUrl(NotesUrl notesUrl)
    {
        this.notesUrl = notesUrl;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("CallUrlResponse [notesUrl=");
        builder.append(notesUrl);
        builder.append("]");
        return builder.toString();
    }

    
    
}
