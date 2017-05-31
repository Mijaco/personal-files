
package pe.com.scotiabank.tbk.consultas.converter;

import java.io.File;
import java.util.Map;

import pe.com.scotiabank.tbk.consultas.beans.AccountData;
import pe.com.scotiabank.tbk.consultas.beans.AdvanceAccountList;
import pe.com.scotiabank.tbk.consultas.beans.Bail;
import pe.com.scotiabank.tbk.consultas.beans.Deposit;
import pe.com.scotiabank.tbk.consultas.beans.GuaranteeList;
import pe.com.scotiabank.tbk.consultas.beans.LeasingDetailList;
import pe.com.scotiabank.tbk.consultas.beans.LeasingInstallmentsList;
import pe.com.scotiabank.tbk.consultas.beans.MortGage;
import pe.com.scotiabank.tbk.consultas.beans.MovementByPageList;
import pe.com.scotiabank.tbk.consultas.beans.MovementDetail;
import pe.com.scotiabank.tbk.consultas.beans.MovementList;
import pe.com.scotiabank.tbk.consultas.beans.ProductMovementDetailList;
import pe.com.scotiabank.tbk.consultas.beans.ProductOperationDetail;
import pe.com.scotiabank.tbk.consultas.beans.WarrantList;
import pe.com.scotiabank.tbk.consultas.response.AccountDataResponse;
import pe.com.scotiabank.tbk.consultas.response.AdvanceAccountsResponse;
import pe.com.scotiabank.tbk.consultas.response.BailResponse;
import pe.com.scotiabank.tbk.consultas.response.DepositResponse;
import pe.com.scotiabank.tbk.consultas.response.DetailOperationProductResponse;
import pe.com.scotiabank.tbk.consultas.response.GuaranteesResponse;
import pe.com.scotiabank.tbk.consultas.response.LeasingDetailsResponse;
import pe.com.scotiabank.tbk.consultas.response.LeasingInstallmentsResponse;
import pe.com.scotiabank.tbk.consultas.response.LoanCollateralsResponse;
import pe.com.scotiabank.tbk.consultas.response.MovementDetailResponse;
import pe.com.scotiabank.tbk.consultas.response.MovementsByDateByPageResponse;
import pe.com.scotiabank.tbk.consultas.response.MovementsByDateResponse;
import pe.com.scotiabank.tbk.consultas.response.ProductMovementsDetailsResponse;
import pe.com.scotiabank.tbk.consultas.response.WarrantsResponse;
import pe.com.scotiabank.tbk.consultas.trama.output.TB11Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TB15Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TB52Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBACOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBEAOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBEDOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBG1Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBG2Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBG3Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBG6Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBW7Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBW8Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TRCMOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TRCPOutput;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB11Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB15Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB52Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBACConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBEAConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBEDConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBG1Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBG2Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBG3Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBG6Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBW7Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBW8Converter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.beans.Header;
import pe.com.scotiabank.tbk.util.beans.Status;
import pe.com.scotiabank.tbk.util.ftp.FTPExtractor;
import pe.com.scotiabank.tbk.util.trama.Trama;

public class GeneralBalanceInquiryDetailsGenerator
{

    public static LoanCollateralsResponse generateLoanCollateralsResponse(Map<String, Trama> tramasGenerics)
    {
        LoanCollateralsResponse response = new LoanCollateralsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBG3)
            {
                TBG3Output tbg3Output = (TBG3Output) trama.getValue().getOutputBody();
                MortGage mortGage = new TBG3Converter().convert(tbg3Output);
                response.setMortGage(mortGage);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static LeasingInstallmentsResponse generateLeasingInstallmentsResponse(Map<String, Trama> tramasGenerics)
    {
        LeasingInstallmentsResponse response = new LeasingInstallmentsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBW8)
            {
                TBW8Output tbw8Output = (TBW8Output) trama.getValue().getOutputBody();
                LeasingInstallmentsList leasingInstallmentsList = new TBW8Converter().convert(tbw8Output);
                response.setLeasingInstallmentsList(leasingInstallmentsList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static LeasingDetailsResponse generateLeasingDetailsResponse(Map<String, Trama> tramasGenerics)
    {
        LeasingDetailsResponse response = new LeasingDetailsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBW7)
            {
                TBW7Output tbw7Output = (TBW7Output) trama.getValue().getOutputBody();
                LeasingDetailList leasingDetailsList = new TBW7Converter().convert(tbw7Output);
                response.setLeasingDetailsList(leasingDetailsList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static MovementDetailResponse generateMovementDetailResponse(Map<String, Trama> tramasGenerics)
    {
        MovementDetailResponse response = new MovementDetailResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TB15)
            {
                TB15Output tb15utput = (TB15Output) trama.getValue().getOutputBody();
                MovementDetail movementDetail = new TB15Converter().convert(tb15utput);
                response.setMovementDetail(movementDetail);
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static AccountDataResponse generateAccountDataResponse(Map<String, Trama> tramasGenerics)
    {
        AccountDataResponse response = new AccountDataResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TB52)
            {
                TB52Output tb52Output = (TB52Output) trama.getValue().getOutputBody();
                AccountData accountData = new TB52Converter().convert(tb52Output);
                response.setAccountData(accountData);
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static GuaranteesResponse generateGuaranteesResponse(Map<String, Trama> tramasGenerics)
    {
        GuaranteesResponse response = new GuaranteesResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBG2)
            {
                TBG2Output tbg2Output = (TBG2Output) trama.getValue().getOutputBody();
                GuaranteeList guaranteeList = new TBG2Converter().convert(tbg2Output);
                response.setGuaranteeList(guaranteeList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static WarrantsResponse generateWarrantsResponse(Map<String, Trama> tramasGenerics)
    {
        WarrantsResponse response = new WarrantsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBG1)
            {
                TBG1Output tbg1Output = (TBG1Output) trama.getValue().getOutputBody();
                WarrantList warrantList = new TBG1Converter().convert(tbg1Output);
                response.setWarrantList(warrantList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static AdvanceAccountsResponse generateAdvanceAccountsResponse(Map<String, Trama> tramasGenerics)
    {
        AdvanceAccountsResponse response = new AdvanceAccountsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBAC)
            {
                TBACOutput tbacOutput = (TBACOutput) trama.getValue().getOutputBody();
                AdvanceAccountList advanceAccountList = new TBACConverter().convert(tbacOutput);
                response.setAdvanceAccountList(advanceAccountList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static MovementsByDateResponse generateMovementsByDateResponse(Map<String, Trama> tramasGenerics,  FTPExtractor ftpExtractor)
    {
        MovementsByDateResponse response = new MovementsByDateResponse();
        String timeHash = String.valueOf(System.currentTimeMillis());

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TRCM)
            {

                final String IDENTIFIER_FILE = "PA";

                TRCMOutput trcmOutput = (TRCMOutput) trama.getValue().getOutputBody();
                String nameFileGenerated = new StringBuilder().append(IDENTIFIER_FILE).append(timeHash).toString();                
                trcmOutput.getListTRCMFileOutput(ftpExtractor.downloadFTP(trcmOutput.getSessionName(), nameFileGenerated));

                MovementList movementList = new MovementList(trcmOutput);
                movementList.setSessionName(nameFileGenerated);

                response.setMovementList(movementList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static MovementsByDateByPageResponse generateMovementsByDateByPageResponse(Map<String, Trama> tramasGenerics,  FTPExtractor ftpExtractor)
    {
        MovementsByDateByPageResponse response = new MovementsByDateByPageResponse();
        String timeHash = String.valueOf(System.currentTimeMillis());

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TRCP)
            {
                final String IDENTIFIER_FILE = "PA";

                TRCPOutput trcpOutput = (TRCPOutput) trama.getValue().getOutputBody();
                String nameFileGenerated = new StringBuilder().append(IDENTIFIER_FILE).append(timeHash).toString();
                trcpOutput.getListTRCPFileOutput(ftpExtractor.downloadFTP(trcpOutput.getSessionName(), nameFileGenerated));

                MovementByPageList movementByPageList = new MovementByPageList(trcpOutput);
                movementByPageList.setSessionName(nameFileGenerated);

                response.setMovementByPageList(movementByPageList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static DetailOperationProductResponse getDetailOperationProduct(Map<String, Trama> tramasGenerics)
    {
        DetailOperationProductResponse response = new DetailOperationProductResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBED)
            {
                TBEDOutput tbedOutput = (TBEDOutput) trama.getValue().getOutputBody();

                // call converter
                ProductOperationDetail productOperationDetail = new TBEDConverter.DetailOperationProductConverter().convert(tbedOutput);
                response.setProductOperationDetail(productOperationDetail);
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static BailResponse getBailService(Map<String, Trama> tramasGenerics, String pageNumber,  FTPExtractor ftpExtractor)
    {
        BailResponse response = new BailResponse();
        TBG6Output tbg6Output;
        File file=null;

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey().equals(ConsultasWsConstants.TBG6))
            {
                tbg6Output = (TBG6Output) trama.getValue().getOutputBody();
                file = ftpExtractor.downloadFTP(tbg6Output.getNameFile());
                tbg6Output.readFile(file, Integer.valueOf(pageNumber));
                tbg6Output.setNameFile(file.getName());
                
                Bail tbg6Bail = new TBG6Converter.BailConverter().convert(tbg6Output);
                response.setTotalRecords(tbg6Bail.getQuantityRegister());
                response.setFileName(file.getName());
                response.setBail(tbg6Bail);
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static DepositResponse getDepositService(Map<String, Trama> tramasGenerics, String pageNumber,  FTPExtractor ftpExtractor)
    {
    	DepositResponse response = new DepositResponse();
    	TB11Output tb11Output;
        File file=null;

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey().equals(ConsultasWsConstants.TB11))
            {
                tb11Output = (TB11Output) trama.getValue().getOutputBody();
                file = ftpExtractor.downloadFTP(tb11Output.getNameFile());
                tb11Output.readFile(file, Integer.valueOf(pageNumber));
                tb11Output.setNameFile(file.getName());
                
                Deposit tb11Deposit = new TB11Converter.DepositConverter().convert(tb11Output);
                response.setTotalRecords(tb11Deposit.getQuantityRegister());
                response.setFileName(file.getName());
                response.setDeposit(tb11Deposit);
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

    public static ProductMovementsDetailsResponse generateProductMovementsDetailsResponse(Map<String, Trama> tramasGenerics)
    {
        ProductMovementsDetailsResponse response = new ProductMovementsDetailsResponse();

        for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBEA)
            {
                TBEAOutput tbeaOutput = (TBEAOutput) trama.getValue().getOutputBody();                
                // call converter
                ProductMovementDetailList productMovementDetailList = new TBEAConverter.ProductTransactionConverter().convert(tbeaOutput);                
                response.setProductMovementDetailList(productMovementDetailList);
                
                Header header = trama.getValue().getHeaderOutput();
                response.setFlagPagination(header.getPaginationInd());
            }
        }
        response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return response;
    }

}
