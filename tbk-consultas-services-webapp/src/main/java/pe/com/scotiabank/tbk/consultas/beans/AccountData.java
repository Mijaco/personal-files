
package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TB52Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class AccountData
{
    // Saldo actual
    private String actualBalance;
    private String actualBalanceSign;
    // Saldo disponible
    private String availableBalance;
    private String availableBalanceSign;
    // Saldo indisponible 24 horas
    private String unavailableBalance24;
    private String unavailableBalance24Sign;
    // Saldo indisponible 48 horas
    private String unavailableBalance48;
    private String unavailableBalance48Sign;
    // Saldo indisponible 72 horas
    private String unavailableBalance72;
    private String unavailableBalance72Sign;
    // Saldo indisponible total
    private String unavailableBalanceTotal;
    private String unavailableBalanceTotalSign;
    // Total ("-") debe
    private String debitTotal;
    private String debitTotalSign;
    // Total ("+") haber
    private String havingsTotal;
    private String havingsTotalSign;
    // Total bloqueado
    private String lockedTotal;
    private String lockedTotalSign;
    // Inter�s Acreedor
    private String creditorInterest;
    private String creditorInterestSign;
    // Inter�s Deudor
    private String debtopInterest;
    private String debtopInterestSign;
    // Total l�nea
    private String totalLine;
    private String totalLineSign;
    // L�nea no avisada
    private String lineNotWarned;
    private String lineNotWarnedSign;
    // Filler
    private String filler1;
    // Nombre de la cuenta
    private String accountName;
    // Fecha de �ltimo movimiento
    private String dateLastTransaction;
    // Filler
    private String filler2;
    // Empresa Bt
    private String companyBt;
    // Secuencia
    private String secuence;
    // M�dulo
    private String module;
    // Cuenta Bt
    private String accountBt;
    // Filler
    private String filler3;
    // &wprmt03
    private String wprmt03;
    // &wprmt04
    private String wprmt04;
    // &wprmt05
    private String wprmt05;
    // &wprmt06
    private String wprmt06;
    // &wprmt07
    private String wprmt07;
    // &wprmt08
    private String wprmt08;
    // &wprmt09
    private String wprmt09;
    // &wprmt10
    private String wprmt10;
    // &wprmt11
    private String wprmt11;

    public AccountData()
    {
    }

    public AccountData(TB52Output tb52output)
    {
        this.actualBalance = tb52output.getActualBalance();
        this.actualBalanceSign = tb52output.getActualBalanceSign();
        this.availableBalance = tb52output.getAvailableBalance();
        this.availableBalanceSign = tb52output.getAvailableBalanceSign();
        this.unavailableBalance24 = tb52output.getUnavailableBalance24();
        this.unavailableBalance24Sign = tb52output.getUnavailableBalance24Sign();
        this.unavailableBalance48 = tb52output.getUnavailableBalance48();
        this.unavailableBalance48Sign = tb52output.getUnavailableBalance48Sign();
        this.unavailableBalance72 = tb52output.getUnavailableBalance72();
        this.unavailableBalance72Sign = tb52output.getUnavailableBalance72Sign();
        this.unavailableBalanceTotal = tb52output.getUnavailableBalanceTotal();
        this.unavailableBalanceTotalSign = tb52output.getUnavailableBalanceTotalSign();
        this.debitTotal = tb52output.getDebitTotal();
        this.debitTotalSign = tb52output.getDebitTotalSign();
        this.havingsTotal = tb52output.getHavingsTotal();
        this.havingsTotalSign = tb52output.getHavingsTotalSign();
        this.lockedTotal = tb52output.getLockedTotal();
        this.lockedTotalSign = tb52output.getLockedTotalSign();
        this.creditorInterest = tb52output.getCreditorInterest();
        this.creditorInterestSign = tb52output.getCreditorInterestSign();
        this.debtopInterest = tb52output.getDebtopInterest();
        this.debtopInterestSign = tb52output.getDebtopInterestSign();
        this.totalLine = tb52output.getTotalLine();
        this.totalLineSign = tb52output.getTotalLineSign();
        this.lineNotWarned = tb52output.getLineNotWarned();
        this.lineNotWarnedSign = tb52output.getLineNotWarnedSign();
        this.filler1 = tb52output.getFiller1();
        this.accountName = tb52output.getAccountName();
        this.dateLastTransaction = tb52output.getDateLastTransaction();
        this.filler2 = tb52output.getFiller2();
        this.companyBt = tb52output.getCompanyBt();
        this.secuence = tb52output.getSecuence();
        this.module = tb52output.getModule();
        this.accountBt = tb52output.getAccountBt();
        this.filler3 = tb52output.getFiller3();
        this.wprmt03 = tb52output.getWprmt03();
        this.wprmt04 = tb52output.getWprmt04();
        this.wprmt05 = tb52output.getWprmt05();
        this.wprmt06 = tb52output.getWprmt06();
        this.wprmt07 = tb52output.getWprmt07();
        this.wprmt08 = tb52output.getWprmt08();
        this.wprmt09 = tb52output.getWprmt09();
        this.wprmt10 = tb52output.getWprmt10();
        this.wprmt11 = tb52output.getWprmt11();
    }

    public String getActualBalance()
    {
        return actualBalance;
    }

    public void setActualBalance(String actualBalance)
    {
        this.actualBalance = actualBalance;
    }

    public String getAvailableBalance()
    {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance)
    {
        this.availableBalance = availableBalance;
    }

    public String getUnavailableBalance24()
    {
        return unavailableBalance24;
    }

    public void setUnavailableBalance24(String unavailableBalance24)
    {
        this.unavailableBalance24 = unavailableBalance24;
    }

    public String getUnavailableBalance48()
    {
        return unavailableBalance48;
    }

    public void setUnavailableBalance48(String unavailableBalance48)
    {
        this.unavailableBalance48 = unavailableBalance48;
    }

    public String getUnavailableBalance72()
    {
        return unavailableBalance72;
    }

    public void setUnavailableBalance72(String unavailableBalance72)
    {
        this.unavailableBalance72 = unavailableBalance72;
    }

    public String getUnavailableBalanceTotal()
    {
        return unavailableBalanceTotal;
    }

    public void setUnavailableBalanceTotal(String unavailableBalanceTotal)
    {
        this.unavailableBalanceTotal = unavailableBalanceTotal;
    }

    public String getDebitTotal()
    {
        return debitTotal;
    }

    public void setDebitTotal(String debitTotal)
    {
        this.debitTotal = debitTotal;
    }

    public String getHavingsTotal()
    {
        return havingsTotal;
    }

    public void setHavingsTotal(String havingsTotal)
    {
        this.havingsTotal = havingsTotal;
    }

    public String getLockedTotal()
    {
        return lockedTotal;
    }

    public void setLockedTotal(String lockedTotal)
    {
        this.lockedTotal = lockedTotal;
    }

    public String getCreditorInterest()
    {
        return creditorInterest;
    }

    public void setCreditorInterest(String creditorInterest)
    {
        this.creditorInterest = creditorInterest;
    }

    public String getDebtopInterest()
    {
        return debtopInterest;
    }

    public void setDebtopInterest(String debtopInterest)
    {
        this.debtopInterest = debtopInterest;
    }

    public String getTotalLine()
    {
        return totalLine;
    }

    public void setTotalLine(String totalLine)
    {
        this.totalLine = totalLine;
    }

    public String getLineNotWarned()
    {
        return lineNotWarned;
    }

    public void setLineNotWarned(String lineNotWarned)
    {
        this.lineNotWarned = lineNotWarned;
    }

    public String getFiller1()
    {
        return filler1;
    }

    public void setFiller1(String filler1)
    {
        this.filler1 = filler1;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public String getDateLastTransaction()
    {
        return dateLastTransaction;
    }

    public void setDateLastTransaction(String dateLastTransaction)
    {
        this.dateLastTransaction = dateLastTransaction;
    }

    public String getFiller2()
    {
        return filler2;
    }

    public void setFiller2(String filler2)
    {
        this.filler2 = filler2;
    }

    public String getCompanyBt()
    {
        return companyBt;
    }

    public void setCompanyBt(String companyBt)
    {
        this.companyBt = companyBt;
    }

    public String getSecuence()
    {
        return secuence;
    }

    public void setSecuence(String secuence)
    {
        this.secuence = secuence;
    }

    public String getModule()
    {
        return module;
    }

    public void setModule(String module)
    {
        this.module = module;
    }

    public String getAccountBt()
    {
        return accountBt;
    }

    public void setAccountBt(String accountBt)
    {
        this.accountBt = accountBt;
    }

    public String getFiller3()
    {
        return filler3;
    }

    public void setFiller3(String filler3)
    {
        this.filler3 = filler3;
    }

    public String getWprmt03()
    {
        return wprmt03;
    }

    public void setWprmt03(String wprmt03)
    {
        this.wprmt03 = wprmt03;
    }

    public String getWprmt04()
    {
        return wprmt04;
    }

    public void setWprmt04(String wprmt04)
    {
        this.wprmt04 = wprmt04;
    }

    public String getWprmt05()
    {
        return wprmt05;
    }

    public void setWprmt05(String wprmt05)
    {
        this.wprmt05 = wprmt05;
    }

    public String getWprmt06()
    {
        return wprmt06;
    }

    public void setWprmt06(String wprmt06)
    {
        this.wprmt06 = wprmt06;
    }

    public String getWprmt07()
    {
        return wprmt07;
    }

    public void setWprmt07(String wprmt07)
    {
        this.wprmt07 = wprmt07;
    }

    public String getWprmt08()
    {
        return wprmt08;
    }

    public void setWprmt08(String wprmt08)
    {
        this.wprmt08 = wprmt08;
    }

    public String getWprmt09()
    {
        return wprmt09;
    }

    public void setWprmt09(String wprmt09)
    {
        this.wprmt09 = wprmt09;
    }

    public String getWprmt10()
    {
        return wprmt10;
    }

    public void setWprmt10(String wprmt10)
    {
        this.wprmt10 = wprmt10;
    }

    public String getWprmt11()
    {
        return wprmt11;
    }

    public void setWprmt11(String wprmt11)
    {
        this.wprmt11 = wprmt11;
    }
    
    
    public String getActualBalanceSign()
    {
        return actualBalanceSign;
    }

    public void setActualBalanceSign(String actualBalanceSign)
    {
        this.actualBalanceSign = actualBalanceSign;
    }

    public String getAvailableBalanceSign()
    {
        return availableBalanceSign;
    }

    public void setAvailableBalanceSign(String availableBalanceSign)
    {
        this.availableBalanceSign = availableBalanceSign;
    }

    public String getUnavailableBalance24Sign()
    {
        return unavailableBalance24Sign;
    }

    public void setUnavailableBalance24Sign(String unavailableBalance24Sign)
    {
        this.unavailableBalance24Sign = unavailableBalance24Sign;
    }

    public String getUnavailableBalance48Sign()
    {
        return unavailableBalance48Sign;
    }

    public void setUnavailableBalance48Sign(String unavailableBalance48Sign)
    {
        this.unavailableBalance48Sign = unavailableBalance48Sign;
    }

    public String getUnavailableBalance72Sign()
    {
        return unavailableBalance72Sign;
    }

    public void setUnavailableBalance72Sign(String unavailableBalance72Sign)
    {
        this.unavailableBalance72Sign = unavailableBalance72Sign;
    }

    public String getUnavailableBalanceTotalSign()
    {
        return unavailableBalanceTotalSign;
    }

    public void setUnavailableBalanceTotalSign(String unavailableBalanceTotalSign)
    {
        this.unavailableBalanceTotalSign = unavailableBalanceTotalSign;
    }

    public String getDebitTotalSign()
    {
        return debitTotalSign;
    }

    public void setDebitTotalSign(String debitTotalSign)
    {
        this.debitTotalSign = debitTotalSign;
    }

    public String getHavingsTotalSign()
    {
        return havingsTotalSign;
    }

    public void setHavingsTotalSign(String havingsTotalSign)
    {
        this.havingsTotalSign = havingsTotalSign;
    }

    public String getLockedTotalSign()
    {
        return lockedTotalSign;
    }

    public void setLockedTotalSign(String lockedTotalSign)
    {
        this.lockedTotalSign = lockedTotalSign;
    }

    public String getCreditorInterestSign()
    {
        return creditorInterestSign;
    }

    public void setCreditorInterestSign(String creditorInterestSign)
    {
        this.creditorInterestSign = creditorInterestSign;
    }

    public String getDebtopInterestSign()
    {
        return debtopInterestSign;
    }

    public void setDebtopInterestSign(String debtopInterestSign)
    {
        this.debtopInterestSign = debtopInterestSign;
    }

    public String getTotalLineSign()
    {
        return totalLineSign;
    }

    public void setTotalLineSign(String totalLineSign)
    {
        this.totalLineSign = totalLineSign;
    }

    public String getLineNotWarnedSign()
    {
        return lineNotWarnedSign;
    }

    public void setLineNotWarnedSign(String lineNotWarnedSign)
    {
        this.lineNotWarnedSign = lineNotWarnedSign;
    }

    @Override
    public String toString()
    {
        return "AccountData [actualBalance=" + actualBalance + ", availableBalance=" + availableBalance
                + ", unavailableBalance24=" + unavailableBalance24 + ", unavailableBalance48=" + unavailableBalance48
                + ", unavailableBalance72=" + unavailableBalance72 + ", unavailableBalanceTotal="
                + unavailableBalanceTotal + ", debitTotal=" + debitTotal + ", havingsTotal=" + havingsTotal
                + ", lockedTotal=" + lockedTotal + ", creditorInterest=" + creditorInterest + ", debtopInterest="
                + debtopInterest + ", totalLine=" + totalLine + ", lineNotWarned=" + lineNotWarned + ", filler1="
                + filler1 + ", accountName=" + accountName + ", dateLastTransaction=" + dateLastTransaction
                + ", filler2=" + filler2 + ", companyBt=" + companyBt + ", secuence=" + secuence + ", module=" + module
                + ", accountBt=" + accountBt + ", filler3=" + filler3 + ", wprmt03=" + wprmt03 + ", wprmt04=" + wprmt04
                + ", wprmt05=" + wprmt05 + ", wprmt06=" + wprmt06 + ", wprmt07=" + wprmt07 + ", wprmt08=" + wprmt08
                + ", wprmt09=" + wprmt09 + ", wprmt10=" + wprmt10 + ", wprmt11=" + wprmt11 + "]";
    }

}
