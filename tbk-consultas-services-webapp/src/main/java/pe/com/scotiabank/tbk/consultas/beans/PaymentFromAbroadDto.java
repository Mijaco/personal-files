package pe.com.scotiabank.tbk.consultas.beans;

import javax.xml.bind.annotation.XmlElementWrapper;

public class PaymentFromAbroadDto {

	private String flagPagination;
	private PaymentsFromAbroadBean[] paymentsFromAbroadBean;

	public PaymentFromAbroadDto() {

	}

	public String getFlagPagination() {
		return flagPagination;
	}

	public void setFlagPagination(String flagPagination) {
		this.flagPagination = flagPagination;
	}
	
	@XmlElementWrapper(name = "paymentsFromAbroadBeanList")
	public PaymentsFromAbroadBean[] getPaymentsFromAbroadBean() {
		return paymentsFromAbroadBean;
	}

	public void setPaymentsFromAbroadBean(PaymentsFromAbroadBean[] paymentsFromAbroadBean) {
		this.paymentsFromAbroadBean = paymentsFromAbroadBean;
	}

}
