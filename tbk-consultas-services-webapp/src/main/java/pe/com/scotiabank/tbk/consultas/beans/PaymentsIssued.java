
package pe.com.scotiabank.tbk.consultas.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TB2KFileOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TB2KOutput;
public class PaymentsIssued
{
    private String sessionName;
    private Integer nroRegistros;
    private Boolean hasNextPage;
    private DataPaymentsIssued[] listQueryIssuedPayments;
   
    public PaymentsIssued()
    {

    }

    public PaymentsIssued(TB2KOutput output)
    {
        super();
        this.listQueryIssuedPayments = getListTB2KQueryIssuedPayments(output.getDataFileStructure()).toArray(new DataPaymentsIssued[0]);
    }

    public List<DataPaymentsIssued> getListTB2KQueryIssuedPayments(List<TB2KFileOutput> TB2KFileOutput)
    {
        List<DataPaymentsIssued> queryIssuedPayments = new ArrayList<DataPaymentsIssued>();
        if (!TB2KFileOutput.isEmpty())
        {   for (TB2KFileOutput objTB2KFileOut : TB2KFileOutput){
                DataPaymentsIssued queryIssuedPaymentsObject = new DataPaymentsIssued();
                queryIssuedPaymentsObject.setNamePayer((objTB2KFileOut.getNamePayer()));
                queryIssuedPaymentsObject.setContract((objTB2KFileOut.getContract()));
                queryIssuedPaymentsObject.setNumberOrden((objTB2KFileOut.getNumberOrden()));
                queryIssuedPaymentsObject.setNumberSequence((objTB2KFileOut.getNumberSequence()));
                queryIssuedPaymentsObject.setDatePayment((objTB2KFileOut.getDatePayment()));
                queryIssuedPaymentsObject.setTypePayment((objTB2KFileOut.getTypePayment()));
                queryIssuedPaymentsObject.setStatus((objTB2KFileOut.getStatus()));
                queryIssuedPaymentsObject.setMoney((objTB2KFileOut.getMoney()));
                queryIssuedPaymentsObject.setAccountARA((objTB2KFileOut.getAccountARA()));
                queryIssuedPaymentsObject.setAmount((objTB2KFileOut.getAmount()));
                queryIssuedPaymentsObject.setSignAmount((objTB2KFileOut.getSignAmount()));
                queryIssuedPaymentsObject.setTypeDocumentBeneficiaryID((objTB2KFileOut.getTypeDocumentBeneficiaryID()));
                queryIssuedPaymentsObject.setNumberDocumentBeneficiaryID((objTB2KFileOut.getNumberDocumentBeneficiaryID()));
                queryIssuedPaymentsObject.setLiteralTypeOrder((objTB2KFileOut.getLiteralTypeOrder()).replace('\0', ' '));
                queryIssuedPaymentsObject.setAcronymTypePayment((objTB2KFileOut.getAcronymTypePayment()).replace('\0', ' '));
                queryIssuedPaymentsObject.setCodeCCI((objTB2KFileOut.getCodeCCI()).replace('\0', ' '));
                queryIssuedPayments.add(queryIssuedPaymentsObject);
            }
        }
        return queryIssuedPayments;
    }


    
    @XmlElementWrapper(name="listQueryIssuedPayments")
    public DataPaymentsIssued[] getListQueryIssuedPayments()
    {
        return listQueryIssuedPayments;
    }

    public void setListQueryIssuedPayments(DataPaymentsIssued[] listQueryIssuedPayments)
    {
        this.listQueryIssuedPayments = listQueryIssuedPayments;
    }
    public String getSessionName()
    {
        return sessionName;
    }

    public void setSessionName(String sessionName)
    {
        this.sessionName = sessionName;
    }
    public Integer getNroRegistros()
    {
        return nroRegistros;
    }

    public void setNroRegistros(Integer nroRegistros)
    {
        this.nroRegistros = nroRegistros;
    }
    public Boolean getHasNextPage()
    {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage)
    {
        this.hasNextPage = hasNextPage;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("PaymentsIssued [sessionName=");
        builder.append(sessionName);
        builder.append(", nroRegistros=");
        builder.append(nroRegistros);
        builder.append(", hasNextPage=");
        builder.append(hasNextPage);
        builder.append(", listQueryIssuedPayments=");
        builder.append(Arrays.asList(listQueryIssuedPayments));
        builder.append("]");
        return builder.toString();
    }
    
}