package pe.com.scotiabank.tbk.consultas.converter;

import java.io.File;
import java.util.Map;

import pe.com.scotiabank.tbk.consultas.beans.PaymentFromAbroadDto;
import pe.com.scotiabank.tbk.consultas.beans.PaymentToAbroadDto;
import pe.com.scotiabank.tbk.consultas.response.PaymentInquiryFromToAbroadResponse;
import pe.com.scotiabank.tbk.consultas.trama.output.TR31Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TR32Output;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TR31Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TR32Converter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.beans.Header;
import pe.com.scotiabank.tbk.util.ftp.FTPExtractor;
import pe.com.scotiabank.tbk.util.trama.Trama;

public class PaymentsGenerator {

	public static PaymentInquiryFromToAbroadResponse generatePaymentsToFromAbroadResponse(Map<String, Trama> tramasGenerics,  FTPExtractor ftpExtractor) {

		PaymentInquiryFromToAbroadResponse response = new PaymentInquiryFromToAbroadResponse();
		
		for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet()) {
			
			if (trama.getKey().equals(ConsultasWsConstants.TR31)) {
				
				TR31Output tr31Output = (TR31Output) trama.getValue().getOutputBody();
				Header header = trama.getValue().getHeaderOutput();
				
				//call converter
				PaymentFromAbroadDto tr31PaymentFromAbroadDto = new TR31Converter.PaymentFromAbroadDtoConverter().convert(tr31Output);
				tr31PaymentFromAbroadDto.setFlagPagination(String.valueOf(header.getPaginationInd()));				
				response.setPaymentFromAbroadDto(tr31PaymentFromAbroadDto);

			} else if (trama.getKey().equals(ConsultasWsConstants.TR32)) {
			
				TR32Output tr32Output = (TR32Output) trama.getValue().getOutputBody();
				File filePayments = ftpExtractor.downloadFTP(tr32Output.getSessionName());
				String nameFile = (filePayments != null && filePayments.exists()) ? filePayments.getName() : null;
				tr32Output.readDataFile(filePayments, 0);
				
				//call converter
				PaymentToAbroadDto responseObject = new TR32Converter.PaymentToAbroadDtoConverter().convert(tr32Output);
				responseObject.setFileName(nameFile);
				
				response.setPaymentToAbroadDto(responseObject);
			}
		}

		return response;
	}

}
