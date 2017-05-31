
package pe.com.scotiabank.tbk.consultas.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.com.scotiabank.tbk.util.utilities.Functions;

@Controller
@RequestMapping("/")
public class DownloadFileController
{

    private static final String CONTENT_TYPE_DEFAULT = "application/octec-stream";
    private static final String CONTENT_DISPOSITION = "content-disposition";
    private static final String CONTENT_ATACHMENT = "attachment; filename=";

    @RequestMapping(value = "exportFile/{fileName:.+}", method = RequestMethod.POST)
    public void index(@PathVariable("fileName") String fileName, HttpServletResponse response) throws Exception
    {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        String filePath = Functions.getValueFromProperties("export.path").concat(fileName);
        File file = new File(filePath);

        response.setContentType(CONTENT_TYPE_DEFAULT);
        response.setHeader(CONTENT_DISPOSITION, CONTENT_ATACHMENT + fileName);

        try
        {
            inputStream = new FileInputStream(file);
            outputStream = response.getOutputStream();
            Long lengthFile = file.length();
            byte bytes[] = new byte[lengthFile.intValue()];
            int c = 0;

            while ((c = inputStream.read(bytes, 0, bytes.length)) > 0)
            {
                outputStream.write(bytes, 0, c);
                outputStream.flush();
            }

            inputStream.close();
            outputStream.close();

        }
        catch (Exception exception)
        {
            throw exception;
        }
    }
    
  
}
