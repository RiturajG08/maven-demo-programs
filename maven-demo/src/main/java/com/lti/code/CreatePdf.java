package com.lti.code;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdf {

	public static void main(String[] args) throws Exception {
		Document document = new Document();
	    PdfWriter.getInstance(document, new FileOutputStream("f:/hello.pdf"));
	    document.open();
	    document.add(new Paragraph("Hello World!"));
	    document.add(new Paragraph("Bye see you soon !"));
	    document.close();
	    System.out.println("pdf generated successfully");
	}
}
