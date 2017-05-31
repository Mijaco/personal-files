
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.URLOutput;

@XmlType(name = "", namespace = "http://response.notesandconstancyservices.jaxws.tbk.scotiabank.com.pe")
public class NotesUrl implements Serializable
{

    private static final long serialVersionUID = -2682473335438073555L;
    private Integer totalRecords;
	private String fileName;
	private Boolean hasNextPage;
    private NotesUrlDetail[] notesUrlDetail;

    public NotesUrl()
    {

    }

    public NotesUrl(URLOutput tby7output)
    {

        this.loadloadNotesUrl(tby7output.getNotesUrlDetail());
    }

    public void loadloadNotesUrl(NotesUrlDetail[] notesUrlDetail)
    {
        int tamanio = notesUrlDetail.length;

        this.notesUrlDetail = new NotesUrlDetail[tamanio];

        for (int i = 0; i < tamanio; i++)
        {

            notesUrlDetail[i] = new NotesUrlDetail(String.valueOf(notesUrlDetail[i].getKey()), String.valueOf(notesUrlDetail[i].getAplication()), String.valueOf(notesUrlDetail[i].getDate()),
                    String.valueOf(notesUrlDetail[i].getCorrelative()), String.valueOf(notesUrlDetail[i].getAccountBt()), String.valueOf(notesUrlDetail[i].getSubAccountBt()),
                    String.valueOf(notesUrlDetail[i].getAccount()),String.valueOf(notesUrlDetail[i].getAccountName()), String.valueOf(notesUrlDetail[i].getTelewieseCod()), String.valueOf(notesUrlDetail[i].getIdentity()),
                    String.valueOf(notesUrlDetail[i].getClient()), String.valueOf(notesUrlDetail[i].getPagNumber()), String.valueOf(notesUrlDetail[i].getUrl()));

        }
    }

    public NotesUrlDetail[] getNotesUrlDetail()
    {
        return notesUrlDetail;
    }

    public void setNotesUrlDetail(NotesUrlDetail[] notesUrlDetail)
    {
        this.notesUrlDetail = notesUrlDetail;
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

	public Boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	@Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("NotesUrl [fileName=");
        builder.append(fileName);
        builder.append(",totalRecords=");
        builder.append(totalRecords);
        builder.append(",hasNextPage=");
        builder.append(hasNextPage);
        builder.append(",notesUrlDetail=");
        builder.append(Arrays.toString(notesUrlDetail));
        builder.append("]");
        return builder.toString();
    }

}
