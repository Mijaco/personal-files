
package pe.com.scotiabank.tbk.consultas.beans;

public class LeasingInstallmentBean
{
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

    public LeasingInstallmentBean()
    {

    }

    public LeasingInstallmentBean(String trama)
    {
        setExpDate(trama.substring(0, 8));
        setCapital(trama.substring(8, 23));
        setAmort(trama.substring(23, 38));
        setInteres(trama.substring(38, 53));
        setCommision(trama.substring(53, 68));
        setAnother(trama.substring(68, 83));
        setTotal(trama.substring(83, 98));
        setSign(trama.substring(98, 98));
        setSituation(trama.substring(98, 106));
        setDate(trama.substring(106, 114));
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

    @Override
    public String toString()
    {
        return new StringBuilder().append(expDate).append(capital).append(amort).append(interes).append(commision)
                .append(another).append(total).append(sign).append(situation).append(date).toString();
    }
}
