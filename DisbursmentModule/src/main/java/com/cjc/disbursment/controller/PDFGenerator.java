package com.cjc.disbursment.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.example.demo.model.Customer;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {
	private static Logger logger = LoggerFactory.getLogger(PDFGenerator.class);

	public static ByteArrayInputStream customerPDFReport(com.cjc.disbursment.model.Customer customers) {
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		try {

			PdfWriter.getInstance(document, out);
			document.open();

			Paragraph paragraph1 = new Paragraph();

			paragraph1.setSpacingBefore(100);

			document.add(paragraph1);

			document.add(new Paragraph("To,\n" + " Mr./Mrs./Miss :-" + customers.getCust_name() + "\n"
					+ " S/O :-________________________\n" + " Current Address :" + customers.getCust_address() + "\n"
					+ " Email id:-" + customers.getEmailid() + "\n\n" +

					" We refer to your application for a Two/three/four Wheeler Loan from VLS PVT LTD\n\n"));

			PdfPTable table = new PdfPTable(4);
			PdfPCell c1 = new PdfPCell(new Phrase("Make"));
			table.addCell(c1);

			PdfPCell c2 = new PdfPCell(new Phrase("Model"));
			table.addCell(c2);

			PdfPCell c3 = new PdfPCell(new Phrase("Dealer Name"));
			table.addCell(c3);

			PdfPCell c4 = new PdfPCell(new Phrase("SubDealer Name"));
			table.addCell(c4);
			table.setHeaderRows(1);

			table.addCell("" + customers.getCustomerid());
			table.addCell("" + customers.getCust_name());
			table.addCell("" + customers.getCust_address());
			table.addCell("" + customers.getEmailid());

			document.add(table);

			document.add(new Paragraph(
					"We are pleased to inform you that your application has been approved on the terms and condition as lister below:\n\n"));

			PdfPTable table1 = new PdfPTable(6);
			PdfPCell c11 = new PdfPCell(new Phrase("Cost of vehicle"));
			table.addCell(c1);

			PdfPCell c12 = new PdfPCell(new Phrase("Tenure"));
			table.addCell(c2);

			PdfPCell c13 = new PdfPCell(new Phrase("Monthly EMI"));
			table.addCell(c3);

			PdfPCell c14 = new PdfPCell(new Phrase("Advance EMI"));
			table.addCell(c4);

			PdfPCell c15 = new PdfPCell(new Phrase("Down payment"));
			table.addCell(c4);

			PdfPCell c16 = new PdfPCell(new Phrase("Amount payable by VLS to dealer"));
			table.addCell(c4);
			table.setHeaderRows(1);

			table.addCell("1");
			table.addCell("hero");
			table.addCell("xyz");
			table.addCell("aaa");
			table.addCell("1");
			table.addCell("hero");

			document.add(table);

			document.add(new Paragraph(
					"You are requested to make the down-payment as mentioned, directly to the dealer and take receipt for the same.\n"
							+ "This 'Offer Of Letter' order is valid for a period of 7 days from the date of issuance of this letter.\n"
							+ "Kindly contact your dealer to avail your Vehicle Loan Services PVT LTD loan.\n\n"));

			document.add(new Paragraph("FOR\n" + "VLS PVT LTD\n" + "AAAAAAAA\n" + "\n\n"
					+ "Vehicle loan services PVT LTD\n" + "408,Shree Complex,\n" + "AKURDI-411061\n" + "PUNE."));
			document.close();
		} catch (DocumentException e) {
			logger.error(e.toString());
		}

		return new ByteArrayInputStream(out.toByteArray());
	}
}