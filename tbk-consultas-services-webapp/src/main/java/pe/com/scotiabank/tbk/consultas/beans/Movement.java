
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;

import pe.com.scotiabank.tbk.consultas.trama.file.output.TRCMFileOutput;

public class Movement implements Serializable
{

    private static final long serialVersionUID = -8373652845122925721L;
    private String verifyCode;
    private String account;
    private String office;
    private String application;
    private String whites;
    private String date;
    private String time;
    private String subsidiary;
    private String itmod;
    private String ittran;
    private String itnrel;
    private String amount;
    private String sign;
    private String movementCode;
    private String reference;
    private String documentNumber;
    private String subsidiaryDesc;
    private String whites2;
    // MOVEMENT KEY
    private String pgcod;
    private String itsuc;
    private String itmod2;
    private String ittran2;
    private String itnrel2;
    private String itfcon;
    private String whites3;
    private String reference4;
    private String movementDesc;

    // PRODUCTS DATA
    private String ordinal;
    private String subOrdinal;

    public Movement()
    {

    }

    public Movement(TRCMFileOutput trcmOutput)
    {
        verifyCode = trcmOutput.getVerifyCode();
        account = trcmOutput.getAccount();
        office = trcmOutput.getOffice();
        application = trcmOutput.getApplication();
        whites = trcmOutput.getWhites();
        date = trcmOutput.getDate();
        time = trcmOutput.getTime();
        subsidiary = trcmOutput.getSubsidiary();
        itmod = trcmOutput.getItmod();
        ittran = trcmOutput.getIttran();
        itnrel = trcmOutput.getItnrel();
        amount = trcmOutput.getAmount();
        sign = trcmOutput.getSign();
        movementCode = trcmOutput.getMovementCode();
        reference = trcmOutput.getReference();
        documentNumber = trcmOutput.getDocumentNumber();
        subsidiaryDesc = trcmOutput.getSubsidiaryDesc();
        whites2 = trcmOutput.getWhites2();
        pgcod = trcmOutput.getPgcod();
        itsuc = trcmOutput.getItsuc();
        itmod2 = trcmOutput.getItmod2();
        ittran2 = trcmOutput.getIttran2();
        itnrel2 = trcmOutput.getItnrel2();
        itfcon = trcmOutput.getItfcon();
        whites3 = trcmOutput.getWhites3();
        reference4 = trcmOutput.getReference4();
        movementDesc = trcmOutput.getMovementDesc();
        ordinal = trcmOutput.getOrdinal();
        subOrdinal = trcmOutput.getSubOrdinal();
    }

    public Movement(String verifyCode, String account, String office, String application, String whites,
            String date, String time, String subsidiary, String itmod, String ittran, String itnrel, String amount,
            String sign, String movementCode, String reference, String documentNumber, String subsidiaryDesc,
            String whites2, String pgcod, String itsuc, String itmod2, String ittran2, String itnrel2, String itfcon,
            String whites3, String reference4, String movementDesc, String ordinal, String subOrdinal)
    {
        super();
        this.verifyCode = verifyCode;
        this.account = account;
        this.office = office;
        this.application = application;
        this.whites = whites;
        this.date = date;
        this.time = time;
        this.subsidiary = subsidiary;
        this.itmod = itmod;
        this.ittran = ittran;
        this.itnrel = itnrel;
        this.amount = amount;
        this.sign = sign;
        this.movementCode = movementCode;
        this.reference = reference;
        this.documentNumber = documentNumber;
        this.subsidiaryDesc = subsidiaryDesc;
        this.whites2 = whites2;
        this.pgcod = pgcod;
        this.itsuc = itsuc;
        this.itmod2 = itmod2;
        this.ittran2 = ittran2;
        this.itnrel2 = itnrel2;
        this.itfcon = itfcon;
        this.whites3 = whites3;
        this.reference4 = reference4;
        this.movementDesc = movementDesc;
        this.ordinal = ordinal;
        this.subOrdinal = subOrdinal;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getMovementDesc()
    {
        return movementDesc;
    }

    public void setMovementDesc(String movementDesc)
    {
        this.movementDesc = movementDesc;
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

    public String getDocumentNumber()
    {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber)
    {
        this.documentNumber = documentNumber;
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

    public String getVerifyCode()
    {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode)
    {
        this.verifyCode = verifyCode;
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

    public String getWhites()
    {
        return whites;
    }

    public void setWhites(String whites)
    {
        this.whites = whites;
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

    public String getMovementCode()
    {
        return movementCode;
    }

    public void setMovementCode(String movementCode)
    {
        this.movementCode = movementCode;
    }

    public String getSubsidiaryDesc()
    {
        return subsidiaryDesc;
    }

    public void setSubsidiaryDesc(String subsidiaryDesc)
    {
        this.subsidiaryDesc = subsidiaryDesc;
    }

    public String getWhites2()
    {
        return whites2;
    }

    public void setWhites2(String whites2)
    {
        this.whites2 = whites2;
    }

    public String getItmod2()
    {
        return itmod2;
    }

    public void setItmod2(String itmod2)
    {
        this.itmod2 = itmod2;
    }

    public String getIttran2()
    {
        return ittran2;
    }

    public void setIttran2(String ittran2)
    {
        this.ittran2 = ittran2;
    }

    public String getItnrel2()
    {
        return itnrel2;
    }

    public void setItnrel2(String itnrel2)
    {
        this.itnrel2 = itnrel2;
    }

    public String getWhites3()
    {
        return whites3;
    }

    public void setWhites3(String whites3)
    {
        this.whites3 = whites3;
    }

    public String getReference4()
    {
        return reference4;
    }

    public void setReference4(String reference4)
    {
        this.reference4 = reference4;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Movement [verifyCode=");
        builder.append(verifyCode);
        builder.append(", account=");
        builder.append(account);
        builder.append(", office=");
        builder.append(office);
        builder.append(", application=");
        builder.append(application);
        builder.append(", whites=");
        builder.append(whites);
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
        builder.append(", movementCode=");
        builder.append(movementCode);
        builder.append(", reference=");
        builder.append(reference);
        builder.append(", documentNumber=");
        builder.append(documentNumber);
        builder.append(", subsidiaryDesc=");
        builder.append(subsidiaryDesc);
        builder.append(", whites2=");
        builder.append(whites2);
        builder.append(", pgcod=");
        builder.append(pgcod);
        builder.append(", itsuc=");
        builder.append(itsuc);
        builder.append(", itmod2=");
        builder.append(itmod2);
        builder.append(", ittran2=");
        builder.append(ittran2);
        builder.append(", itnrel2=");
        builder.append(itnrel2);
        builder.append(", itfcon=");
        builder.append(itfcon);
        builder.append(", whites3=");
        builder.append(whites3);
        builder.append(", reference4=");
        builder.append(reference4);
        builder.append(", movementDesc=");
        builder.append(movementDesc);
        builder.append(", ordinal=");
        builder.append(ordinal);
        builder.append(", subOrdinal=");
        builder.append(subOrdinal);
        builder.append("]");
        return builder.toString();
    }
    

}
