
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class GeneralBalanceJoinSeveralBondReportBean implements Reportable
{

    private String movement;
    private String dateValor;
    private String dateExpiration;
    private String money;
    private String montImport;
    private String Guarantor;
    
    public GeneralBalanceJoinSeveralBondReportBean()
    {
    }
    
    @Override
    public String[] getRow()
    {
        return new String[] { 
        		movement,
        		dateValor,
        		dateExpiration,
        		money,
        		montImport,
        		Guarantor };
    }

	public String getMovement() {
		return movement;
	}

	public void setMovement(String movement) {
		this.movement = movement;
	}

	public String getDateValor() {
		return dateValor;
	}

	public void setDateValor(String dateValor) {
		this.dateValor = dateValor;
	}

	public String getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
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

	public String getGuarantor() {
		return Guarantor;
	}

	public void setGuarantor(String guarantor) {
		Guarantor = guarantor;
	}
}
