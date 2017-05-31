
package pe.com.scotiabank.tbk.consultas.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TB78FileOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TB78Output;

public class PaymentReceived
{   private String ftpfileName;
    private Integer nroRegistros;
    private Boolean hasNextPage;
    private DataPaymentReceived[] listQueryPaymentReceived;

    public PaymentReceived()
    {
    }

    public PaymentReceived(TB78Output output)
    {
        super();
        listQueryPaymentReceived = this.getListTB78QueryPaymentReceived(output.getMovement()).toArray(new DataPaymentReceived[0]);
    }

    public List<DataPaymentReceived> getListTB78QueryPaymentReceived(List<TB78FileOutput> FileOutput)
    {

        List<DataPaymentReceived> queryPaymentReceived = new ArrayList<DataPaymentReceived>();
        if (!FileOutput.isEmpty())
        {
            for (TB78FileOutput objTB78FileOut : FileOutput){   
                DataPaymentReceived objectTB78 = new DataPaymentReceived();
                objectTB78.setNamePayer(objTB78FileOut.getNamePayer());
                objectTB78.setContract(objTB78FileOut.getContract());
                objectTB78.setNumberOrder(objTB78FileOut.getNumberOrder());
                objectTB78.setNumberSequence((objTB78FileOut.getNumberSequence()));
                objectTB78.setDatePayment((objTB78FileOut.getDatePayment()));
                objectTB78.setTypePayment((objTB78FileOut.getTypePayment()));
                objectTB78.setStatus((objTB78FileOut.getStatus()));
                objectTB78.setMoney((objTB78FileOut.getMoney()));
                objectTB78.setAccountARA((objTB78FileOut.getAccountARA()));
                objectTB78.setAmount((objTB78FileOut.getAmount()));
                objectTB78.setSignAmount((objTB78FileOut.getSignAmount()));
                objectTB78.setAccountCodeInt((objTB78FileOut.getAccountCodeInt()).replace('\0', ' '));
                queryPaymentReceived.add(objectTB78);
            }
        }
        return queryPaymentReceived;
    }

    @XmlElementWrapper(name="listQueryPaymentReceived")
    public DataPaymentReceived[] getListQueryPaymentReceived()
    {
        return listQueryPaymentReceived;
    }

    public void setListQueryPaymentReceived(DataPaymentReceived[] listQueryPaymentReceived)
    {
        this.listQueryPaymentReceived = listQueryPaymentReceived;
    }
    public String getFtpfileName()
    {
        return ftpfileName;
    }

    public void setFtpfileName(String ftpfileName)
    {
        this.ftpfileName = ftpfileName;
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
        builder.append("PaymentReceived [ftpfileName=");
        builder.append(ftpfileName);
        builder.append(", nroRegistros=");
        builder.append(nroRegistros);
        builder.append(", hasNextPage=");
        builder.append(hasNextPage);
        builder.append(", listQueryPaymentReceived=");
        builder.append(Arrays.asList(listQueryPaymentReceived));
        builder.append("]");
        return builder.toString();
    }
    
}
