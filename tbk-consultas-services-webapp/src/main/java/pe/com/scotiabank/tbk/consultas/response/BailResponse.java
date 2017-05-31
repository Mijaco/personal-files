
package pe.com.scotiabank.tbk.consultas.response;

import javax.xml.bind.annotation.XmlRootElement;

import pe.com.scotiabank.tbk.consultas.beans.Bail;
import pe.com.scotiabank.tbk.util.beans.Response;
import pe.com.scotiabank.tbk.util.beans.Status;

@XmlRootElement(name = "BailResponse", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
public class BailResponse extends Response
{

    private static final long serialVersionUID = 7198882053919975678L;
    private Bail bail;
    private Integer totalRecords;
	private String fileName;
	
    public BailResponse()
    {
    }

    public BailResponse(Status status)
    {
        super(status);
    }

    public BailResponse(String code, String message)
    {
        super(code, message);
    }

    public Bail getBail()
    {
        return bail;
    }

    public void setBail(Bail bail)
    {
        this.bail = bail;
    }

    public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("BailResponse [bail=");
        builder.append(bail);
        builder.append("]");
        return builder.toString();
    }

}
