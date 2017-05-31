
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.beans.NotesPdf;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "CallPdfResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlType(name = "")
public class CallPdfResponse extends Response
{

    private static final long serialVersionUID = 7486303135210081133L;
    NotesPdf notesPdf;

    public CallPdfResponse()
    {
    }

    public CallPdfResponse(Status status)
    {
        super(status);
    }

    public CallPdfResponse(String code, String message)
    {
        super(code, message);
    }

    public NotesPdf getNotesPdf()
    {
        return notesPdf;
    }

    public void setNotesPdf(NotesPdf notesPdf)
    {
        this.notesPdf = notesPdf;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("CallPdfResponse [notesPdf=");
        builder.append(notesPdf);
        builder.append("]");
        return builder.toString();
    }

}
