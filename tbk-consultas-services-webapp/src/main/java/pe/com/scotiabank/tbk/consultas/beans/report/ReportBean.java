package pe.com.scotiabank.tbk.consultas.beans.report;

import java.util.Arrays;
import java.util.List;

public class ReportBean {
	
	private String[] header;
	private String reportTitle;
	private String companyTitle;
	
	public ReportBean(){
		
	}

	public String[] getHeader() {
		return header;
	}
	
	public List<String> getHeaderList() {
		return Arrays.asList(header);
	}

	public void setHeader(String[] header) {
		this.header = header;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getCompanyTitle() {
		return companyTitle;
	}

	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}
	
	

}
