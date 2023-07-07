package com.local.PdfConverison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
public class PdfConverisonApplication {

	private static final ConversionClass conversionClass = new ConversionClass();
	
	public static void main(String[] args) {
		SpringApplication.run(PdfConverisonApplication.class, args);
		try {
			conversionClass.convert();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
