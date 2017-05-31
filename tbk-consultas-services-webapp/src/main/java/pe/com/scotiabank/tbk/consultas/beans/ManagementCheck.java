package pe.com.scotiabank.tbk.consultas.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlElement(value = "ManagementCheck")
public class ManagementCheck {


    String ruc;
    BigDecimal rucDecimal;
    String beneficiated;
    String check;
    BigDecimal checkDecimal;
    String day;
    Date date;// same value of day, util for order

    String amount;
    BigDecimal amountDecimal;
    String order;
    String dateOrder;
    Date dateOrderD;
    String office;
    String hour;
    String paymentType;
    String reference;
    String checkType;
    Set<String> indexesToShow;

    public ManagementCheck()
    {
    }

    public ManagementCheck(String ruc, String beneficiated, String check, String day, String amount,
            String order, String dateOrder, String office, String hour, String paymentType, String reference,
            String checkType)
    {

        this.ruc = ruc;
        this.beneficiated = beneficiated;
        this.check = check;
        this.day = day;
        this.amount = amount;
        this.order = order;
        this.dateOrder = dateOrder;
        this.office = office;
        this.hour = hour;
        this.paymentType = paymentType;
        this.reference = reference;
        this.checkType = checkType;
    }
    
//    
//    private static final Map<String, String> indexesMap;
//    static {
//        Map<String, Object> aMap = new HashMap<String, Object>();
//        aMap.put("1", ruc);
//        aMap.put("2", beneficiated);
//        aMap.put("3", check);
//        aMap.put("4", "two");
//        aMap.put("5", "two");
//        aMap.put("6", "two");
//        aMap.put("7", "two");
//        aMap.put("8", "two");
//        aMap.put("9", "two");
//        aMap.put("10", "two");
//        aMap.put("11", "two");
//        aMap.put("12", "two");
//        indexesMap = Collections.unmodifiableMap(aMap);
//    }
    

    public Date getDateOrderD()
    {
        return this.dateOrderD;
    }

    public void setDateOrderD(Date dateOrderD)
    {
        this.dateOrderD = dateOrderD;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public BigDecimal getAmountDecimal()
    {
        return this.amountDecimal;
    }

    public void setAmountDecimal(BigDecimal amountDecimal)
    {
        this.amountDecimal = amountDecimal;
    }

    public String getRuc()
    {
        return ruc;
    }

    public void setRuc(String ruc)
    {
        this.ruc = ruc;
    }

    public String getBeneficiated()
    {
        return beneficiated;
    }

    public void setBeneficiated(String beneficiated)
    {
        this.beneficiated = beneficiated;
    }

    public String getCheck()
    {
        return check;
    }

    public void setCheck(String check)
    {
        this.check = check;
    }

    public String getDay()
    {
        return day;
    }

    public void setDay(String day)
    {
        this.day = day;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getOrder()
    {
        return order;
    }

    public void setOrder(String order)
    {
        this.order = order;
    }

    public String getDateOrder()
    {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder)
    {
        this.dateOrder = dateOrder;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public String getHour()
    {
        return hour;
    }

    public void setHour(String hour)
    {
        this.hour = hour;
    }

    public String getPaymentType()
    {
        return paymentType;
    }

    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getCheckType()
    {
        return checkType;
    }

    public void setCheckType(String checkType)
    {
        this.checkType = checkType;
    }

    public BigDecimal getRucDecimal()
    {
        return rucDecimal;
    }

    public void setRucDecimal(BigDecimal rucDecimal)
    {
        this.rucDecimal = rucDecimal;
    }

    public BigDecimal getCheckDecimal()
    {
        return checkDecimal;
    }

    public void setCheckDecimal(BigDecimal checkDecimal)
    {
        this.checkDecimal = checkDecimal;
    }

    @Override
    public String toString()
    {
    	StringBuilder cadena= new StringBuilder();
    	if(indexesToShow==null || indexesToShow.isEmpty()){

        cadena.append(ruc).append(";").append(beneficiated).append(";").append(check).append(";").append(day)
                .append(";").append(amount).append(";").append(order).append(";").append(dateOrder).append(";")
                .append(office).append(";").append(hour).append(";").append(paymentType).append(";").append(reference)
                .append(";").append(checkType).append(";");
    	}else{
    		
    		
    	}

        return cadena.toString();
    }
	
}
