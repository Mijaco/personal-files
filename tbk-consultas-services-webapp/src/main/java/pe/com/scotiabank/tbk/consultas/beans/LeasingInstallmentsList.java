
package pe.com.scotiabank.tbk.consultas.beans;

import java.io.Serializable;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import pe.com.scotiabank.tbk.consultas.trama.output.TBW8Output;

//@XmlRootElement // (name="loginServiceResponse")
@XmlType(name = "", namespace = "http://response.consultasservices.jaxws.tbk.scotiabank.com.pe")
public class LeasingInstallmentsList implements Serializable {

	private static final long serialVersionUID = 251106344019093028L;
	private LeasingInstallment[] leasingInstallment;

	public LeasingInstallmentsList() {

	}

	public LeasingInstallmentsList(TBW8Output tbw8Output) {
		this.loadCuotasLeasing(tbw8Output.getLeasings());
	}

	public void loadCuotasLeasing(LeasingInstallmentBean[] leasings) {
		int p = 0;
		leasingInstallment = new LeasingInstallment[21];
		for (LeasingInstallmentBean leasingInstallmentBean : leasings) {

			this.leasingInstallment[p] = (new LeasingInstallment(leasingInstallmentBean.getExpDate(),
					leasingInstallmentBean.getCapital(), leasingInstallmentBean.getAmort(),
					leasingInstallmentBean.getInteres(), leasingInstallmentBean.getCommision(),
					leasingInstallmentBean.getAnother(), leasingInstallmentBean.getTotal(),
					leasingInstallmentBean.getSign(), leasingInstallmentBean.getSituation(),
					leasingInstallmentBean.getDate()));
			p++;
		}
	}

	@XmlElementWrapper(name="leasingInstallment")
	public LeasingInstallment[] getLeasingInstallment() {
		return leasingInstallment;
	}

	public void setLeasingInstallment(LeasingInstallment[] leasingInstallment) {
		this.leasingInstallment = leasingInstallment;
	}

	@Override
	public String toString() {
		return "ConsultaCuotaLeasing [cuotaLeasings=" + Arrays.toString(leasingInstallment) + "]";
	}

}
