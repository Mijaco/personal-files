
package pe.com.scotiabank.tbk.consultas.converter;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.scotiabank.tbk.consultas.beans.LoanApplication;
import pe.com.scotiabank.tbk.consultas.beans.LoanApplicationDetail;
import pe.com.scotiabank.tbk.consultas.response.CreditApplicationResponse;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.beans.Status;

public class CreditApplicationGenerator
{
    public static Logger log = LoggerFactory.getLogger(CreditApplicationGenerator.class);

    public static CreditApplicationResponse convertResponseLoanApplicationBean(byte[] response) throws UnsupportedEncodingException
    {
        CreditApplicationResponse outputResponse = null;
        LoanApplication loanApplication;
        String xabConsultaSolCred;
        xabConsultaSolCred = new String(response, ConsultasWsConstants.CHARSET_FILE_ANSI);
        try
        {
            outputResponse = new CreditApplicationResponse();
            loanApplication = new LoanApplication();
            String[] wordSplits = xabConsultaSolCred.split(ConsultasWsConstants.DELIMITER_CREDIT_APPLICATION);
            LoanApplicationDetail[] loanApplicationDetails;
            if (!wordSplits[0].trim().equals(ConsultasWsConstants.CONSTANT_NIL_SPACE))
            {
                loanApplicationDetails = new LoanApplicationDetail[wordSplits.length];
                for (int i = 1; i <= wordSplits.length; i++)
                {
                    if (!wordSplits[i - 1].trim().equals(ConsultasWsConstants.CONSTANT_NIL_SPACE))
                    {
                        loanApplicationDetails[i - 1] = new LoanApplicationDetail(wordSplits[i - 1]);

                        loanApplicationDetails[i - 1].setStatus((loanApplicationDetails[i - 1].getStatus().equalsIgnoreCase(ConsultasWsConstants.STATUS_DOCUMENTATION_PENDING))
                                ? (ConsultasWsConstants.STATUS_DOCUMENTATION_PENDING_DESCRIPTION)
                                : (loanApplicationDetails[i - 1].getStatus().equalsIgnoreCase(ConsultasWsConstants.STATUS_IN_APPROVAL)) ? (ConsultasWsConstants.STATUS_IN_APPROVAL_DESCRIPTION)
                                        : (loanApplicationDetails[i - 1].getStatus().equalsIgnoreCase(ConsultasWsConstants.STATUS_IN_STRUCTURING))
                                                ? (ConsultasWsConstants.STATUS_IN_STRUCTURING_DESCRIPTION)
                                                : (loanApplicationDetails[i - 1].getStatus().equalsIgnoreCase(ConsultasWsConstants.STATUS_RESOLVED))
                                                        ? (ConsultasWsConstants.STATUS_RESOLVED_DESCRIPTION) : loanApplicationDetails[i - 1].getStatus());
                    }
                }
            }
            else
            {
                loanApplicationDetails = new LoanApplicationDetail[0];
            }

            loanApplication.setDetails(loanApplicationDetails);
            outputResponse.setLoanApplication(loanApplication);
            outputResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_CODE));

        }
        catch (Exception e)
        {
            log.error(ConsultasWsConstants.MESSAGE_ERROR + e.getMessage(), e);
        }
        return outputResponse;
    }
}
