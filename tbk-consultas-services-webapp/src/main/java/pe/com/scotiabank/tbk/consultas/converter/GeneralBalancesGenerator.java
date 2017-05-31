
package pe.com.scotiabank.tbk.consultas.converter;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.scotiabank.tbk.consultas.response.AccountsAndProductsResponse;
import pe.com.scotiabank.tbk.consultas.response.AffiliationInquiryCheckingSavingsAccountsResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesByCategoryByPortfolioResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesByCategoryResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesDepositsTermResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesFactoringPendingResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesFactoringProcessedResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesFinancingResponse;
import pe.com.scotiabank.tbk.consultas.response.BalancesProductsForeignTradeResponse;
import pe.com.scotiabank.tbk.consultas.response.ReaderAliasUserAccountsResponse;
import pe.com.scotiabank.tbk.consultas.response.RegisterAliasUserAccountsResponse;
import pe.com.scotiabank.tbk.consultas.trama.output.TB02Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TB03Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TB93Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBC1Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBCAOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBEFOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBESOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBW1Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBX2Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TRLCOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TRRAOutput;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB02Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB03Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB93Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBC1Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBCAConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBEFConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBESConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBW1Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBX2Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TRLCConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TRRAConverter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.beans.Header;
import pe.com.scotiabank.tbk.util.beans.Status;
import pe.com.scotiabank.tbk.util.ftp.FTPExtractor;
import pe.com.scotiabank.tbk.util.trama.Trama;

/**
 * @author jventura
 *
 */
public class GeneralBalancesGenerator
{

    public static Logger log = LoggerFactory.getLogger(DataPaymentsTelebankingGenerator.class);

    public static AccountsAndProductsResponse generateDataShortCutsListResponse(Map<String, Trama> tramasGenering)
    {

        AccountsAndProductsResponse accountsAndProductsResponse = new AccountsAndProductsResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBX2)
            {
                TBX2Output tbx2Output = (TBX2Output) trama.getValue().getOutputBody();
                accountsAndProductsResponse = new TBX2Converter.ConverterOutputToAccountsAndProductsResponse().convert(tbx2Output);
            }
        }
        accountsAndProductsResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return accountsAndProductsResponse;
    }

    public static ReaderAliasUserAccountsResponse generateReaderAliasUserAccountsResponse(Map<String, Trama> tramasGenering,  FTPExtractor ftpExtractor)
    {

        ReaderAliasUserAccountsResponse aliasUserAccountsResponse = new ReaderAliasUserAccountsResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TRLC)
            {
                TRLCOutput trlcOutput = (TRLCOutput) trama.getValue().getOutputBody();
                trlcOutput.readFile(ftpExtractor.downloadFTP(trlcOutput.getFileNameFTP()));
                aliasUserAccountsResponse = new TRLCConverter.ConverterOutputToReaderAliasUserAccountsResponse().convert(trlcOutput);
            }
        }
        aliasUserAccountsResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return aliasUserAccountsResponse;
    }

    public static RegisterAliasUserAccountsResponse generateDataRegisterAliasUserAccountsResponse(Map<String, Trama> tramasGenering)
    {

        RegisterAliasUserAccountsResponse registerAliasUserAccountsResponse = new RegisterAliasUserAccountsResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TRRA)
            {
                TRRAOutput trraOutput = (TRRAOutput) trama.getValue().getOutputBody();
                registerAliasUserAccountsResponse = new TRRAConverter.ConverterOutputToRegisterAliasUserAccountsResponse().convert(trraOutput);
            }
        }
        registerAliasUserAccountsResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return registerAliasUserAccountsResponse;
    }

    public static BalancesByCategoryResponse generateDataBalancesByCategoryResponse(Map<String, Trama> tramasGenering, Map<String, String> typesOfAcountCurrencyMap)
    {

        BalancesByCategoryResponse balancesByCategoryResponse = new BalancesByCategoryResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TB02)
            {
                TB02Output tb02Output = (TB02Output) trama.getValue().getOutputBody();
                balancesByCategoryResponse = new TB02Converter.ConverterOutputToBalancesByCategoryResponse(typesOfAcountCurrencyMap).convert(tb02Output);
                
                Header header = trama.getValue().getHeaderOutput();
                balancesByCategoryResponse.setPaginationInd(header.getPaginationInd());
            }
        }
        balancesByCategoryResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return balancesByCategoryResponse;
    }

    public static BalancesDepositsTermResponse generateDataBalancesDepositsTermResponse(Map<String, Trama> tramasGenering)
    {

        BalancesDepositsTermResponse balancesDepositsTermResponse = new BalancesDepositsTermResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TB03)
            {
                TB03Output tb03Output = (TB03Output) trama.getValue().getOutputBody();
                balancesDepositsTermResponse = new TB03Converter.ConverterOutputToBalancesDepositsTermResponse().convert(tb03Output);
            }
        }
        balancesDepositsTermResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return balancesDepositsTermResponse;
    }

    public static BalancesFactoringPendingResponse generateDataBalancesFactoringPendingResponse(Map<String, Trama> tramasGenering)
    {

        BalancesFactoringPendingResponse balancesFactoringPendingResponse = new BalancesFactoringPendingResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBC1)
            {
                TBC1Output tbc1Output = (TBC1Output) trama.getValue().getOutputBody();
                balancesFactoringPendingResponse = new TBC1Converter.ConverterOutputToBalancesFactoringPendingResponse().convert(tbc1Output);
            }
        }
        balancesFactoringPendingResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return balancesFactoringPendingResponse;
    }

    public static BalancesFactoringProcessedResponse generateDataBalancesFactoringProcessedResponse(Map<String, Trama> tramasGenering)
    {

        BalancesFactoringProcessedResponse balancesFactoringProcessedResponse = new BalancesFactoringProcessedResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBCA)
            {
                TBCAOutput tbcaOutput = (TBCAOutput) trama.getValue().getOutputBody();
                balancesFactoringProcessedResponse = new TBCAConverter.ConverterOutputToBalancesFactoringProcessedResponse().convert(tbcaOutput);
            }
        }
        balancesFactoringProcessedResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return balancesFactoringProcessedResponse;
    }

    public static BalancesFinancingResponse generateDataBalancesFinancingResponse(Map<String, Trama> tramasGenering)
    {

        BalancesFinancingResponse balancesFinancingResponse = new BalancesFinancingResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TBEF)
            {
                TBEFOutput tbefOutput = (TBEFOutput) trama.getValue().getOutputBody();
                balancesFinancingResponse = new TBEFConverter.ConverterOutputToBalancesFinancingResponse().convert(tbefOutput);
            }
        }
        balancesFinancingResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return balancesFinancingResponse;
    }

    public static AffiliationInquiryCheckingSavingsAccountsResponse generateDataAffiliationInquiryCheckingSavingsAccountsResponse(Map<String, Trama> tramasGenering)
    {

        AffiliationInquiryCheckingSavingsAccountsResponse affiliationInquiryCheckingSavingsAccountsResponse = new AffiliationInquiryCheckingSavingsAccountsResponse();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TB93)
            {
                TB93Output tb93Output = (TB93Output) trama.getValue().getOutputBody();
                affiliationInquiryCheckingSavingsAccountsResponse = new TB93Converter.ConverterOutputToAffiliationInquiryCheckingSavingsAccountsResponse().convert(tb93Output);
            }
        }
        affiliationInquiryCheckingSavingsAccountsResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));

        return affiliationInquiryCheckingSavingsAccountsResponse;
    }

    public static BalancesProductsForeignTradeResponse generateBalancesProductsForeignTradeResponse(Map<String, Trama> tramasGenering)
    {

        BalancesProductsForeignTradeResponse balancesProductsForeignTradeResponse = new BalancesProductsForeignTradeResponse();
        try
        {
            for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
            {
                if (trama.getKey() == ConsultasWsConstants.TBES)
                {
                    TBESOutput tbesOutput = (TBESOutput) trama.getValue().getOutputBody();
                    balancesProductsForeignTradeResponse = new TBESConverter.ConverterOutputToBalancesProductsForeignTradeResponse().convert(tbesOutput);
                }
            }
            balancesProductsForeignTradeResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_CODE));
            return balancesProductsForeignTradeResponse;
        }
        catch (Exception e)
        {
            log.error(ConsultasWsConstants.MESSAGE_ERROR + e.getMessage(), e);
            return balancesProductsForeignTradeResponse;
        }
        finally
        {
            balancesProductsForeignTradeResponse = null;
        }

    }

    public static BalancesByCategoryByPortfolioResponse generateBalancesByCategoryByPortfolioResponse(Map<String, Trama> tramasGenering)
    {

        BalancesByCategoryByPortfolioResponse balancesByCategoryByPortfolioResponse = new BalancesByCategoryByPortfolioResponse();
        try
        {
            for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
            {
                if (trama.getKey() == ConsultasWsConstants.TBW1)
                {
                    TBW1Output tbw1Output = (TBW1Output) trama.getValue().getOutputBody();
                    balancesByCategoryByPortfolioResponse = new TBW1Converter.ConverterOutputToBalancesByCategoryByPortfolioResponse().convert(tbw1Output);
                }
            }
            balancesByCategoryByPortfolioResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_CODE));
            return balancesByCategoryByPortfolioResponse;
        }
        catch (Exception e)
        {
            log.error(ConsultasWsConstants.MESSAGE_ERROR + e.getMessage(), e);
            return balancesByCategoryByPortfolioResponse;
        }
        finally
        {
            balancesByCategoryByPortfolioResponse = null;
        }

    }
}
