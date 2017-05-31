
package pe.com.scotiabank.tbk.consultas.converter;

import java.io.File;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.scotiabank.tbk.consultas.beans.DetailPaymentsIssued;
import pe.com.scotiabank.tbk.consultas.beans.DetailPaymentsReceived;
import pe.com.scotiabank.tbk.consultas.beans.PaymentReceived;
import pe.com.scotiabank.tbk.consultas.beans.PaymentsIssued;
import pe.com.scotiabank.tbk.consultas.response.DataPaymentsTelebankingDetailResponse;
import pe.com.scotiabank.tbk.consultas.response.DataPaymentsTelebankingResponse;
import pe.com.scotiabank.tbk.consultas.trama.output.TB29Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TB2KOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TB2LOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TB78Output;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB29Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB2KConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB2LConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB78Converter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsFunctions;
import pe.com.scotiabank.tbk.util.beans.Status;
import pe.com.scotiabank.tbk.util.ftp.FTPExtractor;
import pe.com.scotiabank.tbk.util.trama.Trama;

public class DataPaymentsTelebankingGenerator
{

    public static Logger log = LoggerFactory.getLogger(DataPaymentsTelebankingGenerator.class);
    
    public static DataPaymentsTelebankingResponse generateResponsePaymentReceivedIssued(Map<String, Trama> tramasGenering,String nameFileFtp, String page,  FTPExtractor ftpExtractor)
    {
        File file=null;
        TB2KOutput tb2kOutput;
        TB78Output tb78Output;
        
        DataPaymentsTelebankingResponse dataPaymentsTelebankingConsolidated = new DataPaymentsTelebankingResponse();
        try
        {
                for (Map.Entry<String, Trama> trama : tramasGenering.entrySet()){
                    if (trama.getKey() == ConsultasWsConstants.TB78){
                        
                        if (nameFileFtp==null || nameFileFtp.isEmpty())
                        {
                            tb78Output = (TB78Output) trama.getValue().getOutputBody();
                            file = ftpExtractor.downloadFTP(tb78Output.getNameFile());
                            tb78Output.readFile(file);
                            tb78Output.setNameFile(file.getName());
                        }
                        else
                        {
                            tb78Output = new TB78Output();
                            file = ConsultasWsFunctions.getFileByName(nameFileFtp);
                            if(file.isFile())
                            {
                                tb78Output.setNameFile(nameFileFtp);
                                tb78Output.readFile(file,Integer.parseInt(page));
                            }
                        }
                        PaymentReceived tb78QueryPaymentReceived = new TB78Converter.ConverterOutputPaymentReceivedResponse().convert(tb78Output);
                        dataPaymentsTelebankingConsolidated.setTotalRecords(tb78QueryPaymentReceived.getNroRegistros());
                        dataPaymentsTelebankingConsolidated.setFileName(file.getName());
                        dataPaymentsTelebankingConsolidated.setPaymentReceived(tb78QueryPaymentReceived);
                    }
                    else if (trama.getKey() == ConsultasWsConstants.TB2K)
                    {
                        
                        if (nameFileFtp == null || nameFileFtp.isEmpty())
                        {
                            tb2kOutput = (TB2KOutput) trama.getValue().getOutputBody();
                            file = ftpExtractor.downloadFTP(tb2kOutput.getNameFile());
                            tb2kOutput.readFile(file);
                            tb2kOutput.setNameFile(file.getName());
                        }
                        else
                        {
                            tb2kOutput = new TB2KOutput();
                            file = ConsultasWsFunctions.getFileByName(nameFileFtp);
                            if(file.isFile())
                            {
                                tb2kOutput.setNameFile(nameFileFtp);
                                tb2kOutput.readFile(file,Integer.parseInt(page));
                            }
                        }
                        PaymentsIssued tb2kQueryIssuedPayments = new TB2KConverter.ConverterOutputPaymentIssuedResponse().convert(tb2kOutput);
                        dataPaymentsTelebankingConsolidated.setTotalRecords(tb2kQueryIssuedPayments.getNroRegistros());
                        dataPaymentsTelebankingConsolidated.setFileName(file.getName());
                        dataPaymentsTelebankingConsolidated.setPaymentsIssued(tb2kQueryIssuedPayments);
                    }
                }
            dataPaymentsTelebankingConsolidated.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_CODE));
            return dataPaymentsTelebankingConsolidated;
        }
        catch (Exception e)
        {
            log.error(ConsultasWsConstants.MESSAGE_ERROR + e.getMessage(), e);
            return dataPaymentsTelebankingConsolidated;
        }finally{
            dataPaymentsTelebankingConsolidated = null;
            tb2kOutput = null;
            tb78Output = null;
            file = null;
        }
    }
    
    public static DataPaymentsTelebankingDetailResponse generateResponsePaymentReceivedIssuedDetail(Map<String, Trama> tramasGenering)
    {
        DataPaymentsTelebankingDetailResponse dataPaymentsTelebankingConsolidated = new DataPaymentsTelebankingDetailResponse();
        try
        {
            for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
            {
                if (trama.getKey() == ConsultasWsConstants.TB29)
                {
                    TB29Output TB29Output = (TB29Output) trama.getValue().getOutputBody();
                    DetailPaymentsReceived TB29QueryPaymentDTO = new TB29Converter.converterOutputDetailPaymentReceivedResponse().convert(TB29Output);
                    dataPaymentsTelebankingConsolidated.setDetailPaymentsReceived(TB29QueryPaymentDTO);
                }
                else if (trama.getKey() == ConsultasWsConstants.TB2L)
                {
                    TB2LOutput TB2LOutput = (TB2LOutput) trama.getValue().getOutputBody();
                    DetailPaymentsIssued TB2LQueryIssuedPayments = new TB2LConverter.ConverterOutputDetailPaymentResponse().convert(TB2LOutput);
                    dataPaymentsTelebankingConsolidated.setDetailPaymentsIssued(TB2LQueryIssuedPayments);
                }
            }
            dataPaymentsTelebankingConsolidated.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_CODE));
            return dataPaymentsTelebankingConsolidated;
        }
        catch (Exception e)
        {
            log.error(ConsultasWsConstants.MESSAGE_ERROR + e.getMessage(), e);
            return dataPaymentsTelebankingConsolidated;
        }
        finally
        {
            dataPaymentsTelebankingConsolidated = null;
        }
    }
}
