
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBEAOutput;

@XmlType(name = "", namespace = "http://response.sessionservices.jaxws.tbk.scotiabank.com.pe")
public class ProductMovementDetailList implements Serializable
{

    private static final long serialVersionUID = -5051613945342980998L;

    private ProductTransaction[] productTransactions;

    public ProductMovementDetailList()
    {

    }

    public ProductMovementDetailList(TBEAOutput tbeaOutput)
    {
        this.loadTransactionBank(tbeaOutput.getProductsTransaction());

    }

    public void loadTransactionBank(ProductTransactionBean[] productTransactionDetails)
    {

        int tamanio = productTransactionDetails.length;

        this.productTransactions = new ProductTransaction[tamanio];

        for (int i = 0; i < tamanio; i++)
        {

            productTransactions[i] = new ProductTransaction(productTransactionDetails[i].getOperation(), productTransactionDetails[i].getPayer(), productTransactionDetails[i].getCurrency(),
                    productTransactionDetails[i].getAmount(), productTransactionDetails[i].getBalance(), productTransactionDetails[i].getAccount(), productTransactionDetails[i].getSequence(),
                    productTransactionDetails[i].getExporterName(), productTransactionDetails[i].getDateEntry(), productTransactionDetails[i].getDateExpire(),
                    productTransactionDetails[i].getChargeOf(), productTransactionDetails[i].getAmountActual(), productTransactionDetails[i].getAmountCollection(),
                    String.valueOf(productTransactionDetails[i].getCountry()), productTransactionDetails[i].getDescriptionType(), productTransactionDetails[i].getStateAffaire(),
                    productTransactionDetails[i].getConsignmentDate(), productTransactionDetails[i].getCollectionNumber());

        }

    }

    public ProductTransaction[] getProductTransactions()
    {
        return productTransactions;
    }

    public void setProductTransactions(ProductTransaction[] productTransactions)
    {
        this.productTransactions = productTransactions;
    }

    @Override
    public String toString()
    {
        return "ProductMovementDetailList [productTransactions=" + Arrays.toString(productTransactions) + "]";
    }

}