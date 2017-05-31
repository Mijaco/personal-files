package pe.com.scotiabank.tbk.consultas.converter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.com.scotiabank.tbk.consultas.beans.AccessLog;
import pe.com.scotiabank.tbk.consultas.beans.AccountData;
import pe.com.scotiabank.tbk.consultas.beans.FtpIp;
import pe.com.scotiabank.tbk.consultas.beans.NotesPdf;
import pe.com.scotiabank.tbk.consultas.beans.NotesUrl;
import pe.com.scotiabank.tbk.consultas.response.AccessLogResponse;
import pe.com.scotiabank.tbk.consultas.response.AccountDataResponse;
import pe.com.scotiabank.tbk.consultas.response.CallPdfResponse;
import pe.com.scotiabank.tbk.consultas.response.CallUrlResponse;
import pe.com.scotiabank.tbk.consultas.response.FtpIpResponse;
import pe.com.scotiabank.tbk.consultas.response.ReaderAliasUserAccountsResponseNC;
import pe.com.scotiabank.tbk.consultas.trama.output.PDFOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TB52Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TBNCOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.TBY7Output;
import pe.com.scotiabank.tbk.consultas.trama.output.TRLCOutput;
import pe.com.scotiabank.tbk.consultas.trama.output.URLOutput;
import pe.com.scotiabank.tbk.consultas.tramas.converter.PDFConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TB52Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBNCConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TBY7Converter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.TRLCConverter;
import pe.com.scotiabank.tbk.consultas.tramas.converter.URLConverter;
import pe.com.scotiabank.tbk.consultas.util.ConsultasWsConstants;
import pe.com.scotiabank.tbk.util.beans.Status;
import pe.com.scotiabank.tbk.util.ftp.FTPExtractor;
import pe.com.scotiabank.tbk.util.trama.Trama;

public class NotesAndConstancyGenerator {
	private static final Logger log = LoggerFactory.getLogger(NotesAndConstancyGenerator.class);
	public static FtpIpResponse getCredencialsFTPService(Map<String, Trama> tramasGenerics) {
		FtpIpResponse response = new FtpIpResponse();

		for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet()) {

			if (trama.getKey() == ConsultasWsConstants.TBY7) {
				TBY7Output tbedOutput = (TBY7Output) trama.getValue().getOutputBody();	
				//call converter
				FtpIp ftpIp = new TBY7Converter.FtpIpConverter().convert(tbedOutput);
				response.setFtpIp(ftpIp);
			}
		}
		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}
	
	public static AccountDataResponse getAccountBTService(Map<String, Trama> tramasGenerics) {
		AccountDataResponse response = new AccountDataResponse();

		for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet()) {

			if (trama.getKey() == ConsultasWsConstants.TB52) {
				TB52Output tbOutput = (TB52Output) trama.getValue().getOutputBody();
				AccountData accountData = new TB52Converter().convert(tbOutput);
				response.setAccountData(accountData);
			}
		}
		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}

	public static AccessLogResponse generateAccessLogService(Map<String, Trama> tramasGenerics) {
		AccessLogResponse response = new AccessLogResponse();

		for (Map.Entry<String, Trama> trama : tramasGenerics.entrySet()) {
			if (trama.getKey() == ConsultasWsConstants.TBNC) {
				TBNCOutput tbncOutput = (TBNCOutput) trama.getValue().getOutputBody();
				
				//call converter
				AccessLog accessLog = new TBNCConverter.AccessLogConverter().convert(tbncOutput);
				response.setAccessLog(accessLog);
			}
		}
		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}

	public static CallUrlResponse getUrlService(String responseUrl, String ipe, String type) {
		CallUrlResponse response = new CallUrlResponse();

		URLOutput tbncOutput = new URLOutput(responseUrl, ipe, type);
		
		
		//call converter
		NotesUrl notesUrl = new URLConverter.NotesUrlConverter().convert(tbncOutput);
		response.setNotesUrl(notesUrl);

		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}
	
	public static CallUrlResponse getArrayUrlService(String responseUrl, String sessionId, String ipe,
			String type, int page,HashMap<String,String> alias,  FTPExtractor ftpExtractor) {
		CallUrlResponse response = new CallUrlResponse();
		String name = null;
		String timeHash = String.valueOf(System.currentTimeMillis());
		StringBuilder nameFileGenerated = new StringBuilder().append(sessionId).append("PA").append(timeHash);
		if (ftpExtractor.createLocalFileNotesAndConstancy(responseUrl, nameFileGenerated.toString())) {
			name = nameFileGenerated.toString();
		}
		 StringTokenizer stok = new StringTokenizer(responseUrl, ConsultasWsConstants.CONSTANT_NUMERAL);
		URLOutput tbncOutput = new URLOutput(responseUrl, ipe, type,page,alias);
		//call converter
		NotesUrl notesUrl = new URLConverter.NotesUrlConverter().convert(tbncOutput);
		notesUrl.setFileName(name);
		notesUrl.setTotalRecords(stok.countTokens());
		notesUrl.setHasNextPage(hasNext(stok.countTokens(), page,25));
		response.setNotesUrl(notesUrl);

		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}
	
	public static CallPdfResponse getPdfService(String url) {
		CallPdfResponse response = new CallPdfResponse();

		PDFOutput tbncOutput = new PDFOutput(url);
		
		//call converter
		NotesPdf notesPdf = new PDFConverter.NotesPdfConverter().convert(tbncOutput);
		response.setNotesPdf(notesPdf);

		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;
	}

	public static CallUrlResponse getArrayUrlService(List<String> findResponse, String sessionId, String ipe,
			String type, int page,  FTPExtractor ftpExtractor) {
		CallUrlResponse response = new CallUrlResponse();
		String name = null;
		String timeHash = String.valueOf(System.currentTimeMillis());
		StringBuilder nameFileGenerated = new StringBuilder().append(sessionId).append("PA").append(timeHash);
		if (ftpExtractor.createLocalFileNotesAndConstancy(findResponse, nameFileGenerated.toString())) {
			name = nameFileGenerated.toString();
		}

		URLOutput tbncOutput = new URLOutput(findResponse, ipe, type, page);

		NotesUrl notesUrl = new URLConverter.NotesUrlConverter().convert(tbncOutput);
		notesUrl.setFileName(name);
		notesUrl.setTotalRecords(findResponse.size());
		notesUrl.setHasNextPage(hasNext(findResponse.size(), page,25));
		response.setNotesUrl(notesUrl);
		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
		return response;

	}
	
	public static CallUrlResponse getArrayUrlService(File fileName,int page,String ip, String tipo,HashMap<String,String> alias ){
        Reader in = null;
        CallUrlResponse response = new CallUrlResponse();
        try
        {
            if (fileName.isFile())
            {      
                in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
                StringBuilder sb = new StringBuilder();
                for (int c; (c = in.read()) >= 0;)
                    sb.append((char) c);
                String resp = sb.toString();
                StringTokenizer stok = new StringTokenizer(resp, ConsultasWsConstants.CONSTANT_NUMERAL);         
                URLOutput tbncOutput = new URLOutput(resp, ip, tipo,page,alias);
                NotesUrl notesUrl = new URLConverter.NotesUrlConverter().convert(tbncOutput);
                notesUrl.setFileName(fileName.getName());
        		notesUrl.setTotalRecords(stok.countTokens());
        		notesUrl.setHasNextPage(hasNext(stok.countTokens(),page,25));
        		response.setNotesUrl(notesUrl);
        		response.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
                in.close();
            }
        }
        catch (Exception e)
        {
            log.error(e.getMessage(),e);
        }
        return response;
	}
	private static boolean hasNext(int total, int nPage, int rowsForPage)
    {
        boolean show = true;
        int maxPosible = (nPage + 1) * rowsForPage;

        if (total <= (maxPosible))
        {
            show = false;
        }
        return show;
    }
	
	public static ReaderAliasUserAccountsResponseNC generateReaderAliasUserAccountsResponse(Map<String, Trama> tramasGenering, String sessionId, FTPExtractor ftpExtractor)
    {

        ReaderAliasUserAccountsResponseNC aliasUserAccountsResponse = new ReaderAliasUserAccountsResponseNC();
        for (Map.Entry<String, Trama> trama : tramasGenering.entrySet())
        {
            if (trama.getKey() == ConsultasWsConstants.TRLC)
            {
                TRLCOutput trlcOutput = (TRLCOutput) trama.getValue().getOutputBody();
                trlcOutput.readFile(ftpExtractor.downloadFTP(trlcOutput.getFileNameFTP(), sessionId));
                aliasUserAccountsResponse = new TRLCConverter.ConverterOutputToReaderAliasUserAccountsResponseNC().convert(trlcOutput);
            }
        }
        aliasUserAccountsResponse.setStatus(new Status(ConsultasWsConstants.TBK_SUCCESS_CODE, ConsultasWsConstants.TBK_SUCCESS_MESSAGE));
        return aliasUserAccountsResponse;
    }

}
