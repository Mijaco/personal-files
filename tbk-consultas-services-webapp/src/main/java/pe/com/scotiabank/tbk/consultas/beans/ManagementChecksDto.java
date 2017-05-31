package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlElementWrapper;

public class ManagementChecksDto {
	
	private ManagementCheck[] managementChecks;

	@XmlElementWrapper(name = "managementCheckList")
	public ManagementCheck[] getManagementChecks() {
		return managementChecks;
	}

	public void setManagementChecks(ManagementCheck[] managementChecks) {
		this.managementChecks = managementChecks;
	}
	
}
