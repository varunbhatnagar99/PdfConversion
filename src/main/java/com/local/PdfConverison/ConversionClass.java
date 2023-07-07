package com.local.PdfConverison;

import java.io.File;

import org.springframework.stereotype.Component;

import com.aspose.words.*;

@Component
public class ConversionClass {

	public void convert() throws Exception {
	
	try {
		Document doc = new Document("C:\\Users\\asus\\Downloads\\file-sample_100kB.docx");
		SaveOutputParameters save = doc.save("Output.pdf");
		System.out.println(save.getContentType());
//		File file = new File("Output.pdf");
//		file.delete();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
