
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TRCPFileOutput;

public class MovementByPage implements Serializable
{

    private static final long serialVersionUID = 3236572314314985053L;
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

    public MovementByPage()
    {
    }

    public MovementByPage(String verifCode, String account, String office, String application, String blanks1, String date, String time, String subsidiary, String itmod, String ittran, String itnrel,
            String amount, String sign, String movCode, String reference, String docNumber, String subsidiaryDesc, String blanks2, String pgcod, String itsuc, String keyItmod, String keyIttran,
            String keyItnrel, String itfcon, String blanks3, String ref4, String movDescription, String ordinal, String subOrdinal)
    {
        this.verifCode = verifCode;
        this.account = account;
        this.office = office;
        this.application = application;
        this.blanks1 = blanks1;
        this.date = date;
        this.time = time;
        this.subsidiary = subsidiary;
        this.itmod = itmod;
        this.ittran = ittran;
        this.itnrel = itnrel;
        this.amount = amount;
        this.sign = sign;
        this.movCode = movCode;
        this.reference = reference;
        this.docNumber = docNumber;
        this.subsidiaryDesc = subsidiaryDesc;
        this.blanks2 = blanks2;
        this.pgcod = pgcod;
        this.itsuc = itsuc;
        this.keyItmod = keyItmod;
        this.keyIttran = keyIttran;
        this.keyItnrel = keyItnrel;
        this.itfcon = itfcon;
        this.blanks3 = blanks3;
        this.ref4 = ref4;
        this.movDescription = movDescription;
        this.ordinal = ordinal;
        this.subOrdinal = subOrdinal;
    }

    public MovementByPage(TRCPFileOutput trcpFileOutput)
    {
        verifCode = trcpFileOutput.getVerifCode();
        account = trcpFileOutput.getAccount();
        office = trcpFileOutput.getOffice();
        application = trcpFileOutput.getApplication();
        blanks1 = trcpFileOutput.getBlanks1();
        date = trcpFileOutput.getDate();
        time = trcpFileOutput.getTime();
        subsidiary = trcpFileOutput.getSubsidiary();
        itmod = trcpFileOutput.getItmod();
        ittran = trcpFileOutput.getIttran();
        itnrel = trcpFileOutput.getItnrel();
        amount = trcpFileOutput.getAmount();
        sign = trcpFileOutput.getSign();
        movCode = trcpFileOutput.getMovCode();
        reference = trcpFileOutput.getReference();
        docNumber = trcpFileOutput.getDocNumber();
        subsidiaryDesc = trcpFileOutput.getSubsidiaryDesc();
        blanks2 = trcpFileOutput.getBlanks2();

        pgcod = trcpFileOutput.getPgcod();
        itsuc = trcpFileOutput.getItsuc();
        keyItmod = trcpFileOutput.getKeyItmod();
        keyIttran = trcpFileOutput.getKeyIttran();
        keyItnrel = trcpFileOutput.getKeyItnrel();
        itfcon = trcpFileOutput.getItfcon();

        blanks3 = trcpFileOutput.getBlanks3();
        ref4 = trcpFileOutput.getRef4();
        movDescription = trcpFileOutput.getMovDescription();

        ordinal = trcpFileOutput.getOrdinal();
        subOrdinal = trcpFileOutput.getSubOrdinal();
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getMovDescription()
    {
        return movDescription;
    }

    public void setMovDescription(String movDescription)
    {
        this.movDescription = movDescription;
    }

    public String getSign()
    {
        return sign;
    }

    public void setSign(String sign)
    {
        this.sign = sign;
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

    public String getItfcon()
    {
        return itfcon;
    }

    public void setItfcon(String itfcon)
    {
        this.itfcon = itfcon;
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

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getMovCode()
    {
        return movCode;
    }

    public void setMovCode(String movCode)
    {
        this.movCode = movCode;
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

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MovementByPage [verifCode=");
        builder.append(verifCode);
        builder.append(", account=");
        builder.append(account);
        builder.append(", office=");
        builder.append(office);
        builder.append(", application=");
        builder.append(application);
        builder.append(", blanks1=");
        builder.append(blanks1);
        builder.append(", date=");
        builder.append(date);
        builder.append(", time=");
        builder.append(time);
        builder.append(", subsidiary=");
        builder.append(subsidiary);
        builder.append(", itmod=");
        builder.append(itmod);
        builder.append(", ittran=");
        builder.append(ittran);
        builder.append(", itnrel=");
        builder.append(itnrel);
        builder.append(", amount=");
        builder.append(amount);
        builder.append(", sign=");
        builder.append(sign);
        builder.append(", movCode=");
        builder.append(movCode);
        builder.append(", reference=");
        builder.append(reference);
        builder.append(", docNumber=");
        builder.append(docNumber);
        builder.append(", subsidiaryDesc=");
        builder.append(subsidiaryDesc);
        builder.append(", blanks2=");
        builder.append(blanks2);
        builder.append(", pgcod=");
        builder.append(pgcod);
        builder.append(", itsuc=");
        builder.append(itsuc);
        builder.append(", keyItmod=");
        builder.append(keyItmod);
        builder.append(", keyIttran=");
        builder.append(keyIttran);
        builder.append(", keyItnrel=");
        builder.append(keyItnrel);
        builder.append(", itfcon=");
        builder.append(itfcon);
        builder.append(", blanks3=");
        builder.append(blanks3);
        builder.append(", ref4=");
        builder.append(ref4);
        builder.append(", movDescription=");
        builder.append(movDescription);
        builder.append(", ordinal=");
        builder.append(ordinal);
        builder.append(", subOrdinal=");
        builder.append(subOrdinal);
        builder.append("]");
        return builder.toString();
    }

}
