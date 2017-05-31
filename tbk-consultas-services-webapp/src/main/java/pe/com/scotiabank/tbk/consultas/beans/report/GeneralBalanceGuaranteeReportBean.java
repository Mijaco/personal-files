
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class GeneralBalanceGuaranteeReportBean implements Reportable
{

	private String certificate;
    private String movement;
    private String dateInit;
    private String dateExpiration;
    private String money;
    private String montImport;
    
    public GeneralBalanceGuaranteeReportBean()
    {
    }

    @Override
    public String[] getRow()
    {
        return new String[] { 
        		certificate,
        		movement,
        		dateInit,
        		dateExpiration,
        		money,
        		montImport };
    }
    
    public String getDateExpiration()
    {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration)
    {
        this.dateExpiration = dateExpiration;
    }

    public String getMoney()
    {
        return money;
    }

    public void setMoney(String money)
    {
        this.money = money;
    }

    public String getMontImport()
    {
        return montImport;
    }

    public void setMontImport(String montImport)
    {
        this.montImport = montImport;
    }
    
	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public String getDateInit() {
		return dateInit;
	}

	public void setDateInit(String dateInit) {
		this.dateInit = dateInit;
	}
}
