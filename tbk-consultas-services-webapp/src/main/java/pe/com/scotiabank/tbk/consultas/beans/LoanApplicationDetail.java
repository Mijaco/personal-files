
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;

@XmlElement(value = "LoanApplicationDetail")
public class LoanApplicationDetail implements Serializable,Reportable
{
    private static final long serialVersionUID = 2936918135138998226L;
    
    private String number;
    private String date;
    private String reference;
    private String companyRelationship;
    private String status;
    private String resto;

    public LoanApplicationDetail()
    {

    }

    public LoanApplicationDetail(LoanApplicationDetail objLoanApplicationDetail)
    {
        this.number = objLoanApplicationDetail.getNumber();
        this.date = objLoanApplicationDetail.getDate();
        this.reference = objLoanApplicationDetail.getReference();
        this.companyRelationship = objLoanApplicationDetail.getCompanyRelationship();
        this.status = objLoanApplicationDetail.getStatus();
    }

    public LoanApplicationDetail(String trama)
    {
        setResto(trama.substring(0, 13));
        setNumber(trama.substring(13, 18));
        setDate(trama.substring(18, 28));
        setReference(trama.substring(28, 43));
        setCompanyRelationship(trama.substring(43, 88));
        setStatus(trama.substring(88, trama.length()));
    }
    
    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getCompanyRelationship()
    {
        return companyRelationship;
    }

    public void setCompanyRelationship(String companyRelationship)
    {
        this.companyRelationship = companyRelationship;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getResto()
    {
        return resto;
    }

    public void setResto(String resto)
    {
        this.resto = resto;
    }

    @Override
    public String toString()
    {
        return new StringBuilder().append(number).append(";").append(date).append(";").append(status).toString();
    }

    @Override
    public String[] getRow()
    {
        return new String[] { date, number, status };
    }
}
