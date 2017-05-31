
package pe.com.scotiabank.tbk.consultas.beans.report;

import pe.com.scotiabank.tbk.util.base.Reportable;

public class GeneralBalanceLeasingReportBean implements Reportable
{

    private String operation;
    private String description;
    private String dateExpiration;
    private String money;
    private String montImport;
    
    
    public GeneralBalanceLeasingReportBean()
    {
    }

    @Override
    public String[] getRow()
    {
        return new String[] { 
        		operation,
        		description,
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
    
    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getOperation()
    {
        return operation;
    }

    public void setOperation(String operation)
    {
        this.operation = operation;
    }
}
