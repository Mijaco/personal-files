
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

public class LoanApplication implements Serializable
{
    private static final long serialVersionUID = 879183136935858313L;
    
    private String number;
    private String fromDate;
    private String toDate;
    private String status;
    private LoanApplicationDetail[] details;

    public LoanApplication()
    {

    }

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getFromDate()
    {
        return fromDate;
    }

    public void setFromDate(String fromDate)
    {
        this.fromDate = fromDate;
    }

    public String getToDate()
    {
        return toDate;
    }

    public void setToDate(String toDate)
    {
        this.toDate = toDate;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public LoanApplicationDetail[] getDetails()
    {
        return details;
    }

    public void setDetails(LoanApplicationDetail[] details)
    {
        this.details = details;
    }
}
