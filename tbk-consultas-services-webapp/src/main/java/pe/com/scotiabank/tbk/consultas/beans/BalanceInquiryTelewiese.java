package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TB52Output;


@XmlType(name = "", namespace = "http://response.notesandconstancyservices.jaxws.tbk.scotiabank.com.pe")
public class BalanceInquiryTelewiese {

    private String actualBalance;
    private String availableBalance;
    private String unavailableBalance24;
    private String unavailableBalance48;
    private String unavailableBalance72;
    private String unavailableBalanceTotal;
    private String debitTotal;
    private String havingsTotal;
    private String lockedTotal;
    private String creditorInterest;
    private String debtopInterest;
    private String totalLine;
    private String lineNotWarned;
    private String filler1;
    private String accountName;
    private String dateLastTransaction;
    private String filler2;
    private String companyBt;
    private String secuence;
    private String module;
    private String accountBt;
    private String filler3;
    private String wprmt03;
    private String wprmt04;
    private String wprmt05;
    private String wprmt06;
    private String wprmt07;
    private String wprmt08;
    private String wprmt09;
    private String wprmt10;
    private String wprmt11;

    
    public BalanceInquiryTelewiese(TB52Output tb52output)
    {
        this.actualBalance = tb52output.getActualBalance();
        this.availableBalance = tb52output.getAvailableBalance();
        this.unavailableBalance24 = tb52output.getUnavailableBalance24();
        this.unavailableBalance48 = tb52output.getUnavailableBalance48();
        this.unavailableBalance72 = tb52output.getUnavailableBalance72();
        this.unavailableBalanceTotal = tb52output.getUnavailableBalanceTotal();
        this.debitTotal = tb52output.getDebitTotal();
        this.havingsTotal = tb52output.getHavingsTotal();
        this.lockedTotal = tb52output.getLockedTotal();
        this.creditorInterest = tb52output.getCreditorInterest();
        this.debtopInterest = tb52output.getDebtopInterest();
        this.totalLine = tb52output.getTotalLine();
        this.lineNotWarned = tb52output.getLineNotWarned();
        this.filler1 =tb52output.getFiller1();
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

    public BalanceInquiryTelewiese() {

	}

	public String getActualBalance() {
		return actualBalance;
	}

	public void setActualBalance(String actualBalance) {
		this.actualBalance = actualBalance;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getUnavailableBalance24() {
		return unavailableBalance24;
	}

	public void setUnavailableBalance24(String unavailableBalance24) {
		this.unavailableBalance24 = unavailableBalance24;
	}

	public String getUnavailableBalance48() {
		return unavailableBalance48;
	}

	public void setUnavailableBalance48(String unavailableBalance48) {
		this.unavailableBalance48 = unavailableBalance48;
	}

	public String getUnavailableBalance72() {
		return unavailableBalance72;
	}

	public void setUnavailableBalance72(String unavailableBalance72) {
		this.unavailableBalance72 = unavailableBalance72;
	}

	public String getUnavailableBalanceTotal() {
		return unavailableBalanceTotal;
	}

	public void setUnavailableBalanceTotal(String unavailableBalanceTotal) {
		this.unavailableBalanceTotal = unavailableBalanceTotal;
	}
	
	public String getDebitTotal() {
		return debitTotal;
	}

	public void setDebitTotal(String debitTotal) {
		this.debitTotal = debitTotal;
	}

	public String getHavingsTotal() {
		return havingsTotal;
	}

	public void setHavingsTotal(String havingsTotal) {
		this.havingsTotal = havingsTotal;
	}

	public String getLockedTotal() {
		return lockedTotal;
	}

	public void setLockedTotal(String lockedTotal) {
		this.lockedTotal = lockedTotal;
	}

	public String getCreditorInterest() {
		return creditorInterest;
	}

	public void setCreditorInterest(String creditorInterest) {
		this.creditorInterest = creditorInterest;
	}

	public String getDebtopInterest() {
		return debtopInterest;
	}

	public void setDebtopInterest(String debtopInterest) {
		this.debtopInterest = debtopInterest;
	}

	public String getTotalLine() {
		return totalLine;
	}

	public void setTotalLine(String totalLine) {
		this.totalLine = totalLine;
	}

	public String getLineNotWarned() {
		return lineNotWarned;
	}

	public void setLineNotWarned(String lineNotWarned) {
		this.lineNotWarned = lineNotWarned;
	}

	public String getFiller1() {
		return filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDateLastTransaction() {
		return dateLastTransaction;
	}

	public void setDateLastTransaction(String dateLastTransaction) {
		this.dateLastTransaction = dateLastTransaction;
	}

	public String getFiller2() {
		return filler2;
	}
	
	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getCompanyBt() {
		return companyBt;
	}

	public void setCompanyBt(String companyBt) {
		this.companyBt = companyBt;
	}

	public String getSecuence() {
		return secuence;
	}

	public void setSecuence(String secuence) {
		this.secuence = secuence;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getAccountBt() {
		return accountBt;
	}

	public void setAccountBt(String accountBt) {
		this.accountBt = accountBt;
	}

	public String getFiller3() {
		return filler3;
	}

	public void setFiller3(String filler3) {
		this.filler3 = filler3;
	}

	public String getWprmt03() {
		return wprmt03;
	}

	public void setWprmt03(String wprmt03) {
		this.wprmt03 = wprmt03;
	}

	public String getWprmt04() {
		return wprmt04;
	}

	public void setWprmt04(String wprmt04) {
		this.wprmt04 = wprmt04;
	}

	public String getWprmt05() {
		return wprmt05;
	}

	public void setWprmt05(String wprmt05) {
		this.wprmt05 = wprmt05;
	}

	public String getWprmt06() {
		return wprmt06;
	}

	public void setWprmt06(String wprmt06) {
		this.wprmt06 = wprmt06;
	}

	public String getWprmt07() {
		return wprmt07;
	}

	public void setWprmt07(String wprmt07) {
		this.wprmt07 = wprmt07;
	}

	public String getWprmt08() {
		return wprmt08;
	}

	public void setWprmt08(String wprmt08) {
		this.wprmt08 = wprmt08;
	}

	public String getWprmt09() {
		return wprmt09;
	}

	public void setWprmt09(String wprmt09) {
		this.wprmt09 = wprmt09;
	}

	public String getWprmt10() {
		return wprmt10;
	}

	public void setWprmt10(String wprmt10) {
		this.wprmt10 = wprmt10;
	}

	public String getWprmt11() {
		return wprmt11;
	}

	public void setWprmt11(String wprmt11) {
		this.wprmt11 = wprmt11;
	}


}
