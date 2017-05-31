
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.PDFOutput;

@XmlType(name = "", namespace = "http://response.notesandconstancyservices.jaxws.tbk.scotiabank.com.pe")
public class NotesPdf implements Serializable
{

    private static final long serialVersionUID = 633976710839112531L;
    private String url;

    public NotesPdf()
    {

    }

    public NotesPdf(PDFOutput tby7output)
    {
        this.url = tby7output.getUrl();

    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("NotesPdf [url=");
        builder.append(url);
        builder.append("]");
        return builder.toString();
    }

}
