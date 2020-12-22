package com.lti.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdfDemo {

	public static void main(String[] args) {
		Document document = new Document();
		
		try {
			FileOutputStream out = new FileOutputStream("hello.pdf");
			PdfWriter writer = PdfWriter.getInstance(document, out);
			
			document.open();
			Paragraph para =  new Paragraph("Hello World");
			document.add(para);
			document.close();
			
			writer.close();
			
		} catch (DocumentException e)
		{
			e.printStackTrace();
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
