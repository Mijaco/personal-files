
package pe.com.scotiabank.tbk.consultas.converter;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.scotiabank.tbk.consultas.response.ManagementCheckResponse;
import pe.com.scotiabank.tbk.consultas.trama.output.TRCGOutput;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TRCGConverter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.trama.Trama;

public class ManagmentCheckGenerator
{

    private static Logger log = LoggerFactory.getLogger(ManagmentCheckGenerator.class);

    public static ManagementCheckResponse generateDataCheckInquiryManagementResponse(Map<String, Trama> tramasGenering)
    {

        ManagementCheckResponse response = new ManagementCheckResponse();
        try
        {

            for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
            {
                if (ConsultasWsConstants.TRCG.equals(trama.getKey()))
                {
                    TRCGOutput trtcOutput;
                    try
                    {
                        trtcOutput = (TRCGOutput) trama.getValue().getOutputBody();
                        log.debug("String body: " + trtcOutput.getStringBody());

                        response = new TRCGConverter.ConvertManagementCheckResponse().convert(trtcOutput);
                    }
                    finally
                    {
                        trtcOutput = null;
                    }

                }
            }
            if (response == null)
            {
                response = new ManagementCheckResponse();
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return response;

    }
}