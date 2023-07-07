package com.local.PdfConverison;


import org.springframework.stereotype.Component;
import com.groupdocs.conversion.Converter;
import com.groupdocs.conversion.options.convert.PdfConvertOptions;
@Component
public class Conversion {

	public void convert() throws Exception {
	
	try {
		
		Converter conv = new Converter("C:\\\\Users\\\\asus\\\\Downloads\\\\file-sample_100kB.docx");
		conv.convert("converted-docx-to-pdf.pdf", new PdfConvertOptions());
		
		
//		File file = new File("Output.pdf");
//		file.delete();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
