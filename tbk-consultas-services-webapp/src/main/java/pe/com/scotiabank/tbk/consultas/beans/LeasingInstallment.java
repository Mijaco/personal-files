
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class LeasingInstallment implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String expDate;
    private String capital;
    private String amort;
    private String interes;
    private String commision;
    private String another;
    private String total;
    private String sign;
    private String situation;
    private String date;

    public LeasingInstallment()
    {

    }

    public String getExpDate()
    {
        return expDate;
    }

    public void setExpDate(String expDate)
    {
        this.expDate = expDate;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }

    public String getAmort()
    {
        return amort;
    }

    public void setAmort(String amort)
    {
        this.amort = amort;
    }

    public String getInteres()
    {
        return interes;
    }

    public void setInteres(String interes)
    {
        this.interes = interes;
    }

    public String getCommision()
    {
        return commision;
    }

    public void setCommision(String commision)
    {
        this.commision = commision;
    }

    public String getAnother()
    {
        return another;
    }

    public void setAnother(String another)
    {
        this.another = another;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getSituation()
    {
        return situation;
    }

    public void setSituation(String situation)
    {
        this.situation = situation;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public LeasingInstallment(String expDate, String capital, String amort, String interes, String commision, String another, String total, String sign, String situation, String date)
    {
        super();
        this.expDate = expDate;
        this.capital = capital;
        this.amort = amort;
        this.interes = interes;
        this.commision = commision;
        this.another = another;
        this.total = total;
        this.sign = sign;
        this.situation = situation;
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "LeasingInstallment [expDate=" + expDate + ", capital=" + capital + ", amort=" + amort + ", interes=" + interes + ", commision=" + commision + ", another=" + another + ", total="
                + total + ", sign=" + sign + ", situation=" + situation + ", date=" + date + "]";
    }

}
