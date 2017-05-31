
package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.sun.xml.txw2.annotation.XmlElement;

import pe.com.scotiabank.tbk.util.base.Reportable;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlElement(value="DataDetailPaymentsIssued")
public class DataDetailPaymentsIssued implements Reportable
{
    private String typeDocument;
    private String numberDocument;
    private String dateDocument;
    private String moneyDocument;
    private String amountDocument;
    private String signAmount;
    private String sequenceDetail;
    
    public DataDetailPaymentsIssued(String trama)
    {
        this.typeDocument = trama.substring(0, 1);
        this.numberDocument = trama.substring(1, 21);
        this.dateDocument = trama.substring(21, 29);
        this.moneyDocument = trama.substring(29, 30);
        this.amountDocument = trama.substring(30, 44);
        this.signAmount = trama.substring(44, 45);
        this.sequenceDetail = trama.substring(45, 49);
    }

    public DataDetailPaymentsIssued()
    {
        super();
    }

    public String getTypeDocument()
    {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument)
    {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument()
    {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument)
    {
        this.numberDocument = numberDocument;
    }

    public String getDateDocument()
    {
        return dateDocument;
    }

    public void setDateDocument(String dateDocument)
    {
        this.dateDocument = dateDocument;
    }

    public String getMoneyDocument()
    {
        return moneyDocument;
    }

    public void setMoneyDocument(String moneyDocument)
    {
        this.moneyDocument = moneyDocument;
    }

    public String getAmountDocument()
    {
        return amountDocument;
    }

    public void setAmountDocument(String amountDocument)
    {
        this.amountDocument = amountDocument;
    }

    public String getSignAmount()
    {
        return signAmount;
    }

    public void setSignAmount(String signAmount)
    {
        this.signAmount = signAmount;
    }

    public String getSequenceDetail()
    {
        return sequenceDetail;
    }

    public void setSequenceDetail(String sequenceDetail)
    {
        this.sequenceDetail = sequenceDetail;
    }
    @Override
    public String toString()
    {
        return new StringBuilder().append(typeDocument).append(numberDocument).append(dateDocument).append(moneyDocument).append(amountDocument).append(signAmount).append(sequenceDetail).toString();
    }

    @Override
    public String[] getRow()
    {
        return new String[] {typeDocument,numberDocument,dateDocument,moneyDocument,amountDocument};
    }
    
}
