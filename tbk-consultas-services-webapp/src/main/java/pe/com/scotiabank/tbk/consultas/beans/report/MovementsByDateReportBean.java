
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class MovementsByDateReportBean implements Reportable
{

    private String verifCode;
    private String account;
    private String office;
    private String application;
    private String blanks1;
    private String date;
    private String time;
    private String subsidiary;
    private String itmod;
    private String ittran;
    private String itnrel;
    private String amount;
    private String sign;
    private String movCode;
    private String reference;
    private String docNumber;
    private String subsidiaryDesc;
    private String blanks2;

    // movement key
    private String pgcod;
    private String itsuc;
    private String keyItmod;
    private String keyIttran;
    private String keyItnrel;
    private String itfcon;

    private String blanks3;
    private String ref4;
    private String movDescription;

    // product data array
    private String ordinal;
    private String subOrdinal;

    public MovementsByDateReportBean()
    {

    }

    public String getVerifCode()
    {
        return verifCode;
    }

    public void setVerifCode(String verifCode)
    {
        this.verifCode = verifCode;
    }

    public String getAccount()
    {
        return account;
    }

    public void setAccount(String account)
    {
        this.account = account;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public String getApplication()
    {
        return application;
    }

    public void setApplication(String application)
    {
        this.application = application;
    }

    public String getBlanks1()
    {
        return blanks1;
    }

    public void setBlanks1(String blanks1)
    {
        this.blanks1 = blanks1;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public String getSubsidiary()
    {
        return subsidiary;
    }

    public void setSubsidiary(String subsidiary)
    {
        this.subsidiary = subsidiary;
    }

    public String getItmod()
    {
        return itmod;
    }

    public void setItmod(String itmod)
    {
        this.itmod = itmod;
    }

    public String getIttran()
    {
        return ittran;
    }

    public void setIttran(String ittran)
    {
        this.ittran = ittran;
    }

    public String getItnrel()
    {
        return itnrel;
    }

    public void setItnrel(String itnrel)
    {
        this.itnrel = itnrel;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
    }

    public String getMovCode()
    {
        return movCode;
    }

    public void setMovCode(String movCode)
    {
        this.movCode = movCode;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getDocNumber()
    {
        return docNumber;
    }

    public void setDocNumber(String docNumber)
    {
        this.docNumber = docNumber;
    }

    public String getSubsidiaryDesc()
    {
        return subsidiaryDesc;
    }

    public void setSubsidiaryDesc(String subsidiaryDesc)
    {
        this.subsidiaryDesc = subsidiaryDesc;
    }

    public String getBlanks2()
    {
        return blanks2;
    }

    public void setBlanks2(String blanks2)
    {
        this.blanks2 = blanks2;
    }

    public String getPgcod()
    {
        return pgcod;
    }

    public void setPgcod(String pgcod)
    {
        this.pgcod = pgcod;
    }

    public String getItsuc()
    {
        return itsuc;
    }

    public void setItsuc(String itsuc)
    {
        this.itsuc = itsuc;
    }

    public String getKeyItmod()
    {
        return keyItmod;
    }

    public void setKeyItmod(String keyItmod)
    {
        this.keyItmod = keyItmod;
    }

    public String getKeyIttran()
    {
        return keyIttran;
    }

    public void setKeyIttran(String keyIttran)
    {
        this.keyIttran = keyIttran;
    }

    public String getKeyItnrel()
    {
        return keyItnrel;
    }

    public void setKeyItnrel(String keyItnrel)
    {
        this.keyItnrel = keyItnrel;
    }

    public String getItfcon()
    {
        return itfcon;
    }

    public void setItfcon(String itfcon)
    {
        this.itfcon = itfcon;
    }

    public String getBlanks3()
    {
        return blanks3;
    }

    public void setBlanks3(String blanks3)
    {
        this.blanks3 = blanks3;
    }

    public String getRef4()
    {
        return ref4;
    }

    public void setRef4(String ref4)
    {
        this.ref4 = ref4;
    }

    public String getMovDescription()
    {
        return movDescription;
    }

    public void setMovDescription(String movDescription)
    {
        this.movDescription = movDescription;
    }

    public String getOrdinal()
    {
        return ordinal;
    }

    public void setOrdinal(String ordinal)
    {
        this.ordinal = ordinal;
    }

    public String getSubOrdinal()
    {
        return subOrdinal;
    }

    public void setSubOrdinal(String subOrdinal)
    {
        this.subOrdinal = subOrdinal;
    }

    @Override
    public String[] getRow()
    {
        // 5,26,11,14,15,20,21,22

        /*
         * return new String[] { verifCode, account, office, application, blanks1, date, time, subsidiary, itmod,
         * ittran, itnrel, amount, sign, movCode , reference, docNumber, subsidiaryDesc, blanks2, pgcod, itsuc,
         * keyItmod, keyIttran, keyItnrel, itfcon, blanks3, ref4, movDescription, ordinal, subOrdinal };
         */
        return new String[] { date, movDescription, amount, reference, itsuc, itmod, ittran, itnrel};
    }

}
