package com.local.PdfConverison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
public class PdfConverisonApplication {

	private static final ConversionClass conversionClass = new ConversionClass();
	private final static Conversion conversion = new Conversion(); 
	
	public static void main(String[] args) {
		SpringApplication.run(PdfConverisonApplication.class, args);
		try {
			conversionClass.convert();
			conversion.convert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
