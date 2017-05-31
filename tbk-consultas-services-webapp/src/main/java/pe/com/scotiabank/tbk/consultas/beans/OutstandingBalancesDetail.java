
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.util.trama.Body;

//@XmlRootElement(name = "OutstandingBalancesDetail", namespace = "http://response.jaxws.tbk.scotiabank.com.pe")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutstandingBalancesDetail", namespace = "http://message.generalbalancesservices.tbk.scotiabank.com.pe")
public class OutstandingBalancesDetail implements Body, Serializable
{
    private static final long serialVersionUID = 8566300711014842880L;

    // LENGHT ATTRIBUTES
    public static final int TBK_OUPUT_ATTR_LENGTH_DOC_COUNTRY_ACCEPTANT = 3;
    public static final int TBK_OUPUT_ATTR_LENGTH_DOC_TYPE_ACCEPTANT = 2;
    public static final int TBK_OUPUT_ATTR_LENGTH_DOC_NRO_ACCEPTANT = 12;
    public static final int TBK_OUPUT_ATTR_LENGTH_NAME_ACCEPTANT = 35;
    public static final int TBK_OUPUT_ATTR_LENGTH_CANT_TOT_DOC_SOLES = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_IMP_TOT_DOC_SOLES = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_TOT_DOC_SOLES = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_CANT_TOT_DOC_DOLARS = 5;
    public static final int TBK_OUPUT_ATTR_LENGTH_IMP_TOT_DOC_DOLARS = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_TOT_DOC_DOLARS = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_AVAILABLE_LINE_SOLES = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_LINE_SOLES = 1;
    public static final int TBK_OUPUT_ATTR_LENGTH_AVAILABLE_LINE_DOLARS = 14;
    public static final int TBK_OUPUT_ATTR_LENGTH_SIGN_LINE_DOLARS = 1;

    private String docCountryAcceptant;
    private String docTypeAcceptant;
    private String docNroAcceptant;
    private String nameAcceptant;
    private String cantTotDocSoles;
    private String impTotDocSoles;
    private String signTotDocSoles;
    private String cantTotDocDolars;
    private String impTotDocDolars;
    private String signTotDocDolars;
    private String availableLineSoles;
    private String signLineSoles;
    private String availableLineDolars;
    private String signLineDolars;

    public OutstandingBalancesDetail()
    {
    }

    public OutstandingBalancesDetail(String output)
    {
        setStringBody(output);
    }

    public String getDocCountryAcceptant()
    {
        return docCountryAcceptant;
    }

    public void setDocCountryAcceptant(String docCountryAcceptant)
    {
        this.docCountryAcceptant = docCountryAcceptant;
    }

    public String getDocTypeAcceptant()
    {
        return docTypeAcceptant;
    }

    public void setDocTypeAcceptant(String docTypeAcceptant)
    {
        this.docTypeAcceptant = docTypeAcceptant;
    }

    public String getDocNroAcceptant()
    {
        return docNroAcceptant;
    }

    public void setDocNroAcceptant(String docNroAcceptant)
    {
        this.docNroAcceptant = docNroAcceptant;
    }

    public String getNameAcceptant()
    {
        return nameAcceptant;
    }

    public void setNameAcceptant(String nameAcceptant)
    {
        this.nameAcceptant = nameAcceptant;
    }

    public String getCantTotDocSoles()
    {
        return cantTotDocSoles;
    }

    public void setCantTotDocSoles(String cantTotDocSoles)
    {
        this.cantTotDocSoles = cantTotDocSoles;
    }

    public String getImpTotDocSoles()
    {
        return impTotDocSoles;
    }

    public void setImpTotDocSoles(String impTotDocSoles)
    {
        this.impTotDocSoles = impTotDocSoles;
    }

    public String getSignTotDocSoles()
    {
        return signTotDocSoles;
    }

    public void setSignTotDocSoles(String signTotDocSoles)
    {
        this.signTotDocSoles = signTotDocSoles;
    }

    public String getCantTotDocDolars()
    {
        return cantTotDocDolars;
    }

    public void setCantTotDocDolars(String cantTotDocDolars)
    {
        this.cantTotDocDolars = cantTotDocDolars;
    }

    public String getImpTotDocDolars()
    {
        return impTotDocDolars;
    }

    public void setImpTotDocDolars(String impTotDocDolars)
    {
        this.impTotDocDolars = impTotDocDolars;
    }

    public String getSignTotDocDolars()
    {
        return signTotDocDolars;
    }

    public void setSignTotDocDolars(String signTotDocDolars)
    {
        this.signTotDocDolars = signTotDocDolars;
    }

    public String getAvailableLineSoles()
    {
        return availableLineSoles;
    }

    public void setAvailableLineSoles(String availableLineSoles)
    {
        this.availableLineSoles = availableLineSoles;
    }

    public String getSignLineSoles()
    {
        return signLineSoles;
    }

    public void setSignLineSoles(String signLineSoles)
    {
        this.signLineSoles = signLineSoles;
    }

    public String getAvailableLineDolars()
    {
        return availableLineDolars;
    }

    public void setAvailableLineDolars(String availableLineDolars)
    {
        this.availableLineDolars = availableLineDolars;
    }

    public String getSignLineDolars()
    {
        return signLineDolars;
    }

    public void setSignLineDolars(String signLineDolars)
    {
        this.signLineDolars = signLineDolars;
    }

    public OutstandingBalancesDetail(String docCountryAcceptant, String docTypeAcceptant, String docNroAcceptant, String nameAcceptant, String cantTotDocSoles, String impTotDocSoles,
            String signTotDocSoles, String cantTotDocDolars, String impTotDocDolars, String signTotDocDolars, String availableLineSoles, String signLineSoles, String availableLineDolars,
            String signLineDolars)
    {
        super();
        this.docCountryAcceptant = docCountryAcceptant;
        this.docTypeAcceptant = docTypeAcceptant;
        this.docNroAcceptant = docNroAcceptant;
        this.nameAcceptant = nameAcceptant;
        this.cantTotDocSoles = cantTotDocSoles;
        this.impTotDocSoles = impTotDocSoles;
        this.signTotDocSoles = signTotDocSoles;
        this.cantTotDocDolars = cantTotDocDolars;
        this.impTotDocDolars = impTotDocDolars;
        this.signTotDocDolars = signTotDocDolars;
        this.availableLineSoles = availableLineSoles;
        this.signLineSoles = signLineSoles;
        this.availableLineDolars = availableLineDolars;
        this.signLineDolars = signLineDolars;
    }

    @Override
    public void setStringBody(String output)
    {
        int it = 0;
        setDocCountryAcceptant(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DOC_COUNTRY_ACCEPTANT));
        setDocTypeAcceptant(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DOC_TYPE_ACCEPTANT));
        setDocNroAcceptant(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_DOC_NRO_ACCEPTANT));
        setNameAcceptant(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_NAME_ACCEPTANT));
        setCantTotDocSoles(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CANT_TOT_DOC_SOLES));
        setImpTotDocSoles(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_IMP_TOT_DOC_SOLES));
        setSignTotDocSoles(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_TOT_DOC_SOLES));
        setCantTotDocDolars(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_CANT_TOT_DOC_DOLARS));
        setImpTotDocDolars(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_IMP_TOT_DOC_DOLARS));
        setSignTotDocDolars(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_TOT_DOC_DOLARS));
        setAvailableLineSoles(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_AVAILABLE_LINE_SOLES));
        setSignLineSoles(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_LINE_SOLES));
        setAvailableLineDolars(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_AVAILABLE_LINE_DOLARS));
        setSignLineDolars(output.substring(it, it += TBK_OUPUT_ATTR_LENGTH_SIGN_LINE_DOLARS));
    }

    @Override
    public String getStringBody()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(docCountryAcceptant);
        builder.append(docTypeAcceptant);
        builder.append(docNroAcceptant);
        builder.append(nameAcceptant);
        builder.append(cantTotDocSoles);
        builder.append(impTotDocSoles);
        builder.append(signTotDocSoles);
        builder.append(cantTotDocDolars);
        builder.append(impTotDocDolars);
        builder.append(signTotDocDolars);
        builder.append(availableLineSoles);
        builder.append(signLineSoles);
        builder.append(availableLineDolars);
        builder.append(signLineDolars);
        return builder.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("OutstandingBalancesDetail [docCountryAcceptant=");
        builder.append(docCountryAcceptant);
        builder.append(", docTypeAcceptant=");
        builder.append(docTypeAcceptant);
        builder.append(", docNroAcceptant=");
        builder.append(docNroAcceptant);
        builder.append(", nameAcceptant=");
        builder.append(nameAcceptant);
        builder.append(", cantTotDocSoles=");
        builder.append(cantTotDocSoles);
        builder.append(", impTotDocSoles=");
        builder.append(impTotDocSoles);
        builder.append(", signTotDocSoles=");
        builder.append(signTotDocSoles);
        builder.append(", cantTotDocDolars=");
        builder.append(cantTotDocDolars);
        builder.append(", impTotDocDolars=");
        builder.append(impTotDocDolars);
        builder.append(", signTotDocDolars=");
        builder.append(signTotDocDolars);
        builder.append(", availableLineSoles=");
        builder.append(availableLineSoles);
        builder.append(", signLineSoles=");
        builder.append(signLineSoles);
        builder.append(", availableLineDolars=");
        builder.append(availableLineDolars);
        builder.append(", signLineDolars=");
        builder.append(signLineDolars);
        builder.append("]");
        return builder.toString();
    }

}
