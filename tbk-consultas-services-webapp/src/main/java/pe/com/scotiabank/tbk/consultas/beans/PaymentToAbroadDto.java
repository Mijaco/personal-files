
package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlElementWrapper;

public class PaymentToAbroadDto
{
	private Integer totalRecords;
	private String fileName;
	private Boolean hasNextPage;
	private PaymentsToAbroadBean[] paymentsToAbroad;

    public PaymentToAbroadDto()
    {
    }

    public Integer getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public Boolean getHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	
	@XmlElementWrapper(name = "paymentsToAbroadList")
	public PaymentsToAbroadBean[] getPaymentsToAbroad() {
		return paymentsToAbroad;
	}

	public void setPaymentsToAbroad(PaymentsToAbroadBean[] paymentsToAbroad) {
		this.paymentsToAbroad = paymentsToAbroad;
	}

}
