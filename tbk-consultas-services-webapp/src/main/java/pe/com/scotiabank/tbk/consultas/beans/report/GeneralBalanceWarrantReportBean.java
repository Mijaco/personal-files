
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class GeneralBalanceWarrantReportBean implements Reportable
{

	private String certificate;
	private String operation;
	private String dateInit;
	private String warrant;
	private String money;
    private String montImport;
    private String situation;
    private String dateExpiration;
    private String beneficiary;
    
    public GeneralBalanceWarrantReportBean()
    {
    }
    
    @Override
    public String[] getRow()
    {
        return new String[] { 
        		certificate,
        		operation,
        		dateInit,
        		warrant,
        		money,
        		montImport,
        		situation,
        		dateExpiration,
        		beneficiary };
    }

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDateInit() {
		return dateInit;
	}

	public void setDateInit(String dateInit) {
		this.dateInit = dateInit;
	}

	public String getWarrant() {
		return warrant;
	}

	public void setWarrant(String warrant) {
		this.warrant = warrant;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getMontImport() {
		return montImport;
	}

	public void setMontImport(String montImport) {
		this.montImport = montImport;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}
}
